package assessmentDay;

import java.util.ArrayList;
import java.util.List;
//Given a set of words and a set of sentences (composed of those words), determine how many sentences can be created by rearranging the letters of each word in each input sentence, where rearranging words is only possible if the resulting word is also present in the input set of words.
//
//        Example
//
//        wordSet = ['listen', 'silent'; it is)
//
//        sentence = "listen it is silent
//
//        Note: The words in the set are unique, sentences are composed only of words from the word set and a sentence is composed of words separated by a single
//
//        3
//
//        Determine that the letters of listen can be rearranged into silent (.e. these words are anagrams). Those two words can be replaced with each other. The four sentences that can be created are:
//
//        listen it is silent
//
//        listen it is listen
//
//        ⚫ silent it is silent
//
//        ⚫ silent it is listen
//
//        Function Description
//
//        Complete the countSentences function in the editor below.
//
//        countSentences has the following parameters: string wordSet[n]: an array of unique strings
//
//        string sentences[m): an array of strings
//
//        Returns:
//
//        inti: an array of m integers that denote the number of sentences that can be formed from each sentence in sentences
//        Constraints
//
//        0 < n <= 10 ^ 5
//
//        • 1 length of each word ≤ 20
//
//        t <= m <= 1000
//
//        3 words in a sentences 20
//
//        • Each word is made up of characters in the range ascii i[a - 2]
//
//        Input Format For Custom Testing
//
//        Sample Case 0
//
//        Sample Input 0
//
//        STDIN
//
//        Function
//
//        6
//
//        → wordset size n = 6
//
//        →wordset = ['the', 'bats', 'tabs',
//
//        the
//
//        2
//
//        ' in^ prime ,^ prime ca t^ prime , 'act']
//
//        bats
//
//        tabs
//
//        in
//
//        cat
//
//        act
//
//        3
//
//        → sentences[] size n =*3 cat the bats → sentences = ['cat the bats, in the act act tabs 4n * 1 in the act tabs in
//

public class CountSentences {
    public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
        List<Long> result = new ArrayList<>();
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            long count = 1;
            for (String word : words) {
                long temp = 0;
                for (String s : wordSet) {
                    if (isAnagram(word, s)) {
                        temp++;
                    }
                }
                count *= temp;
            }
            result.add(count);
        }
        return result;
    }

    private static boolean isAnagram(String word, String s) {
        if (word.length() != s.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> wordSet = new ArrayList<>();
        wordSet.add("the");
        wordSet.add("bats");
        wordSet.add("tabs");
        wordSet.add("in");
        wordSet.add("cat");
        wordSet.add("act");
        List<String> sentences = new ArrayList<>();
        sentences.add("cat the bats");
        sentences.add("in the act");
        sentences.add("act tabs");
        System.out.println(countSentences(wordSet, sentences));
    }
}
