package assessmentDay;

import java.util.Arrays;

//A non-empty array A consisting of N integers is given, write a function that returns the prime numbers in the array.
//        For example, given [3, 67, 12, 7, 11, 9], returns [3, 67, 7, 11]

public class PrimeNumbers {
    public int[] solution(int[] A) {
        int[] result = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (isPrime(A[i])) {
                result[count] = A[i];
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


//    public boolean isPrime(int n) {
//        if (n <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        PrimeNumbers solution3 = new PrimeNumbers();
        int[] A = {3, 67, 12, 7, 11, 9};
        System.out.println(Arrays.toString(solution3.solution(A)));
    }
}

