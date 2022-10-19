package assessmentDay;//There are N coins, each showing either heads or tails. We would like all the coins to form a sequence of alternating heads and tails. What is the minimum number of coins that must be reversed to achieve this?
//
//        Write a function:
//
//class Solution { public int solution (int[] A); }
//
//that, given an array A consisting of N integers representing the coins, returns the minimum number of coins that must be reversed. Consecutive elements of array A represent consecutive coins and contain either a 0 (heads) or a 1 (tails).
//
//        Examples:
//
//        1. Given array A = [1, 0, 1, 0, 1, 1], the function should return 1. After reversing the sixth coin, we achieve an alternating sequence of coins [1,0,1,0,1,0).
//
//        2. Given array A = [1, 1, 0, 1, 1], the function should return 2. After reversing the first and fourth coins, we achieve an alternating sequence of coins [0,1,0,0,1].

public class CoinReversal {
    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 1, 1};
        int[] B = {1, 1, 0, 1, 1};
        System.out.println(solution(A));
        System.out.println(solution(B));
    }
    public static int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
