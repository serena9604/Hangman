public class HangingMan {

    private int numWrongGuesses;
    String [] h = new String[] {""};
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };

    public HangingMan() {
        //draws the tree diagram
        h = new String [] {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };
    }

    public static void printString(String[] h) {
        String breakApart = "";
        for (int r = 0; r < h.length; r ++) {
            System.out.print(h[r] + "Mike" + h.length);

        }
    }

    public void show () {
        //picks which picture to show
        printString(h);
    }

    public void dieSomeMore() {
        //add hangman part (eg leg, arm) to man hanging from tree

    }

    public boolean isntDead(){
        //check to see if hangman is dead or not
        //checks whether all his parts are hanging from tree or not
        return true;
    }
}
