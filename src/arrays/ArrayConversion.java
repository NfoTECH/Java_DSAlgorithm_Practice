package arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayConversion {
    private static int arrayConversion(ArrayList<Integer> integers) {
        int iteration = 1;                                  //to count how many times we repeated the process
        while (integers.size() != 1) {                      //if the size is equals to 1, we've reached the end and should return the first item
            ArrayList<Integer> temp = new ArrayList<>();  //created to store consecutive additions or multiplications
            if (iteration % 2 != 0) {                       //if we've done this an odd no of times i.e 1 or 3 or 5....
                for (int i = 0; i < integers.size(); i++) {
                    temp.add(integers.get(i) + integers.get(i + 1));    //adding two consecutive numbers
                    i++;                                    //incrementing i by 1 so that when the loop is done and i++ in the loop condition-
                }                                           //is implemented, I would have shifted two places
            } else {                                        //else we've done it an even no of times
                for (int i = 0; i < integers.size(); i++) {
                    temp.add(integers.get(i) * integers.get(i + 1));
                    i++;
                }
            }
            integers = temp;                                //this is where out temp array is assigned to our main array, if all goes well,
                                                            //the size would be reduced by half
            iteration++;                                    //to increase the count
        }
        return integers.get(0);                             //return first item in the arraylist
    }

    public static void main(String[] args) {
        System.out.println(arrayConversion(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8))));
    }
}
