package assessmentDay;

//
//        You are given a list of XP points of all users, your task is to calculate how many users are there in each level and print them in decreasing order of those numbers. In case of a tie, higher level should appear
//
//        first.
//
//        Levels are defined in the following way:
//
//        Recruit: 0- 999 XP
//
//        Soldier: 1000 4999 XP
//
//        Warrior: 5000 9999 XP
//
//        Captain: 10000 49999 XP
//
//        Minja: 50000+ XP
//
//        Return a list of strings where each string would represent a level and number of users within that level, for example:
//
//        Soldier - 15
//
//        Recruit -33 Ninja - 1
//
//        Levels which don't have any users should not be included.
//
//        [execution time limit] 3 seconds (Java)
//
//        input) array Integer points
//
//        Levels which don't have any users should not be included.
//
//        ⚫ [execution time limit] 3 seconds (java)
//
//        [input] array.integer points
//
//        An array containing list of all user XP points
//
//        [output] array.string
//
//        List of levels with the number of corresponding users sorting in decreasing order of those numbers
//
//        [Java] Syntax Tips
//
//// help message to the console // Peturns a string
//
//        Globale declared here will cause a compilation EKOF,
//
//        11 declare variables inside the function instead! String helloWorld(String name) (
//
//        System out printint This prints to the console when you return

public class SoldierWarriorNinja {
    String[] solution(int[] points) {
        // write your code in Java SE 8
        int recruit = 0;
        int soldier = 0;
        int warrior = 0;
        int captain = 0;
        int ninja = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i] >= 0 && points[i] <= 999) {
                recruit++;
            } else if (points[i] >= 1000 && points[i] <= 4999) {
                soldier++;
            } else if (points[i] >= 5000 && points[i] <= 9999) {
                warrior++;
            } else if (points[i] >= 10000 && points[i] <= 49999) {
                captain++;
            } else if (points[i] >= 50000) {
                ninja++;
            }
        }
        String[] result = new String[5];
        result[0] = "Recruit " + recruit;
        result[1] = "Soldier " + soldier;
        result[2] = "Warrior " + warrior;
        result[3] = "Captain " + captain;
        result[4] = "Ninja " + ninja;
        return result;


    }

    public static void main(String[] args) {
        SoldierWarriorNinja SoldierWarriorNinja = new SoldierWarriorNinja();
        int[] points = {999,4999,9999,49999,50000};
        String[] result = SoldierWarriorNinja.solution(points);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
