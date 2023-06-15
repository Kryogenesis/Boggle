import java.util.Collections;
import java.util.*;
public class Board {
    char[][] letterGrid;
    int size;
    public Board(int size) {
        if (size == 4) {
            letterGrid = new char[size][size];
            ArrayList<ArrayList<Character>> dice = new ArrayList<>();
            dice.add(Arrays.asList(new char[] {'R', 'I', 'F', 'O', 'B', 'X'}));
            dice.add(Arrays.asList(new char[] {'E', 'I', 'F', 'H', 'E', 'Y'}));
            dice.add(Arrays.asList(new char[] {'D', 'E', 'N', 'O', 'W', 'S'}));
            dice.add(Arrays.asList(new char[] {'D', 'N', 'K', 'O', 'T', 'U'}));
            dice.add(Arrays.asList(new char[] {'H', 'M', 'S', 'O', 'R', 'A'}));
            dice.add(Arrays.asList(new char[] {'L', 'U', 'P', 'E', 'T', 'S'}));
            dice.add(Arrays.asList(new char[] {'A', 'I', 'C', 'O', 'T', 'A'}));
            dice.add(Arrays.asList(new char[] {'Y', 'L', 'G', 'K', 'U', 'E'}));
            

            Collections.shuffle(dice);
            //initialize the list of dices in a 2d ArrayList, then call collections.shuffle on the 2d
            //iterate from 1 to 16 to assign a dice to each square on the board, as you assign
            //pick a random character from the list of characters on the dice
            int die = 0;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    letterGrid[i][j] = dice.get(die++).get((int) Math.random()*6);
                }
            }
        }
        else if (size == 5) {
            //same thing as for size == 4

            letterGrid = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    letterGrid[i][j] = (char) (((int) (Math.random() * 26)) + 65);
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
        Board board = new Board(5);
        board.printBoard();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int value = 0;
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                sublist.add(value++);
            }
            list.add(sublist);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j ++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }


}

//different scoring options, scoring class or variable (stored as string or boolean maybe)
//i.e. 1 point for every word, points for length of the word
//timer
//check if the word is in the dictionary first, cause that's faster
//check if the word is available on the board
//based on the result of the previous two checks, print something on the screen, either an error or score
//verify the size is between 3 and 6 on the front end side (or in game class perhaps)
//when the size is 4, q will be its own character, but will display on front end and function as "Qu" 
//when forming words
