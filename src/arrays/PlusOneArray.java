package arrays;

import java.util.Arrays;

public class PlusOneArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 9};
        String holder = "";    // Creating an empty String holder to put the array values
        for (int i = 0; i < arr.length; i++) {      // Looping through the array
            holder += String.valueOf(arr[i]);   // Converting the integer to String and add to the String holder
        }
        System.out.println(holder);
        int number = Integer.valueOf(holder); // Converting holder to an integer called number
        number++;                             // Incrementing number by 1
        holder = String.valueOf(number);      // Converting number to String called holder
        System.out.println(holder);
        String[] result = holder.split(""); // Splitting holder into the String array
        int[] result2 = new int[result.length]; // Creating an Integer array the same size as the String array holding the split result
        for (int i = 0; i < result.length; i++)  //looping through the result1
            result2[i] = Integer.valueOf(result[i]); // Converting the value of result to int and putting it in result2

        System.out.println(Arrays.toString(result2));
//        for (Integer x: result2)
//            System.out.println(x);

    }

}
