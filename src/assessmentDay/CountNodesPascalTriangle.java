package assessmentDay;

//On the sequence of logical values (true or false) we can build up an OR-Pascal-triangle structure.
//        Instead of summing the values, as in a standard Pascal-triangle, we will combine them using the OR function.
//        That means that the lowest row is simply the input sequence,
//        and every entry in each subsequent row is the OR of the two elements below it.
//        For example, the OR-Pascal-triangle built on the array [true, false, false, true, false] is as follows:
//Your job is to count the number of nodes in the OR-Pascal-triangle that contain the value true (this number is 11 for the picture above).
//        Write efficient function:
//class Solution { public int solution(boolean[] P); }
//that, given an array P of N Booleans, returns the number of fields in the OR-Pascal-triangle built on P that contain the value true.
//        For example, given P = [true, false, true, false, true, true, false, true], the function should return 17, as explained above.
//        Assume that:
//        N is an integer within the range [1..100,000];
//        each element of array P is a Boolean value (true or false).
//        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
public class CountNodesPascalTriangle {
    class Solution {
        public int solution(boolean[] P) {
            int n = P.length;
            boolean[][] triangle = new boolean[n][n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                triangle[n-1][i] = P[i];
                if (P[i]) count++;
            }
            for (int i = n-2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = triangle[i+1][j] || triangle[i+1][j+1];
                    if (triangle[i][j]) count++;
                }
            }
            return count;
        }
    }

    //THE BELOW SOLUTION GIVES OUTPUT OF 36 WHILE THE ABOVE SOLUTION GIVES OUTPUT OF 33 INSTEAD OF 17
//    class Solution {
//        public int solution(boolean[] P) {
//            int n = P.length;
//            boolean[][] triangle = new boolean[n][n];
//            for (int i = 0; i < n; i++) {
//                triangle[n-1][i] = P[i];
//            }
//            int count = n;
//            for (int i = n-2; i >= 0; i--) {
//                for (int j = 0; j <= i; j++) {
//                    triangle[i][j] = triangle[i+1][j] || triangle[i+1][j+1];
//                    if (triangle[i][j]) count++;
//                }
//            }
//            return count;
//        }
//    }


    public static void main(String[] args) {
        CountNodesPascalTriangle v = new CountNodesPascalTriangle();
        boolean[] P = {true, false, true, false, true, true, false, true};
        System.out.println(v.new Solution().solution(P));
    }
}

