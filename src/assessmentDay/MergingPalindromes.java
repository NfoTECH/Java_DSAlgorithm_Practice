package assessmentDay;

//Merging Palindromes
//
//        ALL
//
//        Given two strings, find all palindromes that can be formed with the letters of each string.
//        From those palindromes, select one from each set that, when combined and rearranged,
//        produces the longest palindrome possible. If there are multiple palindromes of that length,
//        choose the alphabetically smallest of them.
//
//Input: s1 = "aab", s2 = "cca"
//Expected Output: "acaca"
//
//Input: s1 = "adaab", s2 = "cac"
//Expected Output: "aaccaa"
//
//Input: s1 = "aabbc", s2 = "ddefefq"
//Expected Output: "abdefcfedba"
//
//Input: s1 = "awwzaigvxuikdqlvshspsvyckttwdzqmarpxglwmpob", s2 = "dtisfxyobndu"
//Expected Output: "abddgiklmopqsstuvwwxyzzyxwwvutssqpomlkigddba"

public class MergingPalindromes {
    public static String mergePalindromes(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int[] letters = new int[26];
        for (char c : s1.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            letters[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (letters[i] % 2 == 1) {
                sb.append((char) ('a' + i));
            }
        }
        String mid = sb.toString();
        String left = getPalindrome(letters);
        String right = new StringBuilder(left).reverse().toString();
        if (mid.length() == 0) {
            return left + right;
        } else if (mid.length() == 1) {
            return left + mid + right;
        } else {
            return left + mid.charAt(0) + right;
        }

    }

    private static String getPalindrome(int[] letters) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < letters[i] / 2; j++) {
                sb.append((char) ('a' + i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(mergePalindromes("aab", "cca")); //to return acaca
        System.out.println(mergePalindromes("adaab", "cac")); //to return aaccaa
        System.out.println(mergePalindromes("aabbc", "ddefefq")); // to return abdefcfedba
        System.out.println(mergePalindromes("awwzaigvxuikdqlvshspsvyckttwdzqmarpxglwmpob", "dtisfxyobndu"));
        //to return  abddgiklmopqsstuvwwxyzzyxwwvutssqpomlkigddba
    }
//}
//
//    public static String mergePalindromes(String s1, String s2) {
//        String result = "";
//        String s1Result = "";
//        String s2Result = "";
//        int s1Length = s1.length();
//        int s2Length = s2.length();
//        int s1Index = 0;
//        int s2Index = 0;
//        int s1Counter = 0;
//        int s2Counter = 0;
//        // For each letter in s1, find the longest palindrome
//        // that can be formed using that letter.
//        for (int i = 0; i < s1Length; i++) {
//            s1Counter = 0;
//            s1Index = i;
//            // Find the longest palindrome that can be formed
//            // using the current letter in s1.
//            while (s1Index < s1Length && s1.charAt(s1Index) == s1.charAt(i)) {
//                s1Counter++;
//                s1Index++;
//            }
//            // Find the corresponding letter in s2.
//            s2Index = s2.indexOf(s1.charAt(i));
//            if (s2Index != -1) {
//                s2Counter = 0;
//                // Find the longest palindrome that can be formed
//                // using the corresponding letter in s2.
//                while (s2Index < s2Length && s2.charAt(s2Index) == s1.charAt(i)) {
//                    s2Counter++;
//                    s2Index++;
//                }
//                // If the counters are the same, append the letter
//                // to the result string.
//                if (s1Counter == s2Counter) {
//                    s1Result += s1.charAt(i);
//                    s2Result += s1.charAt(i);
//                } else if (s1Counter > s2Counter) {
//                    // If the counter in s1 is greater than the counter in s2,
//                    // append the letter to the result string.
//                    s1Result += s1.charAt(i);
//                } else {
//                    // Otherwise, append the letter to the result string.
//                    s2Result += s1.charAt(i);
//                }
//            } else {
//                // If the letter in s1 is not in s2, append it to the result string.
//                s1Result += s1.charAt(i);
//            }
//        }
//        // For each letter in s2, find the longest palindrome
//        // that can be formed using that letter.
//        for (int i = 0; i < s2Length; i++) {
//            s2Counter = 0;
//            s2Index = i;
//            // Find the longest palindrome that can be formed
//            // using the current letter in s2.
//            while (s2Index < s2Length && s2.charAt(s2Index) == s2.charAt(i)) {
//                s2Counter++;
//                s2Index++;
//            }
//            // Find the corresponding letter in s1.
//            s1Index = s1.indexOf(s2.charAt(i));
//            if (s1Index == -1) {
//                // If the letter in s2 is not in s1, append it to the result string.
//                s2Result += s2.charAt(i);
//            }
//        }
//        // Sort the letters in s1Result and s2Result.
//        s1Result = sort(s1Result);
//        s2Result = sort(s2Result);
//        // Append the letters in s1Result to the result string.
//        result += s1Result;
//        // Append the letters in s2Result to the result string.
//        result += s2Result;
//        // Return the result string.
//        return result;
//    }
//
//    // Sort the letters in the string.
//    public static String sort(String s) {
//        char[] charArray = s.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = i + 1; j < charArray.length; j++) {
//                if (charArray[i] > charArray[j]) {
//                    char temp = charArray[i];
//                    charArray[i] = charArray[j];
//                    charArray[j] = temp;
//                }
//            }
//        }
//        return new String(charArray);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(mergePalindromes("aab", "cca")); //to return acaca
//        System.out.println(mergePalindromes("adaab", "cac")); //to return aaccaa
//        System.out.println(mergePalindromes("aabbc", "ddefefq")); // to return abdefcfedba
//        System.out.println(mergePalindromes("awwzaigvxuikdqlvshspsvyckttwdzqmarpxglwmpob", "dtisfxyobndu"));
//        //to return  abddgiklmopqsstuvwwxyzzyxwwvutssqpomlkigddba
//    }
}
