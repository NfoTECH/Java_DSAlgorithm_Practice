package strings;

import java.util.Arrays;

public class ReverseNumberAsString {

    public static int sortDesc(final int num) {
        StringBuilder reversedWord = new StringBuilder();
        String[] numArray = String.valueOf(num).split("");
        //String[] numArray = Integer.toString(num).split("");
        Arrays.sort(numArray);

        for (int i = numArray.length - 1; i >= 0; i--) {
            reversedWord.append(numArray[i]);
        }
        return Integer.parseInt(reversedWord.toString());
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }
}

//https://zetcode.com/java/filterlist/
