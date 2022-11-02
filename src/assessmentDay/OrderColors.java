package assessmentDay;

import java.util.Scanner;

//Order Colors
//
//        A strings contains a list of color names that are separated by a single space.
//
//        Colors in stare mixed up but each color has its original position at the end of the color name, positions are 1-indexed.
//        For example, the string "black gold2 white" can be rearranged to "gold2 black! while3" or "gold2 white black1"
//        str contains only up to 9 colors
//
//        Given at with rearranged colors, sort the colors to the original state and return the original str
//
//        Example 1:
//
//        Input: str = "red2 blue5 black4 green1 gold3"
//
//        Output: "green red gold black blue"
//
//        Example 2:
//
//        Input: str = gold2 black1 white3
//
//        Output: "black gold white"
//
//        Constraints:
//
//        2 <= str.length <= 200
//
//        str consists of multiple color names, spaces, and digits from 1 to 9.
//
//        str contains up to 9 color names
//        str contains at least one color name
//
//        Color names in str are separated by a single space.
//        str contains no leading or trailing spaces

public class OrderColors {
    public static String orderColors(String s) {
        String[] split = s.split(" ");
        String[] result = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            String temp = split[i];
            int index = temp.length() - 1;
            while (index >= 0 && Character.isDigit(temp.charAt(index))) {
                index--;
            }
            int num = Integer.parseInt(temp.substring(index + 1));
            result[num - 1] = temp.substring(0, index + 1);
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String output = new OrderColors().orderColors(s);
        System.out.println(output);
    }
}