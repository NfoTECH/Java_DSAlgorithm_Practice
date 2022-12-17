package assessmentDay;

public class TargetThreeSum {
    public int[] threeSum (int[] inputArray, int targetSum) {
        int[] result = new int[3];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                for (int k = j + 1; k < inputArray.length; k++) {
                    if (inputArray[i] + inputArray[j] + inputArray[k] == targetSum) {
                        result[0] = inputArray[i];
                        result[1] = inputArray[j];
                        result[2] = inputArray[k];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TargetThreeSum targetThreeSum = new TargetThreeSum();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int[] result = targetThreeSum.threeSum(arr, 18);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
