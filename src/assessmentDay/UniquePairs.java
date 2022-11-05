package assessmentDay;

//You work in a shipping company. You ship products in pairs, with exactly two products in each parcel. Each parcel has a fixed capacity.
//
//        Given an array of integers p denoting the size of each product in a batch (all unique integers) and the capacity of the parcel in integer format c, return the combination(s) of two products that can be shipped and that exactly fit in the parcel size.
//
//        Return-1 in the case of any invalid input, e.g. arrays including product or parcel sizes that are negative or zero.
//
//        For example:
//
//        Ifp [1.2.3,4,5,6,7,8,9. 10),
//
//        c = 12
//
//        The output should be: 4 le (2, 10), (3, 9), (4,8), (5,7)
//
//        If p=[11, 12, 13, 14, 15, 16, 17, 18, 19, 20),
//
//        c=20
//
//        The output should be: 0
//
//        (No pairs exist for which the sum of sizes is exactly 20)
//
//        For this test you're using
//
//        Feel free to add comments in your code explaining your solution

public class UniquePairs {
    public static int getUniquePairs (int[] p, int c) {
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[i] + p[j] == c) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int c = 12;
        System.out.println(getUniquePairs(p, c));
    }
}
