package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTutorial {
    public static void main(String[] args) {
        int[] array = {32,6,657,7,34,33};
        System.out.println(maximum(array));

        // SWAP ELEMENTS OF A LIST

        List<Integer> list = new ArrayList<>(Arrays.asList(35,143,56,677,232));
//        Collections.addAll(list, 35,143,56,677,232);
        swapList(list, 0, 3);
        System.out.println(list);

        //    SWAP ELEMENTS OF AN ARRAY

        int[] arr = {34, 53, 133, 45, 989};
        swapArray(arr, 0, 4);
        System.out.print (Arrays.toString(arr));
    }

    static int maximum (int[] arr) {
        if (arr.length == 0) return -1;  //Edge case
        int max = arr[0];
        for (int i: arr) if (i > max) max = i;
        return max;
    }

    static void swapList (List<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

    }

    static void swapArray (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//    CONVERT ARRAY TO LIST (SAME AS STRING)
//    int[] array = {1, 2, 3, 4, 5};
//    List<Integer> list = Arrays.asList(array);

//    CONVERT LIST TO ARRAY
//    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//    int[] array = list.stream().mapToInt(Integer::intValue).toArray();    OR
//    Integer[] array = list.toArray(new Integer[0]);

//    CONVERT LIST OF STRINGS TO ARRAY
//    List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
//    String[] array = list.toArray(new String[0]);
