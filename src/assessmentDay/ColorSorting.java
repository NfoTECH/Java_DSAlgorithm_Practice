package assessmentDay;

//Given an array nums with a objects colored red white, or blue, sort them in place so that objects of the same color are adjacent, with the colors in the order red, white, and blue:
//
//        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively
//
//        You must solve this problem without using the brary's sort function.
//
//        input nums12.09.1.1.0 Output [0,0,1.1.2.2


public class ColorSorting {
    public int[] sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int curr = 0;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                int temp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = temp;
            } else if (nums[curr] == 2) {
                int temp = nums[p2];
                nums[p2--] = nums[curr];
                nums[curr] = temp;
            } else {
                curr++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        ColorSorting colorSorting = new ColorSorting();
        int[] nums = {0,0,2,1,1,2};
        int[] nums2 = {2,0,2,1,1,0};
        int[] result = colorSorting.sortColors(nums);
        int[] result2 = colorSorting.sortColors(nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            System.out.println(result2[i]);
        }
    }
}
