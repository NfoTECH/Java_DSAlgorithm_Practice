package assessmentDay;
//[10:19 AM, 3/24/2023] NfoTECH: Bit Logic
//
//        For two positive integers, lo and hi, and a limit k, find two integers, a and b, satisfying the following criteria. Return the value of ae b. The @symbol denotes the bitwise XOR operator.
//
//        Io <= a < b <= hi
//
//        The value of a e bis maximal for a oplus b <= k .
//
//        Example
//
//        / O = 3
//
//        hi = 5
//
//        k = 6i
//
//        a
//
//        b
//
//        3
//
//        4
//
//        aeb
//
//        7
//
//        3
//
//        5
//
//        6
//
//        4
//
//        5
//
//        The maximal useable XORed value is 6 because it is the maximal value that is less than or equal to the limit k = 6
//        [10:19 AM, 3/24/2023] NfoTECH: Function Description
//
//        Complete the function maxxor in the editor below. The function must return an integer denoting the maximum possible value of a ob for all a @bsk
//
//ALL
//
//        2
//
//        3
//
//        4
//
//        maxxor has the following parameter(s): int lo: an integer int hi: an integer
//
//        k: an integer
//
//        Constraints
//
//        1slo<his 10
//
//        1sks 104
//
//        Input Format for Custom Testing
//
//        ▾ Sample Case 0
//
//        Sample Input 0
//
//        STDIN
//
//        13 3
//
//        Function
//
//        lo 1
//
//        k3
//
//        Sample Output 0


public class BitLogic {
    public static int maxXor (int lo, int hi, int k) {
        int max = 0;
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j <= hi; j++) {
                int xor = i ^ j;
                if (xor > max && xor <= k) {
                    max = xor;
                }
            }
        }
        return max;
    }

    public static int maxXor2(int lo, int hi, int k) {
        int max = 0;
        for (int a = lo; a <= hi; a++) {
            for (int b = a + 1; b <= hi; b++) {
                int xor = a ^ b;
                if (xor <= k && xor > max) {
                    max = xor;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxXor(3, 5, 6));
        System.out.println(maxXor2(3, 5, 6));
    }
}
