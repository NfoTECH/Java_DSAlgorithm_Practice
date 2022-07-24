package DateManipulations;

import java.time.LocalDate;
import java.util.Scanner;

public class FindDateOfBirth {
    public static void main(String[] args) {
        LocalDate year = LocalDate.now();   // .now() obtains current date from System clock in default time zone
        int calculateYear = year.getYear();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");

        int calculateAge = input.nextInt();
        int birthYear = calculateYear -calculateAge;
        System.out.println("You were born in " + birthYear);


    }
}
