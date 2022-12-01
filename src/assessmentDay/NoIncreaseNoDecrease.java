package assessmentDay;
//
//Not increasing, not decreasing
//
//        You are given an array consisting of distinct integers. Print the minimum number of elements to be removed such that no three consecutive elements in the array are either Increasing or decreasing.
//
//        Input
//
//        The first line of input contains an integer n
//
//        representing the size of the array. The second line of input contains n space-separated integers, representing the array elements.
//
//        Output
//
//        Print the minimum number of elements to be removed such that no three consecutive elements in the array are either increasing or decreasing
//
//        Constraints
//
//        1<n<= 10
//
//        Example #1
//
//        Input
//
//        12412
//
//        Output
//
//        1
//
//        Explanation: We need to remove one element (4). (1. 2.4.1, 2)-(1,2, 1, 2). There are no three consecutive elements in the array are either increasing or decreasing
//
//        Example #2
//
//        Input

import java.util.List;

public class NoIncreaseNoDecrease {
    public static int solve(List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < ar.size() - 2; i++) {
            if (ar.get(i) < ar.get(i + 1) && ar.get(i + 1) < ar.get(i + 2)) {
                count++;
            } else if (ar.get(i) > ar.get(i + 1) && ar.get(i + 1) > ar.get(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(List.of(1, 2, 4, 1, 2)));
        System.out.println(solve(List.of(1, 2, 3,5)));
    }

}
