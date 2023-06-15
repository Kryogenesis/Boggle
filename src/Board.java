public class Board {
    char[][] letterGrid;
    int size;
    public Board(int size) {
        this.size = size;
        letterGrid = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                letterGrid[i][j] = (char) (((int) (Math.random() * 26)) + 65);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(letterGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board board = new Board(5);
        board.printBoard();
    }

}

//different scoring options, scoring class or variable (stored as string or boolean maybe)
//i.e. 1 point for every word, points for length of the word
//timer
//check if the word is in the dictionary first, cause that's faster
//check if the word is available on the board
//based on the result of the previous two checks, print something on the screen, either an error or score
//verify the size is between 3 and 6 on the front end side (or in game class perhaps)
