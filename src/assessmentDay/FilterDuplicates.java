package assessmentDay;

import java.util.LinkedList;

public class FilterDuplicates {
    public static int[] filterDuplicates(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int j : arr) {
            if (!list.contains(j)) {
                list.add(j);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,3,4,9};
        int[] result = filterDuplicates(arr);
        for (int j : result) {
            System.out.println(j);
        }
    }
}
