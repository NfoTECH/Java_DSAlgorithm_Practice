package assessmentDay;

import java.util.HashMap;

public class TargetTwoSum {
    // TIME COMPLEXITY: O(N^2); SPACE COMPLEXITY: O(1)
    public int[] twoSum (int[] inputArray, int targetSum) {
        int[] result = new int[2];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == targetSum) {
                    result[0] = inputArray[i];
                    result[1] = inputArray[j];
                }
            }
        }
        return result;
    }

   // OPTIMIZED SOLUTION WITH TIME COMPLEXITY OF O(N); SPACE COMPLEXITY = O(1)
//    public static int[] twoSum(int[] inputArray, int targetSum) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < inputArray.length; i++) {
//            int complement = targetSum - inputArray[i];
//            if (map.containsKey(complement)) {
//                return new int[]{complement, inputArray[i]};
//            }
//            map.put(inputArray[i], i);
//        }
//        return new int[0];
//    }

    public static void main(String[] args) {
        TargetTwoSum targetTwoSum = new TargetTwoSum();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int[] result = targetTwoSum.twoSum(arr, 18);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
