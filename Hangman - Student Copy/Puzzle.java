import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    //display of letters and blanks
    String s = "";
    String guessedLetters = "";
    String tempWord ="";
    ArrayList<String> guess = new ArrayList<String>();
    ArrayList<String> puzzle = new ArrayList<String>(); 
    ArrayList<String> guesses = new ArrayList<String>();
    ArrayList<String> words= new ArrayList<String>();

    public Puzzle() {
        //picks combination of words and blanks to show
        words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toLowerCase();
                words.add(tempWord);
            }
            scanner.close();

            //ONCE THIS LINE OF CODE IS REACHED, YOUR words ArrayList
            //CONTAINS ALL THE WORDS IN words.txt
            tempWord = words.get((int)(Math.random()*words.size()));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < puzzle.size(); i ++) {
            for (int k = 0; k < tempWord.length(); k ++) {
                puzzle.add(k, tempWord.substring(k, k + 1));
            }
        }
        /* for (int i = 0; i < puzzle.size(); i ++) {
        for (int j = 0; j < guesses.size(); j ++) {
        if (guesses.get(i).equals(puzzle.get(j))) puzzle.set(j, guesses.get(i)); 
        else puzzle.set(j, "_");
        }
        }
         */
    }

    public static void printString(ArrayList<String> p) {
        for (int i = 0; i < p.size(); i ++) {
            System.out.println(p.get(i));
        }
    }

    public void show () {
        //shows combination of words and blanks chosen in Puzzle
        for (int i = 0; i < puzzle.size(); i ++) {
            if (guesses.contains(puzzle.get(i))){
                System.out.print(puzzle.get(i));
            } else System.out.print("_");
            System.out.println("mike");
        }
        System.out.println();
        System.out.print("You're guesses are: ");
        for (int i = 0; i < guess.size(); i ++) {
            if (i == 0) {
                System.out.print(guess.get(i));
            } else {
                System.out.print(", " + guess.get(i));
            }
        }

    }

    public boolean isUnsolved() {
        //checks to see if you have guessed all the letters in the puzzle or not
        int sum = 0;
        for (int i = 0; i < guess.size(); i ++) {
            for (int j = 0; j < puzzle.size(); j ++) {
                if (puzzle.get(j) == guess.get(i)) {
                    sum ++;
                }
            }
        }
        if (sum == puzzle.size()) return false;
        else return true;
    }

    public boolean makeGuess(String g) {
        //makes the guess
        //adds to collection of guessed letters: can make it ArrayList OR String
        //when code puzzle, print underscore if letter not in list of guesses and print letter letter if in list of guesses
        boolean correct = false;
        guesses.add(g);
        if (puzzle.contains(g)) {
            return true;
        }
        else return false;
    }

    public String getWord() {
        //gets the word from the file
        return tempWord;
    }

}
