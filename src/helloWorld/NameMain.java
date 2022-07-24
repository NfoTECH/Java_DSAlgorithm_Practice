package helloWorld;

import java.util.Scanner;

public class NameMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NameExtension nameObject = new NameExtension();

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        nameObject.message(name);
    }
}
