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
    ArrayList<String> wordList = new ArrayList<String>();
    ArrayList<String> words= new ArrayList<String>();

    public Puzzle() {
        //picks combination of words and blanks to show
        words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toUpperCase();
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
            for (int j = 0; j < guess.size(); j ++) {
                if (guess.get(i).equals(puzzle.get(j))) puzzle.set(j, guess.get(i)); 
                else puzzle.set(j, "_");
            }
        }

        for (int k = 0; k < tempWord.length(); k ++) {
            puzzle.set(k, tempWord.substring(k, k + 1));
        }
    }

    public static void printString(ArrayList<String> puzzle) {
        for (int i = 0; i < puzzle.size(); i ++) {
            System.out.println(puzzle.get(i));
        }
    }

    public void show () {
        //shows combination of words and blanks chosen in Puzzle
        printString(puzzle);

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
        if (sum == puzzle.size()) return true;
        else return false;
    }

    public boolean makeGuess(String g) {
        //makes the guess
        //adds to collection of guessed letters: can make it ArrayList OR String
        //when code puzzle, print underscore if letter not in list of guesses and print letter letter if in list of guesses
        guess.add(g);
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
