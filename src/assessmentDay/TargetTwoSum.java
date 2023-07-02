package assessmentDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TargetTwoSum {
    // TIME COMPLEXITY: O(N^2); SPACE COMPLEXITY: O(1)
    public static int[] twoSum (int[] inputArray, int targetSum) {
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
    public static List<Integer> twoSums (List<Integer> inputArray, int targetSum) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = 0; j < inputArray.size(); j++) {
                if (inputArray.get(i) + inputArray.get(j) == targetSum) {
                    result.add(inputArray.get(i));
                    result.add(inputArray.get(j));
                    return result;
                }
            }
        }
        return result;
    }

//    OPTIMIZED SOLUTION WITH TIME COMPLEXITY OF O(N); SPACE COMPLEXITY = O(1)
    public static int[] twoSumOptimized(int[] inputArray, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            int complement = targetSum - inputArray[i];
            if (map.containsKey(complement)) {
                return new int[]{complement, inputArray[i]};
            }
            map.put(inputArray[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15);
        int target = 18;

        int[] result = TargetTwoSum.twoSum(arr, target);
        List<Integer> resultList = TargetTwoSum.twoSums (integerList, target);
        int[] optimizedResult = TargetTwoSum.twoSumOptimized(arr, target);

        System.out.println(Arrays.toString(result));
        System.out.println(resultList);
        System.out.println(Arrays.toString(optimizedResult));


        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
