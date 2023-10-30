package assessmentDay;//The marketing team at CodeSignal would like to know how many users there are in each Coding Score range, so that they can share that information on our website. They've askes you to create a report containing that information.

//        As input, you are given a list of scores. Coding Score can be anywhere between 300 and 850. For the purpose of this task, levels are defined in the following way:
//
//        Poor: 300-599
//
//        Good: 700-749
//
//        Fair: 600-699 Excellent: 750-799 Elite: 800+
//
//        Calculate how many users are there in each level, then return a list of
//
//        strings where each string represents a level and a number of users within that level, formatted like LevelNane Number. The levels should be sorted in decreasing order of those numbers, omitting any levels that have no users. In case of a tie, the higher level should appear first.
//
//        For example, if you had this input...
//
//        [330, 723, 730, 825]
//
//        then you should return the following:
//
//        [Good "2", "Elite 1", "Poor 1"]

public class Algo3 {
    String[] solution(int[] scores) {
        // write your code in Java SE 8
        int poor = 0;
        int good = 0;
        int fair = 0;
        int excellent = 0;
        int elite = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 300 && scores[i] <= 599) {
                poor++;
            } else if (scores[i] >= 600 && scores[i] <= 699) {
                fair++;
            } else if (scores[i] >= 700 && scores[i] <= 749) {
                good++;
            } else if (scores[i] >= 750 && scores[i] <= 799) {
                excellent++;
            } else if (scores[i] >= 800 && scores[i] <= 850) {
                elite++;
            }
        }
        String[] result = new String[5];
        result[0] = "Poor " + poor;
        result[1] = "Good " + good;
        result[2] = "Fair " + fair;
        result[3] = "Excellent " + excellent;
        result[4] = "Elite " + elite;
        return result;
    }

    public static void main(String[] args) {
        Algo3 algo3 = new Algo3();
        int[] scores = {330, 723, 730, 825};
        String[] result = algo3.solution(scores);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
