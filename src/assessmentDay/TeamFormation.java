package assessmentDay;

// Sample input
// [4, 8, 5, 6]
// minPlayers = 1
// minLevel = 5
// maxLevel = 7
// Sample output
// 3

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamFormation {
    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        // Write your code here
        int count = 0;
        Collections.sort(skills);
        for (int i = 0; i < skills.size(); i++) {
            if (skills.get(i) >= minLevel && skills.get(i) <= maxLevel) {
                count++;
            }
        }
        if (count < minPlayers) {
            return 0;
        }
        int result = 0;
        for (int i = minPlayers; i <= count; i++) {
            result += combination(count, i);
        }
        return result;
    }

    public static int combination(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return combination(n - 1, k - 1) + combination(n - 1, k);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 6, 4, 8, 7, 5, 2);
        System.out.println(countTeams(arr, 2, 3, 10));
    }
}
