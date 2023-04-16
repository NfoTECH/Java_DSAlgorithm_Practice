package assessmentDay;

//Sam and Alex are playing a new game where there are a number of piles, each with any number of stones in it. Players take turns removing stones from any one pile.
//        The number removed has to be either:
//        1.an integer multiple of a given number, k where k > 0
//        2if there are fewer than k stones in a pile, any number can be removed.
//        Determine who wins the game. Sam always starts, they both play optimally, and the last player to remove a stone wins, If Sam wins, return "Sam wins the game of in pile(s).", where n is the number of piles in the input. If Alex wins, return "Alex wins the game of n pile(s).".
//        For example, a game starts with n * 3 piles of stones that contain piles-[3, 57] stones, and a constant k = 2 Sam will go first and remove 112 stones from the third pile leaving 7- 2-5 stones in that pile
//        In this case, Sam wins so "Sam wins the game of 3 pile(s)." is returned.
//        Function Description
//        Complete the function gameOfPiles in the editor below. The function must return a string that denotes the result of the game.
//        gameOfPiles has the following parameters
//        int piles/n) each piles (where Os represents the number of stones in the pile.
//        int kan integer
//        Constraints
//        1ples's 1000
//        1sks 1000

public class GameOfPiles {
    public static String gameOfPiles(int[] piles, int k) {
        int sum = 0;
        for (int pile : piles) {
            sum += pile;
        }
        if (sum % k == 0) {
            return "Alex wins the game of " + piles.length + " pile(s).";
        } else {
            return "Sam wins the game of " + piles.length + " pile(s).";
        }
    }

    public static void main(String[] args) {
        int[] piles = {8, 8};
        int k = 3;
        System.out.println(gameOfPiles(piles, k));
    }
}
