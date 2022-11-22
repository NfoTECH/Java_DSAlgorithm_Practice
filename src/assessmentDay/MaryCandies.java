package assessmentDay;
//
//Mary has N candies. The i-th candy is of a type represented by an integer T[i].
//
//        Mary's parents told her to share the candies with her brother. She must give him exactly half the candies. Fortunately, the number of candies N is even..
//
//        After giving away half the candies, Mary will eat the remaining ones. She likes variety, so she wants to have candies of various types. Can you find the maximum number of different types of candy that Mary can eat?
//
//        Write a function:
//
//class Solution { public int solution (int[] T); }
//
//that, given an array T of N integers, representing all the types of candies, returns the maximum possible number of different types of candy that Mary can eat after she has given N/2 candies to her brother.
//
//        For example, given:
//
//        T = [3, 4, 7, 7, 6, 6]
//
//        the function should return 3. One optimal strategy for Mary is to give away one candy of type 4, one of type 7 and one of type 6. The remaining candies would be 13,7,6): three candies of different types.
//
//        Given:
//
//        T= [80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789]
//
//        the function should also return 3. Here, Mary starts with ten candies. She can give away five candies of type 80 and the remaining candies would be [1000000000, 123456789, 80, 80, 80]. There are only three different types in total, l.e. 80, 1000000000 and 123456789.
//


import java.util.HashSet;
import java.util.Set;

public class MaryCandies {
    public int solution(int[] T) {
        // write your code in Java SE 8
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < T.length; i++) {
            set.add(T[i]);
        }
        if (set.size() > T.length / 2) {
            result = T.length / 2;
        } else {
            result = set.size();
        }
        return result;
    }

    public static void main(String[] args) {
        MaryCandies MaryCandies = new MaryCandies();
        int[] S = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        int[] T = {3,4,7,7,6,6};
        System.out.println(MaryCandies.solution(S));
        System.out.println(MaryCandies.solution(T));
    }
}

