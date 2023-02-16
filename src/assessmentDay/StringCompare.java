package assessmentDay;


//String myString = "Hello World!"
//
//        The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//
//        Given two strings of lowercase English letters,  and , perform the following operations:
//
//        Sum the lengths of  and .
//
//        Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//
//        Capitalize the first letter in  and  and print them on a single line, separated by a space.
//
//        Input Format
//
//        The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//        Output Format
//
//        There are three lines of output:
//
//        For the first line, sum the lengths of  and .
//
//        For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
//
//        For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
//
//        Sample Input 0
//
//        hello
//
//        java
//
//        Sample Output 0
//
//        9
//
//        No
//
//        Hello Java
//
//        Explanation 0
//
//        String  is "hello" and  is "java".
//
//        has a length of , and  has a length of ; the sum of their lengths is .
//
//        When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
//
//        When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".

public class StringCompare {
    public static int StringCompare(String word) {
        String[] array = word.split("\n");
        String a = array[0];
        String b = array[1];
        int aLength = a.length();
        int bLength = b.length();
        int sum = aLength + bLength;
        System.out.println(sum);
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String aCap = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bCap = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(aCap + " " + bCap);
        return sum;
    }

    public static void main(String[] args) {
        String word = "hello\njava";
        StringCompare(word);
    }
}