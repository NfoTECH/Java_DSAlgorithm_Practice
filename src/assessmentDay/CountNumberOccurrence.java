package assessmentDay;

// Given a string of numbers and alphabets, find the number of occurrences of each number in the string.
// Example:
// Input: "a3f1s2d3f1f1f3"
// Output: 1 = 3, 2 = 1, 3 = 3

import java.util.HashMap;

public class CountNumberOccurrence {
    public static void numberOccurrence(String s) {
        int[] count = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count[s.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(i + " = " + count[i]);
            }
        }
    }

    // SOLUTION 2

    static HashMap<Integer, Integer> countNumbers(String string){
        HashMap<Integer, Integer> map = new HashMap<>();
        // Loop through each character in the input String using a for loop
        for(int i=0; i< string.length();i++){

            char c = string.charAt(i);
            // Check if the current character is a digit
            if(Character.isDigit(c)){
                // If the current character is a digit, convert it to an integer
                // i.e if c = '5', num = 5
                int num = Character.getNumericValue(c);
                // Add the digit to the map and increment its count
                // This line of code adds num to the map if it's not already in there, and sets its value to 1.
                // If num is already in the map, it increments its value by 1
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        numberOccurrence("a3f1s2d3f1f1f3");
        String s = "a3f1s2d3f1f1f3";
        System.out.println(countNumbers(s));
    }
}
