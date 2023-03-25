package assessmentDay;

public class Anagram {
    public static String anagram(String s1, String s2) {

        // convert to lowercase and remove non-alphabetic characters
        s1 = s1.toLowerCase().replaceAll("[^a-z]", "");
        s2 = s2.toLowerCase().replaceAll("[^a-z]", "");

        if (s1.length() != s2.length()) {
            return "The Strings aren't anagrams";
        }
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return "The Strings aren't anagrams";
            }
        }
        return "The Strings are anagrams";
    }

    public static void main(String[] args) {
        System.out.println(anagram("Listen", "silent")); // true
        System.out.println(anagram("Eleven plus two", "Twelve plus one")); // true

    }


}
