package rocks.zipcodewilmington.tictactoe;

import java.util.Scanner;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix)
    {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if ("X".equals(playertoWin())) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner()
    {
        return null;
    }

    private String playertoWin() {
        if (matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2] && matrix[0][0] != ' ')
        { //row 0
            return (matrix[0][0]).toString(); //"X" or "O"
        } else if (matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2] && matrix[1][0] != ' ')
        { //row 1
            return (matrix[1][0]).toString(); //"X" or "O"
        } else if (matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2] && matrix[2][0] != ' ')
        { //row 2
            return (matrix[2][0]).toString(); //"X" or "O"
        } else if (matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0] && matrix[0][0] != ' ')
        { //column 0
            return (matrix[0][0]).toString(); //"X" or "O"
        } else if (matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1] && matrix[0][1] != ' ')
        { //column 1
            return (matrix[0][1]).toString(); //"X" or "O"
        } else if (matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2] && matrix[0][2] != ' ')
        { //column 2
            return (matrix[0][2]).toString(); //"X" or "O"
        } else if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] && matrix[0][0] != ' ')
        { //top-left -> bottom-right diagonal
            return (matrix[0][0]).toString(); //"X" or "O"
        } else if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[0][2] != ' ')
        { //top-right -> bottom-left diagonal
            return (matrix[0][2]).toString(); //"X" or "O"
        }
        else
        {
            return "";
        }
    }
}