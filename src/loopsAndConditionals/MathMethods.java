package loopsAndConditionals;

import java.util.Random;

public class MathMethods {
    public static void main(String[] args) {
        // System.out.println(Math.abs(-27.5)); // OUTPUT = 27.5
        // System.out.println(Math.ceil(7.5));  // OUTPUT = 8.0
        // System.out.println(Math.floor(7.5);  // OUTPUT = 7.0
        // System.out.println(Math.max(8.6, 5.2)); // OUTPUT = 8.6
        // System.out.println(Math.min(8.6, 5.2)); // OUTPUT = 5.2
        // System.out.println(Math.pow(5, 3));     // OUTPUT = 125.0
        // System.out.println(Math.sqrt(9));       // OUTPUT = 3

        Random dice = new Random();
        int num;
        for (int i = 0; i <=5; i++) {
            num = dice.nextInt(6) + 1;
            System.out.println(num);
        }

    }
}
