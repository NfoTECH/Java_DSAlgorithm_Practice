package assessmentDay;


//
//Write the function number_cardinality that takes an integer and returns a string, as follows:
//
//        1. Return the string zero if the number ends in a 0
//
//        2. Return the string five if the number ends in a 5
//
//        3. Return the string even if the number is even (divisible by 2)
//
//        AND does not end with a 0
//
//        4. Return the string odd if the number is odd (not divisible by 2) AND does not end with a 5
//
//        Make sure your return string is exactly as above, using lowercase letters.
//
//        Examples:
//
//        Input: 10
//
//        Output: zero
//
//        Input: 8
//
//        Output: even
//
//        Input: 15
//
//        Output: five
//
//        Input: 9
//
//        Output odd
public class NumberCardinality {
    public static String number_cardinality(int number) {
        // write your code here
        if (number % 10 == 0) {
            return "zero";
        }
        if (number % 10 == 5) {
            return "five";
        }
        if (number % 2 == 0) {
            return "even";
        }
        return "odd";
    }
    public static void main(String[] args) {
        System.out.println(number_cardinality(10));
        System.out.println(number_cardinality(8));
        System.out.println(number_cardinality(15));
        System.out.println(number_cardinality(9));
    }
}