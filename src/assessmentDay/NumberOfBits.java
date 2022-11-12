package assessmentDay;

//Write a function:

//class Solution { public int solution(int A, int B); }
//
//that, given two non-negative integers A and B, returns the number of bits set to 1 in the binary representation of the number A * B.
//
//        For example, given A = 3 and B = 7 the function should return 3, because the binary representation of A*B=3*7=21 is 10101 and it contains three bits set to 1.
//
//        Assume that:
//
//        A and B are integers within the range [0..100,000,000).
//
//        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
//
//        Copyright 2009-2022 by Codility Limited. All Rights Reserved. Unauthorized copying,
//
//        publication or disclosure prohibited.

import java.math.BigInteger;

public class NumberOfBits {
    public int solution (int A, int B) {
        BigInteger a = new BigInteger(String.valueOf(A));
        BigInteger b = new BigInteger(String.valueOf(B));
        a = a.multiply(b);
        String base2 = a.toString(2);
        base2 = base2.replaceAll("0", "");
        return base2.length();
    }


    public int solution2 (int A, int B) {
        BigInteger a = new BigInteger(String.valueOf(A));
        BigInteger b = new BigInteger(String.valueOf(B));
        BigInteger c = a.multiply(b);
        String binary = c.toString(2);
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NumberOfBits v = new NumberOfBits();
        System.out.println(v.solution(100000000, 100000000));
        System.out.println(v.solution2(100000000, 100000000));
    }
}
