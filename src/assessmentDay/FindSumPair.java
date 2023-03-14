package assessmentDay;

//In this problem, you'll be given a list of positive integers and a separate integer, and casked with finding whether there is a pair of integers in the list that sum to exactly
//
//        Implementation
//
//        Implement the method findair (mbers, ky which takes as input
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
//        Your EPALE method should return an array of two integers, containing the indices of a pair of interste array that sum to Note that
//
//        The first index of the array is 0
//
//        The first integer in your output should represent the lower index 10. 01 should be returned if there no pair is found
//
//        In the case that there are multiple possible pairs that sum to the target return me paranose ist edes the
//
//        lowest In the case of two pairs having the same lett vides, favor the pair with the tower right indes
//
//        For the above example, the correct output would be 11, 31

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
