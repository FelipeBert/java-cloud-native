import model.Board;
import model.Space;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;
import static utils.BoardTemplate.BOARD_TEMPLATE;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var positions = Stream.of(args).collect(toMap(
                k -> k.split(";")[0].trim(),
                v -> v.split(";")[1].trim()
        ));

        var option = -1;

        while(true){
            System.out.println("Selecione uma das opções a seguir");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option){
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção Invalida, selecione uma das opções do menu");
            }

        }
    }

    private static void startGame(final Map<String, String> positions) {
        if(board != null){
            System.out.println("O jogo ja foi iniciado");
            return;
        }

        Space[][] spaces = new Space[BOARD_LIMIT][BOARD_LIMIT];

        for(int i = 0; i < BOARD_LIMIT; i++){
            for(int j = 0; j < BOARD_LIMIT; j++){
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces[i][j] = currentSpace;
            }
        }
        board = new Board(spaces);
        System.out.println("Jogo iniciado com sucesso");
    }

    private static void inputNumber() {
        if(board == null){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.println("Informe a coluna em que o numero sera inserido: ");
        var col = runUntilGetValidNumber(0, 8);

        System.out.println("Informe a linha em que o numero sera inserido: ");
        var row = runUntilGetValidNumber(0, 8);

        System.out.printf("\nInforme o numero que sera inserido na posicao [%s, %s]\n", col, row);
        var value = runUntilGetValidNumber(1, 9);

        if(!board.changeValue(col, row, value)){
            System.out.printf("A posição [%s, %s] ja possui um valor, tente novamente\n", col, row);
        }
    }

    private static void removeNumber() {
        if(board == null){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.println("Informe a coluna em que o numero sera inserido: ");
        var col = runUntilGetValidNumber(0, 8);

        System.out.println("Informe a linha em que o numero sera inserido: ");
        var row = runUntilGetValidNumber(0, 8);

        if(!board.clearValue(col, row)){
            System.out.printf("A posição [%s, %s] possui um valor fixo\n", col, row);
        }
    }

    private static void showCurrentGame() {
        if(board == null){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        var args = new Object[81];
        var argPos = 0;

        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (var col: board.getBoard()){
                args[argPos ++] = " " + (col[i].getValue() == null ? " " : col[i].getValue());
            }
        }

        System.out.println("Seu jogo se encontra da seguinte forma: ");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void showGameStatus() {
        if(board == null){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.printf("O jogo atualmente se encontra no status: %s\n", board.getGameStatus().getLabel());
        if(board.hasErros()){
            System.out.println("O jogo atualmente possui erros");
        } else {
            System.out.println("O jogo atualmente nao possui erros, bom jogo!");
        }
    }

    private static void clearGame() {
        if(board == null){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        System.out.println("Tem certeza que deseja limpar o jogo? (S/N)");
        var confirm = scanner.next();

        while(!confirm.equalsIgnoreCase("s") && !confirm.equalsIgnoreCase("n")){
            System.out.println("Informe 's' ou 'n'");
            confirm = scanner.next();
        }

        if(confirm.equalsIgnoreCase("s")) board.reset();
    }

    private static void finishGame() {
        if(board == null){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }
        if (board.gameIsOver()){
            System.out.println("O jogo foi finalizado com sucesso");
            showCurrentGame();
            board = null;
        } else if(board.hasErros()){
            System.out.println("O jogo ainda possui erros, corrija-os antes de finalizar o jogo");
        } else {
            System.out.println("Você ainda precisa preencher o jogo para finalizar");
        }
    }

    private static int runUntilGetValidNumber(final int min, final int max){
        var current = scanner.nextInt();
        while (current < min || current > max){
            System.out.printf("O numero informado esta fora do intervalo permitido, informe um entre %s e %s%n", min, max);
            current = scanner.nextInt();
        }
        return current;
    }

}