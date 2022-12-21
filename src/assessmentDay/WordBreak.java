package assessmentDay;

//Given a strings and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
//
//        Note that the same word in the dictionary may be reused multiple times in the segmentation.
//
//        Example 1:
//
//        Input: s = "leetcode", wordDict = ["leet", "code"] Output: true Explanation: Return true because "leetcode" can be segmented "leet code".
//
//        Example 2:
//
//        Input: s = "applepenapple", wordDict = ["apple","pen"] Output: true
//
//        Explanation: Return true because "applepenapple" can be segm as "apple pen apple". Note that you are allowed to reuse a dictionary word.
//        Input: s = "leetcode", wordDict = ["leet", "code"] Explanation: Return true because "leetcode" can be segmented as "leet code".
//
//        Example 2:
//
//        Output: true
//
//        Input: s="applepenapple", wordDict = ["apple","pen"] Explanation: Return true because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to reuse a dictionary word.
//
//        Example 3:
//
//        Input: s="catsandog", wordDict = ["cats", "dog","sand", "and","cat"] Output: false
//
//        Constraints:
//
//        1s.length - 300
//
//        1 wordDict. length 1000

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

//    PSEUDOCODE
//    Create a 1D dp array of size N + 1, where N is the size of S.
//    Consider two pointers i and j, where i refers the starting of the substring and j represents the ending of the substring.
//    Run two nested loop, i = 0 till N + 1 and j = 0 to j = i:
//    Check if dp[j] > 0 and the dictionary of words contains the substring, then mark dp[i] = True and break.
//    Return dp[N] > 0


    //USING DYNAMIC PROGRAMMING APPROACH.
    //TIME COMPLEXITY = O(N^3);  SPACE COMPLEXITY = O(N)
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


    public static void main(String[] args) {
        WordBreak wb = new WordBreak();
        System.out.println(wb.wordBreak("leetcode", List.of("leet", "code"))); //output: true
        System.out.println(wb.wordBreak("applepenapple", List.of("apple", "pen"))); //output: true
        System.out.println(wb.wordBreak(
                "catsandog", List.of("cats", "dog", "sand", "and", "cat"))); //output: false because "og" is not in the dictionary
    }
}



// METHOD 2 - ANOTHER WAY OF SOLVING THE ABOVE PROBLEM
// USING THE BRUTE FORCE APPROACH
// TIME COMPLEXITY = O(2^N); SPACE COMPLEXITY = O(N)


//    public boolean wordBreak(String s, List<String> wordDict) {
//        Set<String> set = new HashSet<>(wordDict);
//        return wordBreak(s, set);
//    }
//
//    private boolean wordBreak(String s, Set<String> set) {
//        if (s.length() == 0) {
//            return true;
//        }
//        for (int i = 1; i <= s.length(); i++) {
//            if (set.contains(s.substring(0, i)) && wordBreak(s.substring(i), set)) {
//                return true;
//            }
//        }
//        return false;
//
//    }