package assessmentDay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumOccurringChar {
    public static char minimumOccurringCharacter(String text) {
        List<String> list = Arrays.asList(text.split(""));
        Collections.sort(list);
        int max = Integer.MIN_VALUE;
        String letter = "";
        int location = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int lastIndex = list.lastIndexOf(list.get(i));
            int calc = (lastIndex - i) + 1;
            if (calc > max) {
                max = (lastIndex - i) + 1;
                letter = list.get(i);
                location = text.indexOf(letter);
            } else if (calc == max) {
                if (text.indexOf(list.get(i)) < location) {
                    letter = list.get(i);
                    location = text.indexOf(letter);
                }
            }
            i = lastIndex;
        }
        return letter.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(minimumOccurringCharacter("abacabad"));
    }
}
