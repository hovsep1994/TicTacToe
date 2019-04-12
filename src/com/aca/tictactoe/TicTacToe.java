package com.aca.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static boolean isXTurn = true;

    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        Scanner scanner = new Scanner(System.in);
        String winner;
        do {
            System.out.println("Type coordinates");
            board.makeMove(scanner.nextInt(), scanner.nextInt(), getSign());
            board.printBoard();
            isXTurn = !isXTurn;
            winner = board.isGameOver();
        } while (winner.equals(Board.EMPTY));
        System.out.println();
        System.out.println(winner + " is the winner!");
        board.printBoard();
    }

    private static String getSign() {
        return isXTurn ? Board.X : Board.O;
    }

}
