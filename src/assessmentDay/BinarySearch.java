package assessmentDay;

public class BinarySearch {

    // METHOD 1: Iterative
    public int binarySearch(int[] inputArray, int target) {
        int start = 0;
        int end = inputArray.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (inputArray[mid] == target) {
                return mid;
            } else if (inputArray[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // METHOD 2: Recursive
    static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int midIndex = start + (end - start) / 2;

        if (arr[midIndex] == target) return midIndex;
        if (target < midIndex) return search(arr, target, start, midIndex - 1);
        return search(arr, target, midIndex + 1, end);
    }


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch.binarySearch(arr, 9));

        int result = search(arr, 9, 0, arr.length - 1);
        System.out.println(result);
    }
}
