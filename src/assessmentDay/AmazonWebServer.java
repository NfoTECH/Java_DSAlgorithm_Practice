package assessmentDay;

import java.util.Arrays;
import java.util.List;
public class AmazonWebServer {
    public static int findTotalPower(List<Integer> power) {
        // Write your code here
        int mod = 1000000007;
        int len = power.size();
        int[] dp = new int[len];
        dp[0] = power.get(0);
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i - 1] + power.get(i);
        }
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int sum = dp[j] - (i == 0 ? 0 : dp[i - 1]);
                int min = power.get(i);
                for (int k = i + 1; k <= j; k++) {
                    min = Math.min(min, power.get(k));
                }
                max = (max + (sum * min) % mod) % mod;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findTotalPower(Arrays.asList(2, 3, 2, 1)));
    }
}

