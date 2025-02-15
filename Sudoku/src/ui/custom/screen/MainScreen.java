package ui.custom.screen;

import service.BoardService;
import service.EventEnum;
import service.NotifierService;
import ui.custom.button.CheckGameStatusButton;
import ui.custom.button.FinishGameButton;
import ui.custom.button.ResetButton;
import ui.custom.frame.MainFrame;
import ui.custom.input.NumberText;
import ui.custom.panel.MainPanel;
import model.Space;
import ui.custom.panel.SudokuSector;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainScreen {

    private final static Dimension dimension = new Dimension(600, 600);

    private final BoardService boardService;
    private final NotifierService notifierService;

    private JButton finishGameButton;
    private JButton checkGameStatusButton;
    private JButton resetButton;

    public MainScreen(final Map<String, String> gameConfig) {
        this.boardService = new BoardService(gameConfig);
        this.notifierService = new NotifierService();
    }

    public void buildMainScreen(){
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);

        for (int i = 0; i < 9; i+=3) {
            var endRow = i + 2;
            for (int j = 0; j < 9; j+=3) {
                var endCol = j + 2;
                var spaces = getSpaceFromSector(boardService.getSpace(), j, endCol, i, endRow);
                mainPanel.add(generateSection(spaces));
            }
        }

        addResetButton(mainPanel);
        addCheckGameStatusButton(mainPanel);
        addFinishGameButton(mainPanel);

        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private Space[] getSpaceFromSector(final Space[][] spaces,
                                       final int initCol,
                                       final int endCol,
                                       final int initRow,
                                       final int endRow){
        List<Space> spaceSector = new ArrayList<>();

        for (int r = initRow; r <= endRow; r++) {
            for (int c = initCol; c <= endCol; c++) {
                spaceSector.add(spaces[r][c]);
            }
        }
        return spaceSector.toArray(new Space[0]);
    }


    private JPanel generateSection(final Space[] spaces){
        List<NumberText> fields = new ArrayList<>(Arrays.stream(spaces).map(NumberText::new).toList());
        fields.forEach(t -> notifierService.subscribe(EventEnum.CLEAR_SPACE, t));
        return new SudokuSector(fields);
    }

    private void addFinishGameButton(JPanel mainPanel) {
        finishGameButton = new FinishGameButton(e -> {
            if(boardService.gameIsFinished()){
                JOptionPane.showConfirmDialog(null, "Parabéns, você completou o jogo!");
                resetButton.setEnabled(false);
                checkGameStatusButton.setEnabled(false);
                finishGameButton.setEnabled(false);
            } else {
                JOptionPane.showConfirmDialog(null, "Seu Jogo possui alguma inconsistência, Cheque Novamente!");
            }
        });

        mainPanel.add(finishGameButton);
    }

    private void addCheckGameStatusButton(JPanel mainPanel) {
        checkGameStatusButton = new CheckGameStatusButton(e -> {
            var erros = boardService.hasErros();
            var gameStatus = boardService.getStatus();

            var message = switch (gameStatus) {
                case NON_STARTED -> "O jogo ainda não começou!";
                case IN_PROGRESS -> "O jogo ainda não acabou!";
                case COMPLETE -> "O jogo acabou!";
                default -> "Opção Invalida!";
            };

            message += erros ? " Contem erros!" : " Não contem erros!";
            JOptionPane.showConfirmDialog(null, message);
        });

        mainPanel.add(checkGameStatusButton);
    }

    private void addResetButton(JPanel mainPanel) {
        resetButton = new ResetButton(e -> {
            var dialogResult = JOptionPane.showConfirmDialog(null,
                    "Deseja Realmente Reinicar o jogo?",
                    "Reiniciar Jogo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (dialogResult == 0){
                boardService.reset();
                notifierService.notify(EventEnum.CLEAR_SPACE);
            }
        });
        mainPanel.add(resetButton);
    }
}
