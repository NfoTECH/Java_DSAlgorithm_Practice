package assessmentDay;

//In this problem, you'll be given a list of positive integers and a separate integer, and tasked with finding whether there is a pair of integers in the list that sum to exactly
//
//        Implementation
//
//        Implement the method findSumPair (numbers, ky which takes as input
//
//        an array of positive integers (numbers)
//
//        a positive integer (a) representing the target sum
//
//        For example:
//
//        numbers 11. 3, 8. 1. 21
//
//        13
//
//        Your findSumPair method should return an array of two integers, containing the indices of a pair of intersect array that sum to Note that
//
//        The first index of the array is 0
//
//        The first integer in your output should represent the lower index 10. 01 should be returned if there is no pair is found


import java.util.Arrays;

public class FindSumPair {
    public static int[] findSumPair(int[] numbers, int k) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
        // return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 1, 2};
        int k = 7;
        System.out.println(Arrays.toString(findSumPair(numbers, k)));
    }
}
