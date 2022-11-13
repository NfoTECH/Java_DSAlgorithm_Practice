package assessmentDay;

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

    public static void main(String[] args) {
        SecondMax p = new SecondMax();
        System.out.println(p.returnSecondMax(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
