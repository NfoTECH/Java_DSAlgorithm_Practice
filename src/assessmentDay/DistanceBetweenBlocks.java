package assessmentDay;

//Write a function:

// class solution ( public int solution(int[] blocks); }
//
//        that, given an array blocks consisting of N integers denoting the heights of the blocks,
//        return the longest possible distance that two blocks can make between each other starting from one of the blocks.
//
//        Examples:
//
//        1. Given blocks [2, 6, 8, 5), the function should return 3. If starting from blocks[0],
//        the first frog can stay where it is and the second frog can jump to blocks[2] (but not to blocks[3]).
//        Given blocks = [1, 5, 5, 2, 6], the function should return 4. If starting from blocks[3],
//        the first frog can jump to blocks[1], but not blocks(0), and the second frog can jump to blocks[4].
//        2. Given blocks = [1, 5, 5, 2, 6], the function should return 4. If starting from blocks[3],
//        the first frog can jump to blocks[1], but not blocks[0], and the second frog can jump to blocks[4].
//        Write an efficient algorithm for the following assumptions:
//
//        Nis an integer within the range [2.200,000); each element of array blocks is an integer within the range [1..1,000,000,000).

public class DistanceBetweenBlocks {
    public int solution(int[] blocks) {

        int result = 0;
        int[] dp = new int[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (blocks[i] >= blocks[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        DistanceBetweenBlocks s = new DistanceBetweenBlocks();
        int[] blocks = {2, 6, 8, 5};
        int[] blocks2 = {1,5,5,2,6};
        int[] blocks3 = {1,1};
        System.out.println(s.solution(blocks));
        System.out.println(s.solution(blocks2));
        System.out.println(s.solution(blocks3));
    }
}
