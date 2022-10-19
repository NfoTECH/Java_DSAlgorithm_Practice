package assessmentDay;//
//You're given an array of integers a Let's call ( a + 11 ,s[11,s[1+
//
//        11) a good tuple, if exactly 2 out of the 3 numbers in it are equal. For
//
//        example, (2, 1, 2) is a good tuple, but (1, 1, 1) and (1, 2, 3) are not.
//
//        Your task is to return the number of good tuples in a
//
//        Note: The tuples may be overlapping.
//
//        Example
//
//        . For a = \{1, 1, 1, 2, 1, 3, 4\} the output should be solution (a) = 2
//
//        Let's analyze all the tuples of 3 consecutive numbers in a
//
//        (a[0], [1], [2]) = (1, 1, 1) all three of the
//
//        numbers are equal, so this is not a good tuple.
//
//        (a[1], [2], [31) (1, 1, 2) exactly 2 out of 3 numbers are equal, so this is a good tuple.
//
//        (a(2), (3), (41) (1, 2, 11 exactly 2 out of 3
//
//        numbers are equal, so this is a good tuple
//
//        (x\{3\}, x\{4\}, x\{5\})(2, 1, 3) none of the numbers are equal, so this is not a good tuple.
//
//        (a(4), s(3), s(6))(1, 1, 4) none of the numbers are equal, so this is not a good fuple.
//
//        The only good tuples here are 11. 1. 21 and the answer is (1.2, 1) * SO
//
//        - For - 11. 1. 2. 1. E 1. 11, the output should be



public class Algoexpert {
    int solution (int[] a) {
        // write your code in Java SE 8
        int count = 0;
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
                count++;
            } else if (a[i] == a[i + 1] || a[i] == a[i + 2] || a[i + 1] == a[i + 2]) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Algoexpert algoexpert = new Algoexpert();
        int[] a = {1,1,1,2,1,3,4};
        System.out.println(algoexpert.solution(a));
    }
}