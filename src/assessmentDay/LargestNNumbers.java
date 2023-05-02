package assessmentDay;


//Find largest n numbers in array
//
//        Given an array of integers and a number n, print n
//        largest numbers in the array
//        Input
//        Array of Integers
//        n-number of integers to return
//        Output
//        n largest integers
//        Example
//        Input: (50,73,18,27,92,0) n=3
//        Output: 50,73,92

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNNumbers {
    public static List<Integer> findLargestNumbers (List<Integer> list, int n) {
        return list.stream()
                .sorted() // sort in ascending order
                .skip(Math.max(0, list.size() - n)) // skip the first (list.size() - n) elements
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(50,73,18,27,92,0);
        System.out.println(findLargestNumbers(list, 3));
    }
}
