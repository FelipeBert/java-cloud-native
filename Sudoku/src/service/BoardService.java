package service;

import model.Board;
import model.GameStatusEnum;
import model.Space;

import java.util.Map;

public class BoardService {

    private final static int BOARD_LIMIT = 9;

    private final Board board;

    public BoardService(final Map<String, String> gameConfig) {
        this.board = new Board(initBoard(gameConfig));
    }

    public Space[][] getSpace(){
        return this.board.getBoard();
    }

    public void reset(){
        this.board.reset();
    }

    public boolean hasErros(){
        return this.board.hasErros();
    }

    public GameStatusEnum getStatus(){
        return this.board.getGameStatus();
    }

    public boolean gameIsFinished(){
        return this.board.gameIsOver();
    }

    private Space[][] initBoard(Map<String, String> gameConfig) {
        Space[][] spaces = new Space[BOARD_LIMIT][BOARD_LIMIT];

        for(int i = 0; i < BOARD_LIMIT; i++){
            for(int j = 0; j < BOARD_LIMIT; j++){
                var positionConfig = gameConfig.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces[i][j] = currentSpace;
            }
        }
        return spaces;
    }
}
