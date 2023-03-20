package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {43,5,76,4,87,98,56,23};
        int target = 23;
        int result = search(array, target, 0, array.length - 1);
        System.out.println(result);

    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;
        if (target < mid) return search(arr, target, start, mid - 1);
        return search(arr, target, mid + 1, end);
    }
}
