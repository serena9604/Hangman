import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    //display of letters and blanks
    String s;
    public Puzzle() {
        //picks combination of words and blanks to show
    }

    public void show () {
        //shows combination of words and blanks chosen in Puzzle
    }

    public boolean isUnsolved() {
        //checks too see if you have guessed all the letters in the puzzle or not
        return true;
    }

    public boolean makeGuess(String g) {
        //makes the guess
        //adds to collection of guessed letters: can make it ArrayList OR String
        //when code puzzle, print underscore if letter not in list of guesses and print letter letter if in list of guesses
        return false;
    }

    public String getWord() {
        //gets the word from the file
        return "";
    }
}
