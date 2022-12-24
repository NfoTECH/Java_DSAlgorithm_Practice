package assessmentDay;

import java.util.HashMap;

public class TwosumOptimized {
    public static int[] twoSum(int[] inputArray, int targetSum) {
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
        int[] result = twoSum(arr, 14);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
