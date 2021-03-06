import java.util.Scanner;

/**
 * Write a description of class Nim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim
{
    /**
     * stonesRemaining
     * int. Represents the number of stones that haven't yet been removed. 
     * You should initialize this in setupGame().
     * 
     * activePlayer
     * int. Represents the currently active player. Encoded as 1 for 
     * Player One and 2 for Player Two. Initialize this in setupGame() by 
     * "flipping a coin".
     * 
     * quit
     * boolean. Represents if the player has chosen to quit the game (true) 
     * or not (false). Initialized to false in run(), can be altered in 
     * processResult().
     * 
     * sc
     * Scanner. The tool used to get user input.
     */
    private static int stonesRemaining; 
    private static int activePlayer; 
    private static boolean quit;
    private static Scanner sc;

    /**
     * Prints a simple greeting. Be as creative as you want here. Be sure to 
     * include your name as the author!
     */
    public static void printGreeting() {

    }

    /**
     * Initialize stonesRemaining to whatever value you'd like the game to 
     * start with (10 is good). Then initialize activePlayer by simulating a 
     * coin flip to decide who will go first. To simulate a coin flip, 
     * generate a random integer between 0 and 1 (inclusive).
     * 
     * Here's how you generate random integers in general:
     * (int) Math.floor(Math.random() * (max - min + 1) + min)
     * 
     * Here's how you simulate a coin flip:
     * (int) Math.floor(Math.random() * (2 - 1 + 1) + 1)
     * ...which can be simplified to:
     * (int) Math.floor(Math.random() * 2 + 1)
     */
    public static void setupGame() {

    }

    /**
     * Print a visual representation of the number of stones remaining 
     * (e.g., a line of "O" characters), along with a message that conveys 
     * this same information.
     * 
     * Hint: Create a local string variable and use a for loop to concatenate 
     * "O " to it every iteration!
     */
    public static void printStones() {

    }

    /**
     * This function is the "workhorse" of the program. It is called 
     * repeatedly in run() until there are no more stones remaining.
     * 
     * It first asks the currently active player (as denoted by activePlayer) 
     * to enter the number of stones they would like to remove. Players 
     * should only be allowed to enter values 1, 2, or 3. If they enter any 
     * other value, the program should lightly scold them and then ask again, 
     * and continue to do so until they enter a valid number.
     * 
     * Moreover, if players enter a valid number but there aren't that many 
     * stones remaining (e.g., they enter 3 but there are only 2 stones 
     * remaining), the program should tell them this, then ask for input 
     * again, just like above.
     * 
     * When players have finally entered an acceptable number, this function
     * should subtract that number from stonesRemaining, and switch 
     * activePlayer to the other player.
     */
    public static void removeStones() {

    }

    /**
     * This function is called in run() when there are no more stones 
     * remaining. It first prints a "Player X Wins!" message, depending on 
     * who the currently active player is (this was switched at the end of 
     * the last call to removeStones()). Note that whoever removes the last 
     * stone loses, which is already accounted for if you wrote 
     * removeStones() correctly!
     * 
     * This function then asks players if they would like to keep playing. 
     * If players choose yes, nothing happens here. If players choose no, 
     * quit is set to true. The rest is handled in run().
     */
    public static void processResult() {

    }

    /**
     * This is the function that calls all the other functions. Here is what
     * it should do, in order:
     * 
     * 1: Print a greeting.
     * 2: Initialize the sc variable to a new scanner for user input.
     * 2: Initialize quit to false.
     * 3: As long as quit is false, continue running the following:
     *      A. Set up the game.
     *      B. As long as there are stones remaining, continue running the 
     *         following:
     *          I. Print the stones remaining.
     *          II. Ask players to remove stones.
     *      C. There are no more stones remaining, so process results here.
     * 4. quit is true, so print a goodbye message here.
     */
    public static void main(String[] args) {

    }
}
