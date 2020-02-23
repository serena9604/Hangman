public class HangingMan {

    private int numWrongGuesses;
    public int lives;
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
        lives = 6;
    }

    public static void printString(String[] h, int r) {
        String breakApart = "";
        /* for (int r = start; r <= 1; r ++) {
        System.out.print(h[r]);
        }
         */
        System.out.print(h[r] + "Mike");
    }

    public void show () {
        //picks which picture to show
        if (lives == 6) {
            //printString(h, 0);
            System.out.print(h[0]);
        } else if (lives == 5) {
            // printString(h, 1);
            System.out.print(h[1]);
        } else if (lives == 4) {
            //printString(h, 2);
            System.out.print(h[2]);
        } else if (lives == 3) {
            //printString(h, 3);
            System.out.print(h[3]);
        } else if (lives == 2) {
            // printString(h, 4);
            System.out.print(h[4]);
        } else if (lives == 1) {
            //printString(h, 5);
            System.out.print(h[5]);
        } 
    }

    public void dieSomeMore() {
        //add hangman part (eg leg, arm) to man hanging from tree
        lives -= 1;
    }

    public boolean isntDead(){
        //check to see if hangman is dead or not
        //checks whether all his parts are hanging from tree or not
        if (lives == 0) return false;
        else return true;
    }
}
