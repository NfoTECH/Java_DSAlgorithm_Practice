package assessmentDay;

public class BinarySearch {
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

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch.binarySearch(arr, 9));
    }
}
