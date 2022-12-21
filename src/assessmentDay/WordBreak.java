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
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] seperate = new boolean[s.length() + 1];
        seperate[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (seperate[j] && wordSet.contains(s.substring(j, i))) {
                    seperate[i] = true;
                    break;
                }
            }
        }
        return seperate[s.length()];
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