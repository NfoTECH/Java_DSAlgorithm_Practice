package assessmentDay;

import java.util.*;

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

public class MergingPalindromes1 {
    public static String mergePalindromes(String s1, String s2) {
        String a = getPalindromeLetter(s1);
        String b = getPalindromeLetter(s2);
        String c = a + b;
        char[] chars = c.toCharArray();
        Arrays.sort(chars);
        c = new String(chars);
        //System.out.println(a +"  "+b);
        return buildPalindrome(Arrays.asList(c.split("")));
    }

    public static String getPalindromeLetter(String s){
        List<String> chars = Arrays.asList(s.split(""));
        chars.sort(Comparator.naturalOrder());
        String ret = "";
        for(int i =0; i< chars.size(); i++){
            int diff = (chars.lastIndexOf(chars.get(i)) - i) + 1;
            if(ret.length() ==0 || diff % 2 == 0 || diff % 2 == 1 && (ret.length() % 2 ==0)){
                ret += chars.get(i).repeat(diff);
            }
            i = i+(diff -1);
        }
        return ret;
    }

    public static String buildPalindrome(List<String> letters){
        StringBuilder sb = new StringBuilder("");
        int left = 0;
        int right = 0;
        for(int i =0; i< letters.size(); i++){
            int diff = (letters.lastIndexOf(letters.get(i)) - i) + 1;
            if(sb.length() ==0 || diff % 2 == 0 || diff % 2 == 1 && (sb.length() % 2 ==0)){
                int increment = diff / 2;
                if(sb.length() % 2 ==0){
                    sb.insert(left, letters.get(i).repeat(diff));
                }else{
                    if(diff ==1){
                        sb.insert(left, letters.get(i).repeat(diff)); 
                    }else{
                        sb.insert(left, letters.get(i).repeat(increment));
                        //System.out.println(sb.toString());
                       // System.out.println((sb.length() -1 -right )+" "+right);
                        sb.insert(sb.length() - right, letters.get(i).repeat(increment));    
                    }

                }
                left += increment;
                right += increment;

            }
            i = i+(diff -1);
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
}