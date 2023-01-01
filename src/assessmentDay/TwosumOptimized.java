package assessmentDay;

import java.util.HashMap;
import java.util.Map;

public class TwosumOptimized {

    //TIME COMPLEXITY O(N), SPACE COMPLEXITY O(1)
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

    //TIME COMPLEXITY O(N), SPACE COMPLEXITY O(1)
    public int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) {
                return new int[] { map.get(target - x) + 1, i + 1 };
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int[] result = twoSum(arr, 14);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    //IF THE INPUT ARRAY IS SORTED IN ASC ORDER, WE USE BINARY SEARCH
    //TIME COMPLEXITY O(N Log N), SPACE COMPLEXITY O(1)
    public int[] twoSum3(int[] numbers, int target) {
// Assume input is already sorted.
        for (int i = 0; i < numbers.length; i++) {
            int j = bSearch(numbers, target - numbers[i], i + 1);
            if (j != -1) {
                return new int[] { i + 1, j + 1 };
            } }
        throw new IllegalArgumentException("No two sum solution");
    }
    private int bSearch(int[] A, int key, int start) {
        int L = start, R = A.length - 1;
        while (L < R) {
            int M = (L + R) / 2;
            if (A[M] < key) {
                L = M + 1;
            } else {
                R = M;
            } }
        return (L == R && A[L] == key) ? L : -1;
    }
}
