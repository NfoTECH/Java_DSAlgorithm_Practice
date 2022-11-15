package assessmentDay;

//Your Mission
//
//        RULES
//
//        As input, you are given a list of scores. Coding Score can be anywhere between 300 and 850. For the purpose of this task, levels are defined in the following way:
//
//        README
//
//        Poor: 300-599
//
//        Fair 600-699
//
//        Good: 700-749
//
//        Excellent: 750-799
//
//        SETTINGS
//
//        Elite: 800+
//
//        Calculate how many users are there in each level, then return a list of strings where each string represents a level and a number of users within that level, formatted like LevelName - Number The levels should be sorted in decreasing order of those numbers, omitting any levels that have no users. In case of a tie, the higher level should appear first.
//
//        For example, if you had this input.
//
//        1330. 723, 330, 925)
//
//        then you should return the following list of strings:

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EliteScores {
    String[] solution (int[] scores) {
        // write your code in here
        Map<String, Integer> map = new HashMap<>();
        map.put("Elite", 0);
        map.put("Excellent", 0);
        map.put("Good", 0);
        map.put("Poor", 0);
        map.put("Fair", 0);

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 300 && scores[i] <= 599) {
                int temp = map.get("Poor");
                map.put("Poor", temp + 1);
            }
            if (scores[i] >= 600 && scores[i] <= 699) {
                int temp = map.get("Fair");
                temp++;
                map.put("Fair", temp);
            }
            if (scores[i] >= 700 && scores[i] <= 749) {
                int temp = map.get("Good");
                temp++;
                map.put("Good", temp);
            }
            if (scores[i] >= 750 && scores[i] <= 799) {
                int temp = map.get("Excellent");
                temp++;
                map.put("Excellent", temp);
            }
            if (scores[i] >= 800) {
                int temp = map.get("Elite");
                temp++;
                map.put("Elite", temp);
            }
        }
        List<String> hold = new LinkedList<>();
        while (map.size() > 0) {
            int max = Integer.MIN_VALUE;
            String key = "";
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            if (max == 0) {
                map.clear();
            }
            else {
                map.remove(key);
                hold.add((String.format("%s - %d", key, max)));
            }
        }
        String[] result = new String[hold.size()];
        for (int i = 0; i < hold.size(); i++) {
            result[i] = hold.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        EliteScores eliteScores = new EliteScores();
        int[] scoresArray = {550,654,816,432,390,302,380,409,462,556};
        String[] result = eliteScores.solution(scoresArray);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
