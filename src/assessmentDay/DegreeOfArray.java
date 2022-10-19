package assessmentDay;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Given an array of integers, its degree is defined as the number of occurrences of the element that occurs most frequently in the array.
// Given a list of integers, determine two properties:
//        1. the degree of the array
//
//        2. the length of the shortest sub-array that shares that degree
//
//        Example
//
//        arr = [1, 2, 1, 3, 2)
//
//        The array has a degree of 2 based on the occurrences of values 1 and 2.
//
//        The subarray of degree 2 based on the 1's is [1, 2, 1) and based on 2's is [2, 1,3, 21.
//
//        Their lengths are 3 and 4, so the shortest is length 3. Return the shortest length.
//
//        Function Description
//
//        Complete the function degreeOfArray in the editor below.
//
//        The function must return an integer denoting the minimum size of the subarray such that the degree of the subarray is equal to the degree of the array.
//
//        degreeOfArray has the following parameters)
//
//        int arrint: an array of integers indexed from Oto n-1
//
//        Return
//
//        int: the minimum size of the subarrays that have a degree equal to the
//
//        degree of the array

public class DegreeOfArray {

    public static int degreeOfArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> hash = new HashMap<>();
        Map<Integer, Integer[]> map = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < arr.size(); i++) {
            int indexArr = arr.get(i);
            hash.put(indexArr, hash.getOrDefault(indexArr, 0) + 1);
            degree = Math.max(degree, hash.get(indexArr));
            map.computeIfAbsent(indexArr, k -> new Integer[2]);
            Integer[] element = map.get(indexArr);
            if (element[0] == null) {
                element[0] = i;
            }
            element[1] = i;
        }
        int output = arr.size();
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == degree) {
                Integer[] element = map.get(entry.getKey());
                output = Math.min(output, element[1] - element[0] + 1);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(17, 802, 88, 747, 23, 160, 254, 46, 663, 752, 741, 857, 802, 387, 790, 528, 93);
        List<Integer> arr2 = List.of(1, 2, 2, 3, 1);
        System.out.println(degreeOfArray(arr));
        System.out.println(degreeOfArray(arr2));
    }
}

