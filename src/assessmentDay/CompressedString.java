package assessmentDay;
//
//Different compression techniques are used in order to reduce the size of the messages sent over the web. An algorithm is designed to compress a given string by describing the total number of consecutive occurrences of each character next to it. For example, consider the string "abaasass". Group the consecutive occurrence of each character:
//
//        • a'occurs one time.
//
//        • 'b'occurs one time.
//
//        • a'occurs two times consecutively.
//
//        • s'occurs one time. • a'occurs one time.
//
//        • s'occurs two times consecutively.
//
//        If a character only occurs once, it is added to the compressed string. If it occurs consecutive times, the character is added to the string followed by an integer representing the number of consecutive occurrences. Thus the compressed form of the string is "aba2sas2"
//
//        Function Description
//
//        Complete the function compressedString in the editor below. The function must return the compressed form of message.
//        Function Description
//
//        Complete the function compressedString in the editor below. The function must return the compressed form of message.
//
//        compressedString has the following parameter(s): string message: a string
//
//        Returns:
//
//        string: the compressed message
//
//        Constraints
//
//        ⚫ message[i] e ascii[a-z]
//
//        ⚫ [message] ≤ 105
//        Sample Input 0
//
//        STDIN
//
//        Function Parameters
//
//        abc
//
//        message
//
//        "abc"
//
//        LL
//
//        D
//
//        1
//
//        2
//
//        3
//
//        Sample Output 0
//
//        abc
//
//        Explanation 0
//
//        None of the characters repeats consecutively so the string is already in compressed form.
//
//        ▾ Sample Case 1
//
//        Sample Input 1
//
//        STDIN
//
//        Function
//
//        Parameters
//
//        abaabbbc
//
//        message
//
//        "abaabbbc"
//
//        Sample Output 1
//
//        aba2b3c


public class CompressedString {
    public static String compressedString(String message) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < message.length(); i++) {
            if (i + 1 < message.length() && message.charAt(i) == message.charAt(i + 1)) {
                count++;
            } else {
                sb.append(message.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String message = "abaabbbc";
        String message1 = "abc";
        System.out.println(compressedString(message));
        System.out.println(compressedString(message1));
    }
    
}
