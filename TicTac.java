import java.io.*;
import java.util.*;

class TicTac {
    public static void main(String[] args) {
        char[][] g_board = {
                { ' ', '|', ' ', '|', ' ' },
                { '-', '|', '-', '|', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '|', '-', '|', '-' },
                { ' ', '|', ' ', '|', ' ' }

        };
        print_board(g_board);
    }

    static void print_board(char[][] g_board) {
        for (int i = 0; i < g_board.length; i++) {
            for (int j = 0; j < g_board.length; j++) {
                System.out.print(g_board[i][j]);
            }
            System.out.println();

        }
    }

}