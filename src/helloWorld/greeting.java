package helloWorld;

import java.sql.SQLOutput;
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter hello");
        String s = in.next();
        if(s.equalsIgnoreCase("hello"))
            System.out.println(s + " there");
    }
}

