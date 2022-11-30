package assessmentDay;

//Given a string that consists of only two types of characters: '(' and ')', balance the parentheses by inserting either a '(' or a ')' as many times as necessary. Determine the minimum number of characters that must be inserted.
//
//        Example
//
//        s="(0))"
//
//        To make it a valid sequence, insert a '('at the beginning of the string, resulting in "((()))". The string is balanced after 1 insertion.
//
//        Function Description
//
//        Complete the function getMinOperations in the editor below. The function must return the minimum number of operations needed to make the parentheses sequence valid.
//
//        getMinOperations has the following parameter(s): string s: a string of parentheses
//
//        Return
//
//        int: the minimum number of insertions required to balance the parentheses
//
//        Constraints
//
//        • 1 s length of ss 105
//
//        .
//
//        ► Input Format For Custom Testing
//
//        ▾ Sample Case 0
//
//        Sample Input For Custom Testing
//
//        STDIN
//
//        Function
//
//        ())) → s = '()))'
//
//        Sample Output
//
//        2
//
//        Explanation
//
//        Insert a '(' 2 times at the beginning of the string to make it valid: "((0))"

public class GetMinOperations {
    public static int getMinOperations(String s) {
        int count = 0;
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                if (open == 0) {
                    count++;
                } else {
                    open--;
                }
            }
        }
        return count + open;
    }

    public static void main(String[] args) {
        System.out.println(getMinOperations("()))"));
        System.out.println(getMinOperations("()()"));
    }
}
