package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersExceptionHandling {
    public static void main(String[] args) {
        numbersExceptionHandling();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        // Note that when you pass the scanner as a parameter in the try block, it closes
        // automatically and as such, the finally{fileReader.close} block is no longer needed
        try (Scanner fileReader = new Scanner(file)) {

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
