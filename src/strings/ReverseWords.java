package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String origin = "Reversing the individual words in a sentence";

        System.out.println(origin.trim().isEmpty() ? origin : Arrays.stream(origin.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" ")));


        // OR
        String original = "This is another way of reversing string";
        String result = "";
        String[] substr = original.split(" ");
        if (original.isBlank())
            System.out.println(original);
        for (int i = 0; i < substr.length; i++) {
        String newString = new StringBuilder(substr[i]).reverse().toString();
            result = result + " " + newString;
        }
        result = result.substring(1);
        System.out.println(result);
    }
}
