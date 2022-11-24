package assessmentDay;
//
//Design a data structure that supports adding new words and finding if a string matches any previously added string.
//
//        Implement the WordDictionary class:
//
//        WordDictionary() Initializes the object.
//
//        void addWord (word) Adds word to the data structure, it can be matched later,
//
//        bool search(word) Returns true if there is any string in the data structure that matches word or fals otherwise, word may contain dots where dots can be matched with any letter
//
//        Example:
//
//        Input
//
//        ["WordDictionary","addword","addword", "addWord", "search", "search", "search","search" [I], ["bad"], ["dad"], ["mad"], ["pad"], ["bad"],[".ad"], ["b.."]}
//
//        Output
//
//        [null,null,null,null, false, true, true, true]
//
//        Explanation
//
//        WordDictionary wordDictionary new WordDictionary(1;
//
//        wordDictionary.addword("bad"); wordDictionary.addword("dad");
//
//        wordDictionary.addWord{"sad");
//
//        wordDictionary.search("pad"); // return False
//
//        wordDictionary.search("bad"); // return True
//
//        wordDictionary.search(".ad"); // return True)
//
//        wordDictionary.search("b.."); // return True
//
//        Constraints
//
//        1 wird.length 25
//
//        word in added consists of lowercase English letters
//
//        • Word wears consist of or lowercase English letters -There will be at most 3 dota in d for series
//
//        At most 10 cals will te made to addword and search

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDictionary {
    Set<String> wordList;
    public WordDictionary() {
        this.wordList = new HashSet<>();
    }

    public void addWord(String word) {
        this.wordList.add(word);
    }

    public boolean search(String word) {
        if (word.contains(".")) {
            for (String s : wordList) {
                if (s.length() == word.length()) {
                    boolean match = true;
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) != '.' && word.charAt(i) != s.charAt(i)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return wordList.contains(word);
        }
    }
    public boolean search2(String word) {
        Pattern pattern = Pattern.compile(word);
        for (String str: wordList) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        Collections.addAll(wordDictionary.wordList, "WordDictionary", "addWord", "addWord", "addWord", "search", "search", "search", "search");
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("ad")); // return False
        System.out.println(wordDictionary.search2("ad")); // return False
    }
}

