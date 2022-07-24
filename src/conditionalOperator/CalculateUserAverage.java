package conditionalOperator;

import java.util.Scanner;

public class CalculateUserAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int counter = 0;

        while(counter < 5) {
            int grade = input.nextInt();
            total += grade;
            counter++;
        }
        double average = total / 5;
        System.out.println("Average = " + average);
    }
}
