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
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] == 1) {
                    count++;
                }
            } else if (i % 2 != 0) {
                if (A[i] == 0) {
                    count++;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] == 0) {
                    count1++;
                }
            } else if (i % 2 != 0) {
                if (A[i] == 1) {
                    count1++;
                }
            }
        }
        return Math.min(count, count1);
    }


    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 1, 1};
        int[] B = {1, 1, 0, 1, 1};
        int[] C = {0, 1, 1, 0};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }
}
