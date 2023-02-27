package assessmentDay;

public class Anagram {
    public static String anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "The Strings aren't anagrams";
        }
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
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
        System.out.println(anagram("listen", "silent"));
    }

}
