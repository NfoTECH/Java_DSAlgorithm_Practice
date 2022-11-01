package assessmentDay;
//
//in order to detect errors on identification numbers, a check digit is often added at the end of that number.
//
//        Elapsed time: 02:43/12:0
//
//        implement the method computaCheckDigit(identificationumber that takes a number (as a string) and returns the
//
//        check digit, using the following algorithm
//
//        Sum the digits in the even numbered positions (positions 0, 2, 4, etc).
//
//        Multiply the result by three
//
//        Add the digits in the odd-numbered positions to the result (positions 1, 3, 5, etc.). Take the last digit of the result
//
//        If it's not 0 subtract tris digit from 10. Otherwise, keep it as D
//
//        Return me result
//
//        turning that the first digit on the left has the position 0)
//
//        Example:
//
//        Sven the identification number 39887
//
//        Sum the digts in the even-numbered positions: 37-18
//
//        Multiplied by three 183-54 Add the diges in the odd-numbered positions 54 (94) $7.
//
//        Last dige T
//
//        •Subtract 7 from 10 15-7
//
//        The expected result is for 19947.
//
//        Constraints

public class ComputeCheckDigit {
    public static int computeCheckDigit(String iN)
    {
        int sum = 0;
        for (int i = 0; i < iN.length(); i++) {
            if (i % 2 == 0) {
                sum += Integer.parseInt(iN.substring(i, i + 1));
            }
        }
        sum *= 3;
        for (int i = 0; i < iN.length(); i++) {
            if (i % 2 != 0) {
                sum += Integer.parseInt(iN.substring(i, i + 1));
            }
        }
        int lastDigit = sum % 10;
        if (lastDigit != 0) {
            return 10 - lastDigit;
        }
        return lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(computeCheckDigit("39847"));
    }

}
