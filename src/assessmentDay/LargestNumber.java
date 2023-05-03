package assessmentDay;

//write a Java programme with Given a list of non-negative integers,
//        arrange such that they form the largest number possible.
//        The result is going to be very large, hence return the result to form a string.
//        input[0,9,8,56,897,979,2,1]
//        output: 99798978210

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] input = {0,9,8,56,897,979,2,1};
        System.out.println(largestNumber(input));
    }

    // SOLUTION 1
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }
        return sb.toString();
    }


    // SOLUTION 2

    public static String largestNumber2(int[] nums) {
        // Convert the integers to strings
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = Integer.toString(nums[i]);
        }

        // Sort the strings using a custom comparator
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }
        });

        // Concatenate the sorted strings
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }

        // Handle the case where the input array contains only zeros
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}

