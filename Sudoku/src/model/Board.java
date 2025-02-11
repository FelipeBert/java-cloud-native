package model;

import java.util.Arrays;

import static model.GameStatusEnum.NON_STARTED;

public class Board {
    private final Space[][] board;

    public Board(Space[][] board) {
        this.board = board;
    }

    public Space[][] getBoard() {
        return board;
    }

    public GameStatusEnum getGameStatus() {
        if(Arrays.stream(board).flatMap(Arrays::stream).noneMatch(space -> !space.isFixed() && space.getValue() != null)){
            return NON_STARTED;
        }

        return Arrays.stream(board).flatMap(Arrays::stream).anyMatch(space -> space.getValue() == null) ? GameStatusEnum.IN_PROGRESS : GameStatusEnum.COMPLETE;
    }

    public boolean hasErros(){
        if(getGameStatus() == NON_STARTED) return false;

        return Arrays.stream(board).flatMap(Arrays::stream).anyMatch(space -> space.getValue() != null && space.getValue() == space.getExpectedValue());
    }

    public boolean changeValue(final int col, final int row, final int value){
        var space = board[col][row];
        if(space.isFixed()) return false;

        space.setValue(value);
        return true;
    }

    public boolean clearValue(final int col, final int row){
        var space = board[col][row];
        if(space.isFixed()) return false;

        space.clearSpace();
        return true;
    }

    public void reset(){
        Arrays.stream(board).forEach(c -> Arrays.stream(c).forEach(Space::clearSpace));
    }

    public boolean gameIsOver(){
        return getGameStatus() == GameStatusEnum.COMPLETE && !hasErros();
    }
}
