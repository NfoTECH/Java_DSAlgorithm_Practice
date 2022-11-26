package assessmentDay;

import java.util.Arrays;

public class SecondMax {
    public int returnSecondMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public int returnSecondMax2(int[] nums) {
        Arrays.sort(nums);
        if (nums.length > 1) {
            return nums[nums.length - 2];
        } else {
            return nums[0];
        }
    }

public static void main(String[] args) {
        SecondMax sm = new SecondMax();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 77, 76, 10};
        System.out.println(sm.returnSecondMax(nums));
        System.out.println(sm.returnSecondMax2(nums));
    }
}
