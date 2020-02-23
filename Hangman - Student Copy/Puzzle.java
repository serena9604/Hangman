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
    ArrayList<String> theWord = new ArrayList<String>();

    public Puzzle() {
        //picks combination of words and blanks to show
        words = new ArrayList<String>();
        //puzzle = new ArrayList<String>();

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

        for (int k = 0; k < tempWord.length(); k ++) {
            theWord.add(k, tempWord.substring(k, k + 1));
            //puzzle.add(k, "_");
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
        //junk code
        //replaced with show function
        for (int i = 0; i < p.size(); i ++) {
            System.out.println(p.get(i));
        }
    }

    public void show () {
        //shows combination of words and blanks chosen in Puzzle
        for (int i = 0; i < theWord.size(); i ++) {
            if (puzzle.contains(theWord.get(i))){
                System.out.print(theWord.get(i));
            } else System.out.print("_");
        }
        System.out.println();
        System.out.print("You're guesses are: ");
        for (int i = 0; i < guesses.size(); i ++) {
            if (i == 0) {
                System.out.print(guesses.get(i));
            } else {
                System.out.print(", " + guesses.get(i));
            }
        }

    }

    public boolean isUnsolved() {
        //checks to see if you have guessed all the letters in the puzzle or not
        /*  int sum = 0;
        for (int i = 0; i < guesses.size(); i ++) {
        for (int j = 0; j < puzzle.size(); j ++) {
        if (puzzle.get(j) == guess.get(i)) {
        sum ++;
        }
        }
        }
        if (sum == puzzle.size() && sum > 0) return false;
        else return true;
         */
        if (puzzle.size() == theWord.size() && puzzle.size() > 0) return false;
        else return true;
    }

    public boolean makeGuess(String g) {
        //makes the guess
        //adds to collection of guessed letters: can make it ArrayList OR String
        //when code puzzle, print underscore if letter not in list of guesses and print letter letter if in list of guesses
        boolean correct = false;
        guesses.add(g);
        if (theWord.contains(g)) {
            puzzle.add(g);
            return true;
        }
        else return false;
    }

    public String getWord() {
        //gets the word from the file
        return tempWord;
    }

}
