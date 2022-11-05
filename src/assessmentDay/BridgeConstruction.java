package assessmentDay;


import java.util.List;
//Bridge Construction
//
//        You work for the city engineering department and they have asked you to verify the construction of the towers used to build a new bridge over the main river.
//
//        Each tower is made from blocks of the same size and weight, but have different strengths.
//
//        The jth block has a strength of X, which corresponds to the number of blocks it can support above it. The weight of the connecting bridge and its traffic is considered negligible.
//
//        You need to find out the minimum possible number of towers that can be built out of the blocks in the supply yard.
//
//        input
//
//        The first line of input contains an integer n. representing the number of the boxes The second line of input contains in integers. representing the strength of the boxes IN
//
//        Output
//
//        Print the minimal possible number of piles. GLD-7
//
//        Constraints
//
//        1sns 100
//
//        0sXs100
//
//        Example #1
//
//        Input
//
//        3
//
//        Output
//
//        2
//
//        Expination: The first box can be put above the third box. The second box should be put alone in one pile
//
//        Example #2
//        Input : 0, 0, 10
//        Output : 2

public class BridgeConstruction {
    public static int getMinTowers(List<Integer> X) {
        int[] arr = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            arr[i] = X.get(i);
        }
        int[] dp = new int[X.size()];
        int max = 0;
        for (int i = 0; i < X.size(); i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(getMinTowers(List.of(0,1,2,3,4)));
    }
}
