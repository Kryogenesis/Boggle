import java.util.*;
public class Board {

    char[][] letterGrid;
    int size;

    public Board(int size) {
        letterGrid = new char[size][size];
        this.size = size;
        if (size == 4) {
            
            ArrayList<char[]> dice = new ArrayList<>();

            dice.add((new char[] {'R', 'I', 'F', 'O', 'B', 'X'}));
            dice.add((new char[] {'E', 'I', 'F', 'H', 'E', 'Y'}));
            dice.add((new char[] {'D', 'E', 'N', 'O', 'W', 'S'}));
            dice.add((new char[] {'D', 'N', 'K', 'O', 'T', 'U'}));
            dice.add((new char[] {'H', 'M', 'S', 'O', 'R', 'A'}));
            dice.add((new char[] {'L', 'U', 'P', 'E', 'T', 'S'}));
            dice.add((new char[] {'A', 'I', 'C', 'O', 'T', 'A'}));
            dice.add((new char[] {'Y', 'L', 'G', 'K', 'U', 'E'})); //dice 7
            dice.add((new char[] {'Q', 'B', 'M', 'O', 'J', 'A'}));
            dice.add((new char[] {'E', 'H', 'I', 'S', 'P', 'N'}));
            dice.add((new char[] {'V', 'I', 'E', 'G', 'T', 'N'}));
            dice.add((new char[] {'A', 'I', 'B', 'L', 'T', 'Y'})); //dice 11
            dice.add((new char[] {'A', 'E', 'Z', 'V', 'N', 'D'}));
            dice.add((new char[] {'A', 'R', 'L', 'E', 'S', 'C'}));
            dice.add((new char[] {'U', 'I', 'W', 'L', 'R', 'G'}));
            dice.add((new char[] {'A', 'P', 'C', 'E', 'M', 'D'}));
            
            Collections.shuffle(dice);

            int die = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    letterGrid[i][j] = dice.get(die++)[((int) Math.random()*6)];
                }
            }

        }

        else if (size == 5) {

            //same thing as for size == 4
            ArrayList<char[]> dice = new ArrayList<>();

            dice.add((new char[] {'Q', 'B', 'Z', 'J', 'X', 'K', }));
            dice.add((new char[] {'T', 'O', 'U', 'O', 'T', 'O', }));
            dice.add((new char[] {'O', 'V', 'W', 'R', 'G', 'R', }));
            dice.add((new char[] {'A', 'A', 'A', 'F', 'S', 'R', }));
            dice.add((new char[] {'A', 'U', 'M', 'E', 'E', 'G', }));
            dice.add((new char[] {'H', 'H', 'L', 'R', 'D', 'O', }));
            dice.add((new char[] {'N', 'H', 'D', 'T', 'H', 'O', }));
            dice.add((new char[] {'L', 'H', 'N', 'R', 'O', 'D', }));
            dice.add((new char[] {'A', 'F', 'A', 'I', 'S', 'R', }));
            dice.add((new char[] {'Y', 'I', 'F', 'A', 'S', 'R', }));
            dice.add((new char[] {'T', 'E', 'L', 'P', 'C', 'I', }));
            dice.add((new char[] {'S', 'S', 'N', 'S', 'E', 'U', }));
            dice.add((new char[] {'R', 'I', 'Y', 'P', 'R', 'H', }));
            dice.add((new char[] {'D', 'O', 'R', 'D', 'L', 'N', }));
            dice.add((new char[] {'C', 'C', 'W', 'N', 'S', 'T', }));
            dice.add((new char[] {'T', 'T', 'O', 'T', 'E', 'M', }));
            dice.add((new char[] {'S', 'C', 'T', 'I', 'E', 'P', }));
            dice.add((new char[] {'E', 'A', 'N', 'D', 'N', 'N', }));
            dice.add((new char[] {'M', 'N', 'N', 'E', 'A', 'G', }));
            dice.add((new char[] {'U', 'O', 'T', 'O', 'W', 'N', }));
            dice.add((new char[] {'A', 'E', 'A', 'E', 'E', 'E', }));
            dice.add((new char[] {'Y', 'I', 'F', 'P', 'S', 'R', }));
            dice.add((new char[] {'E', 'E', 'E', 'E', 'M', 'A', }));
            dice.add((new char[] {'I', 'T', 'I', 'T', 'I', 'E', }));
            dice.add((new char[] {'E', 'T', 'I', 'L', 'I', 'C', }));

            Collections.shuffle(dice);

            int die = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    letterGrid[i][j] = dice.get(die++)[((int) Math.random()*6)];
                }
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
        Board board = new Board(4);
        board.printBoard();
        Board board2 = new Board(5);
        board2.printBoard();
    }


}

//different scoring options, scoring class or variable (stored as string or boolean maybe)
//i.e. 1 point for every word, points for length of the word
//timer
//check if the word has already been submitted (in player's found hashset)
//check if the word is in the dictionary first, cause that's faster
//check if the word is available on the board
//based on the result of the previous two checks, print something on the screen, either an error or score
//when the size is 4, q will be its own character, but will display on front end and function as "Qu" 
//when forming words
