package assessmentDay;
//
//A palindrome is a string that reads the same forward and backward, e.g. 127 or tacocat.
// A substring is a contiguous subset of characters in a string.
// Given a string s how many distinct substrings of s are palindromes?
//        Example
//
//        s = "mokkori"
//
//        Some of its substrings are [m, o, kr, i, mo, ok, mok, okk, kk, okko). There are 7 distinct palindromes [m, o, k, r, i, kk, okko].
//
//        3
//
//        Function Description
//
//        Complete the function palindrome in the editor below.
//
//        palindrome has the following parameter(s):
//
//        strings: a string
//
//        Returns:
//
//        int the number of distinct palindromes as an integer.
//
//        Constraints
//
//        1s/s/s 250
//
//        Each character s[i] e ascii[a-z]
//
//        Input Format for Custom Testing
//
//        Sample Case 0
//
//        3
//
//        →
//
//        Sample Input 0
//
//        STDIN
//
//        Function Parameters
//
//        S
//
//        Sample Output 0
//
//        5
//
//        Explanation 0
//
//        Palindromic substrings are (a, aa, aabaa, aba, bl
//
//        The substring 'a' occurs 4 times, but is counted only once. Similarly, the substring 'aa' occurs twice but counts as one distinct palindrome.
//
//        The number of distinct palindromes is 5.

import java.util.HashSet;
import java.util.Set;

public class Palindrome2 {
    public static int palindrome(String s) {
        // Write your code here
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    set.add(sub);
                }
            }
        }
        return set.size();
    }
    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("mokkori"));
        System.out.println(palindrome("aabaa"));
    }
}
