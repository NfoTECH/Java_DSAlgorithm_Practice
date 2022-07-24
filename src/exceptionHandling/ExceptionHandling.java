package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    private static int divideLBYL(int x, int y) {   //LBYL is look before you leap
        if (y != 0) {                   // A check that the divisor is not 0;
            return x / y;
        } else {
            return 0;
        }
    }

    // OR

    private static int divideEAFP(int x, int y) {       //EAFP is ask for forgiveness than permission
        try {                              //try and catch also checks that the divisor is not 0
            return x / y;
        }
        catch (ArithmeticException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));

        int z = getIntEAFP();
        System.out.println("z is " + z);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a number");
        return s.nextInt();
    }


//    private static int getIntLBYL() {
//        Scanner s = new Scanner(System.in);
//        boolean isValid = true;
//        System.out.println("Enter a number");
//        String input = s.next();
//        for (int i = 0; i < input.length(); i++) {
//            if (!Character.isDigit(input.charAt(i))) {  //If input character is not digit
//                isValid = false;
//                break;
//            }
//        }
//        if (isValid) {
//            return Integer.parseInt(input);
//        }
//        return 0;
//    }

    // Either the above commented out or the below which is preferable in this context

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        try {
            return s.nextInt();
        }
        catch (InputMismatchException e) {
            return 0;
        }
    }
}

