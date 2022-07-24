package arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {36,4,1,22,24};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
