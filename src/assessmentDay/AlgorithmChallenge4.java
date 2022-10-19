package assessmentDay;

import java.util.Arrays;


//
//Let's imagine that your friend has sent you an invitation to his secret party. The information in the invitation is encrypted. But you've got the instructions on how to decrypt it. Words are not in the correct order. You need to:
//
//        Split the message into words (any kind of separator between words can be used)
//
//        Take out all digits from the words but assign a value to each word. This value is the sum of the individual digits in each word.
//
//        Order the words in the decrypted message based on the assigned value, from smallest to largest. If there are several words with the same sum, only use the last of those words and ignore the other words.
//
//        Don't forget to think through any corner cases.
//
//        Examples:
//
//        Input: t1e1s2t, Hellio, 1thle, fir2st1 Output: Hello the first test
//
//        Input: 1yolur; ro2ckst2ar; i2nnier. us6, Come unleash Output: Come unleash your inner rockstar with us
//
//        2w12th1;
//
//        Input: 2par3ty 1oluri ylou 1in1 po4ol cinema waiting Output: Waiting you in our pool party
//
//        Input: In2vitaltion 1Night1 Cinelma Polol Molvie Output: Movie Night Invitation
//
//        For this test you're using Java OpenJDK 12 Feel free to add comments in your code explaining your solution.
public class AlgorithmChallenge4 {
    public static void main(String[] args) {
        System.out.println(decryption("t1e1s2t, Hellio, 1thle, fir2st1"));
    }

    public static String decryption(String input) {
String[] words = input.split("[^a-zA-Z]+");
        int[] values = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            values[i] = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (Character.isDigit(words[i].charAt(j))) {
                    values[i] += Integer.parseInt(String.valueOf(words[i].charAt(j)));
                }
            }
        }
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[values[i] - 1] = words[i];
        }
        return String.join(" ", result);
    }
}