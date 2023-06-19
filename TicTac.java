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

    static void p_holder (char [] []g_board, int pos, String user){
        char syb ='X';
        if(user.equals("You"))
        {
            syb ='X';
        }
        else if(user.equals("Com"))
        {
            syb='O';
        }

        switch(pos)
        {
            case 1:
            g_board[0][0]=syb;
            break;
            case 2:
            g_board[0][2]=syb;
            break;
            case 3:
            g_board[0][4]=syb;
            break;
            case 4:
            g_board[2][0]=syb;
            break;
            case 5:
            g_board[2][2]=syb;
            break;
            case 6:
            g_board[2][4]=syb;
            break;
            case 7:
            g_board[4][0]=syb;
            break;
            case 8:
            g_board[4][2]=syb;
            break;
            case 9:
            g_board[4][4]=syb;
            break;

            default:
            System.out.println("invalid input");

        }

        print_board(g_board);
    }
}