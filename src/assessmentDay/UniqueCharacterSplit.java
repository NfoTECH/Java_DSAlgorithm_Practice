package assessmentDay;
//
// Given a string S, we can split S into 2 strings: S1 and S2.
// Return the number of ways S can be split such that the number of unique characters between S1 and S2 are the same.

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterSplit {
    public static int countUniqueCharacters(String s) {
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            if (uniqueCombination(s1) == uniqueCombination(s2)) {
                count++;
            }
        }
        return count;
    }
    public static int uniqueCombination(String str){
        Set<Character> m = new HashSet<>();
        for(Character character : str.toCharArray()){
            m.add(character);
        }
        return m.size();
    }


    public static void main(String[] args) {
        String s1 = "aaaa";
        String s2 = "bac";
        String s3 = "ababa";


        int count = countUniqueCharacters(s1);
        int count2 = countUniqueCharacters(s2);
        int count3 = countUniqueCharacters(s3);

        System.out.println(count); // prints 4
        System.out.println(count2); // prints 4
        System.out.println(count3); // prints 4
    }
}
