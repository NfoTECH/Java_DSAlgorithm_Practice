package assessmentDay;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//
// Similar Strings
// Two strings are said to be similar if they are composed of the same characters.
// For example "abaca" and "cba" are similar since both of them are composed of characters 'a', 'b' and 'c'
// However "abaca" and "bcd" are not similar since they do not share all of the same letters.
// Given an array of strings words of length n find the number of pairs of strings that are similar.
// Note:
// Each string is composed of lowercase Eng ish characters only. • Pairs are considered index-wise, i.e., two equa strings at different
// indices are counted as separated pairs. A pair at indices (i, j) is the same as the pair at (.)
// Example
// Consider n-3 words-["xyz", "foo", "of"] Here, the strings "foo" and "of" are similar because they are composed of the same characters ['o', 'f].
// There are no other similar pairs so the answer is 1.
// Here, the strings "foo" and "of" are similar because they are composed of the same characters ['o', 'f'].
// There are no other similar pairs so the answer is 1.

// Function Description
// Complete the function countSimilar Pairs in the editor below.
// countSimilarPairs has the following parameter:
// string words[n]. an array of n strings
// Returns
// long_int: the number of similar pairs

// Sample Input For Custom Testing
// STDIN FUNCTION
// words[] size n = 4
// aba
// words ["aba", "abaca", "baab","cba"]
//
// Sample Output
// 2
//
// Explanation
//
// • Strings "aba" and "baab" are similar because they are made up of the same characters 'a' and 'b'.
// • Strings "abaca" and "cba" are similar because they are made up of the same characters 'a', 'b' and 'c'.
//
// Sample Case 1
//
// The same characters 'a' and 'D. Strings "abaca" and "cba" are similar because they are made the same characters 'a', 'b' and 'c'.

// words[] size n = 3
// words ["abab", "aaaaab", "bbbba"]

// Sample Output
// 3
//
// Explanation
// These 3 pairs are made up of 'a' and 'b':
// "abab" and "aaaaab"
// "abab" and "bbbba"
// "aaaaab" and "bbbba"

public class CountSimilarPairs {
    public static int countSimilarPairs(List<String> list){
        int max =1;
        for(int i=0; i< list.size()-1; i++){
            int count =1;
            Set<String> mySet = Arrays.stream(list.get(i).split("")).collect(Collectors.toSet());
            for(int j =i+1; j< list.size(); j++){
                Set<String> mySet2 = Arrays.stream(list.get(j).split("")).collect(Collectors.toSet());
                if(mySet.equals(mySet2)){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abab", "aaaaab", "bbbba");
        List<String> list2 = Arrays.asList("aba", "abaca", "baab", "cba");
        System.out.println(countSimilarPairs(list));
        System.out.println(countSimilarPairs(list2));
    }
}
