package guessGame;

public class GuessGame {
    Player p1;          // GuessGame has three instance variables for the three Player objects
    Player p2;
    Player p3;
    public void startGame() {   // create three Player objects and assign them to the three Player instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;    // declare three variables to hold the three guesses the Players make
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false; // declare three variables to hold a true or false based on the player's answer
        boolean p2IsRight = false; // set the initial values to false
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);  // generate a 'target' number that the players have to guess
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();     // call each player's guess() method
            p2.guess();
            p3.guess();

            guessP1 = p1.number;    // get each player's guess (the result of their guess() method running)
            System.out.println("Player one guessed " + guessP1); //by accessing the number variable of each player

            guessP2 = p2.number;
            System.out.println("Player two guessed " + guessP2);

            guessP3 = p3.number;
            System.out.println("Player three guessed " + guessP3);

            if (guessP1 == targetNumber) {  // check each player's guess to see if it matches the target number.
                p1IsRight = true;   // If a player is right, then set that player's variable to be true
            }                       // remember we set it false by default
            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessP3 == targetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) { // If any of the players is right print output and break;
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Player three got it right? " + p3IsRight);
                System.out.println("Game is over");
                break;
            } else {                // otherwise stay in the loop and ask players to guess again
                System.out.println("Players will have to try again.");
            }
        }
    }
}
