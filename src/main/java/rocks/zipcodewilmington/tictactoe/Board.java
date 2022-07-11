package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
//        return null;
            //rows
        if (matrix[0][0].equals('X') && matrix[0][1].equals('X') && matrix[0][2].equals('X')) {
            return true;
        } else if (matrix[1][0].equals('X') && matrix[1][1].equals('X') && matrix[1][2].equals('X')) {
            return true;
        } else if (matrix[2][0].equals('X') && matrix[2][1].equals('X') && matrix[2][2].equals('X')) {
            return true;

            //columns
        } else if (matrix[0][0].equals('X') && matrix[1][0].equals('X') && matrix[2][0].equals('X')) {
            return true;
        } else if (matrix[0][1].equals('X') && matrix[1][1].equals('X') && matrix[2][1].equals('X')) {
            return true;
        } else if (matrix[0][2].equals('X') && matrix[1][2].equals('X') && matrix[2][2].equals('X')) {
            return true;

            //diagonals
        } else if (matrix[0][0].equals('X') && matrix[1][1].equals('X') && matrix[2][2].equals('X')) {
            return true;
        } else if (matrix[0][2].equals('X') && matrix[1][1].equals('X') && matrix[2][0].equals('X')) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
//        return null;
        if (matrix[0][0].equals('O') && matrix[0][1].equals('O') && matrix[0][2].equals('O')) {
            return true;
        } else if (matrix[1][0].equals('O') && matrix[1][1].equals('O') && matrix[1][2].equals('O')) {
            return true;
        } else if (matrix[2][0].equals('O') && matrix[2][1].equals('O') && matrix[2][2].equals('O')) {
            return true;

            //columns
        } else if (matrix[0][0].equals('O') && matrix[1][0].equals('O') && matrix[2][0].equals('O')) {
            return true;
        } else if (matrix[0][1].equals('O') && matrix[1][1].equals('O') && matrix[2][1].equals('O')) {
            return true;
        } else if (matrix[0][2].equals('O') && matrix[1][2].equals('O') && matrix[2][2].equals('O')) {
            return true;

            //diagonals
        } else if (matrix[0][0].equals('O') && matrix[1][1].equals('O') && matrix[2][2].equals('O')) {
            return true;
        } else if (matrix[0][2].equals('O') && matrix[1][1].equals('O') && matrix[2][0].equals('O')) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        return (isInFavorOfO() == false && isInFavorOfX() == false);
    }

    public String getWinner() {
        if (isInFavorOfX() == true) {
            return "X";
        }
        else if (isInFavorOfO() == true) {
            return "O";
        }
        else return "";
    }

}
