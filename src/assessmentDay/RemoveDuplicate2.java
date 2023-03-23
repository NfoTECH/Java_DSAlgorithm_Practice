package assessmentDay;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        String word = "Charismatic";
        System.out.println(removeDuplicates2(word));
    }

    static String removeDuplicates2 (String word) {
        StringBuilder uniqueWord = new StringBuilder();
        word = word.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                uniqueWord.append(currentChar);
            }
        }
        return uniqueWord.toString();
    }
}
