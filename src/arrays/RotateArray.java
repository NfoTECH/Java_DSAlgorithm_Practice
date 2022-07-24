package arrays;

import java.util.Arrays;
import java.util.Collections;

public class RotateArray {
    public static void main(String[] args) {
        Integer [] arr = {4,5, 6};
        Integer [] arr2 = {4,5, 6};

        Collections.rotate(Arrays.asList(arr2), -1); // Left rotation
        Collections.rotate(Arrays.asList(arr), 1); // Right rotation




        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }
}
