package assessmentDay;

//        You have to organize a chess tournament in which players will compete heat to-head
//
//        Here is how we proceed to form the duels select a first player randomly, then select his opponent at random among the remaining participants: The pair of competitors obtanest forms one of the duels of the tournament. We d in the same manner to form all the other pairs
//
//        In this exercise, we would like to know how many pairs it is possible to form a
//
//        in a pair does not matter.
//
//        For example, with 4 players named A Cand Disple to get different pas ALL AC AD co
//
//        implements to returns the number of possible pats. Parameter compounds to the number of s
//
//        Try to optimize your solution so that ideally the duration of treatment is the same for ays

public class ChessTournament {
    public static int count(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(1000));
    }
}
