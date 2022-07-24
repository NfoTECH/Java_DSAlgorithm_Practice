package strings;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String bukky = "My name is Bukky";
        String [] strArray = bukky.split("");  // String.split("") returns same as charArray() but not String.split(" ")
        char [] charArray = bukky.toCharArray();

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(charArray));
    }
}
