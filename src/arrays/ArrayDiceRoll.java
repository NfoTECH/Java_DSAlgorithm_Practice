package arrays;

import java.util.Random;
public class ArrayDiceRoll {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] freq = new int[7];

        for (int i = 1; i < 1000; i++) {
            int side = rand.nextInt(6) + 1;
            ++freq[side];
        }
        System.out.println("Face\tFrequency");

        for(int j = 1; j < freq.length; j++) {
            System.out.println(j + "\t\t" + freq[j]);
        }
    }
}
