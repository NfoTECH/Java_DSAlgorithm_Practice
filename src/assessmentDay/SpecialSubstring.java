package assessmentDay;
//
//There are two types of characters in a particular language: special and normal.
// A character is special if its value is 1 and normal if its value is 0. Given strings,
// return the longest substring of s that contains at most k normal characters.
// Whether a character is normal is determined by a 26-digit bit string named charValue.
// Each digit in charValue corresponds to a lowercase letter in the English alphabet.
//
//        Example:
//
//        s='abcde'
//
//        alphabet-abcdefghijklmnopqrstuvwxyz
//
//        charValue 10101111111111111111111111
//
//        For clarity, the alphabet is aligned with charValue below:
//
//        alphabet abcdefghijklmnopqrstuvwxyz
//
//        charValue = 10101111111111111111111111
//
//        The only normal characters in the language (according to charValue) are band d.
//        The string s contains both of these characters For A-2 the longest substring of that contains at most k-2
//        normal characters is 5 characters long, abcde, so the return value is 5. If instead,
//        then the possible substrings are ab be ca, de abc, xdel.
//        The longest substrings sem 3 characters long which would mean IK FITEROVIshin

public class SpecialSubstring {
    public static int getSpecialSubstring (String s, int k, String charValue) {
        int longestSubstring = 0;
        int normalCharacters = 0;
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (charValue.charAt(s.charAt(i) - 'a') == '0') {
                normalCharacters++;
            }
            while (normalCharacters > k) {
                if (charValue.charAt(s.charAt(j) - 'a') == '0') {
                    normalCharacters--;
                }
                j++;
            }
            longestSubstring = Math.max(longestSubstring, i - j + 1);
            i++;
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        System.out.println(getSpecialSubstring("giraffe", 2, "01111001111111111011111111"));
    }
}