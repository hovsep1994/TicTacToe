package com.aca.tictactoe;

public class Board {

    public static final String EMPTY = "-";
    public static final String X = "X";
    public static final String O = "O";

    private String[][] boardArray;

    public Board() {
        boardArray = new String[3][3];
        for (String[] row : boardArray) {
            for (int i = 0; i < row.length; i++) {
                row[i] = EMPTY;
            }
        }
    }

    public void makeMove(int x, int y, String sign) {
        String cell = boardArray[x][y];
        if (isNotEmpty(cell)) {
            System.out.println("Cell is not empty, please try again");
        }
        boardArray[x][y] = sign;
    }

    public void printBoard() {
        for (String[] row : boardArray) {
            System.out.println();
            for (String cell : row) {
                System.out.print(cell);
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public String isGameOver() {
        for (String[] row : boardArray) {
            if (StringUtils.areEqual(row[0], row[1], row[2]) && StringUtils.areNotEqual(row[0], EMPTY)) {
                return row[0];
            }
        }
        for (int i = 0; i < boardArray.length; i++) {
            if (StringUtils.areEqual(boardArray[0][i], boardArray[1][i], boardArray[2][i]) && isNotEmpty(boardArray[0][i])) {
                return boardArray[0][i];
            }
        }
        if (StringUtils.areEqual(boardArray[0][0], boardArray[1][1], boardArray[2][2]) && isNotEmpty(boardArray[0][0])) {
            return boardArray[0][0];
        }
        if (StringUtils.areEqual(boardArray[0][2], boardArray[1][1], boardArray[2][0]) && isNotEmpty(boardArray[1][1])) {
            return boardArray[1][1];
        }
        return EMPTY;
    }

    private static boolean isNotEmpty(String s) {
        return StringUtils.areNotEqual(s, EMPTY);
    }

}
