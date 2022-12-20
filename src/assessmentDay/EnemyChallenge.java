package assessmentDay;

//Array Challenge
//
//        Have the function ArrayChallenge (arr) take the array of numbers stored
//        in arr and from the position in the array where a 1 is, return the number of spaces either
//        left or right you must move to reach an enemy which is represented by a 2. For example: if arr is [0,
//
//        0, 1, 0, 0, 2, 0, 2] then your program should return 3 because the closest enemy (2) is 3 spaces away from the 1.
//        The array will contain any number of O's and 2's, but only a single 1. It may not contain any 2's at all as well,
//        in that case your program should return a 0.
//        Examples
//
//        Input: new int[] {1, 0, 0, 0, 2, 2, 2}
//
//        Output: 4
//
//        Input: new int[] (2, 0, 0, 0, 2, 2, 1, 0}
//
//        Output: 1

public class EnemyChallenge {
    public static int arrayChallenge(int[] arr) {
        int distance = 0;
        int oneIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                oneIndex = i;
            }
        }
        for (int i = oneIndex + 1; i < arr.length; i++) {
            if (arr[i] == 2) {
                distance = i - oneIndex;
                break;
            }
        }
        for (int i = oneIndex - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                if (distance == 0) {
                    distance = oneIndex - i;
                } else {
                    distance = Math.min(distance, oneIndex - i);
                }
            }
        }
        return distance;
    }



    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 2, 2, 2};
        int[] arr2 = {2, 0, 0, 0, 2, 2, 1, 0};
        int[] arr3 = {9, 0, 0, 0, 9, 9, 1, 0}; //when there is no enemy(int 2) in the array

        System.out.println(arrayChallenge(arr));
        System.out.println(arrayChallenge(arr2));
        System.out.println(arrayChallenge(arr3));
    }

}
