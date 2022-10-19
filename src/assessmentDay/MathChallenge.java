package assessmentDay;//Math Challenge
//
//        Have the function
//
//        assessmentDay.MathChallenge (num) return the string yes if the number given is part of the Fibonacci sequence. This sequence is defined by: Fn = Fn-1+ Fn-2, which means to find Friyou add the previous two numbers up. The first two numbers are 0 and 1, then comes 1, 2, 3, 5 etc. If num is not in the Fibonacci sequence, return the string no.
//
//        Examples
//
//        Input: 34
//
//        Output: yes

public class MathChallenge {
    public static String MathChallenge(int num) {
        // code goes here
        String result = "";
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == num) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
}
