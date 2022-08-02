package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int total = 0;
        int value= 1;

        for(int i = binary.size() -1 ; i >= 0 ; i--){
            if(binary.get(i) == 1) total += value;
            value *= 2;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,1,1))));
    }
}