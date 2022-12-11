package assessmentDay;

// Sample Input
// [9, 8,8,8,8,8,8,8,8,8]
// Sample Output
// [8,8,8,8,8,8,8,8,8]

// Sample Input
// [4,1,2,3,4]
// Sample Output
// [2,3,1,4]

// Sample Input
// [4,5]
// Sample Output
// [4, 5]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumValue {
    public static List<Integer> rearrange (List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size();
        int[] arr2 = new int[n];
        int i = 0;
        int j = n - 1;
        if (n % 2 == 0) {
            for (int k = 0; k < n; k++) {
                if (k % 2 == 0) {
                    arr2[k] = arr.get(j);
                    j--;
                } else {
                    arr2[k] = arr.get(i);
                    i++;
                }
            }
        } else {
            for (int k = 0; k < n; k++) {
                if (k % 2 == 0) {
                    arr2[k] = arr.get(i);
                    i++;
                } else {
                    arr2[k] = arr.get(j);
                    j--;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int k = n -1; k >= 0; k--) {
            list.add(arr2[k]);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> arr3 = new ArrayList<>();
        Collections.addAll(arr, 4,5);
        Collections.addAll(arr, 1,2,3,4);
        Collections.addAll(arr, 9,8,8,8,8,8,8,8,8,8);
        System.out.println(rearrange(arr));
        System.out.println(rearrange(arr2));
        System.out.println(rearrange(arr3));
    }
}

