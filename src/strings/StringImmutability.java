package strings;

import java.util.Arrays;

public class StringImmutability {
    public static void main(String[] args) {
        String x = "fortunate";
        String y = "fortunate";
        String z = new String("fortunate");

        System.out.println(x == y);         // true
        System.out.println(x.equals(y));    // true
        System.out.println(x.equals(z));    // true
        System.out.println(x == z);         // false

        System.out.println('d' + 'e');      // 201
        System.out.println("d" + 'e');      // de
        System.out.println("d" + "e");      // de
        System.out.println("d" + 3);        // d3
        System.out.println('d' + 3);        // 103
        System.out.println((char)('d' + 3)); // g

        // PRINT THE ALPHABETS
        StringBuilder alphabets = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            alphabets.append(c);
        }
        System.out.println(alphabets);      // abcdefghijklmnopqrstuvwxyz

        char[] name = x.toCharArray();
        System.out.println(Arrays.toString(name));  // [f, o, r, t, u, n, a, t, e]
    }
}
