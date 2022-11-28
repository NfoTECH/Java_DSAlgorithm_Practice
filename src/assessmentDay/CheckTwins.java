package assessmentDay;


//A twin of a word is a word written with the same letters (case insensitive) but not necessarily in the same order.
//
//        For example sint is a twin of Lates
//
//        The twinca, y method should return true if is the twin of and ralas otherwise a and b are two non-null strings
//
//        Write the body of the tarvista, b method.

public class CheckTwins {
    public static boolean isTwin(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            String letter = a.charAt(i) + "";
            if (!b.contains(letter)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isTwin("Lookout", "Outlook"));
        System.out.println(isTwin("race", "care"));
        System.out.println(isTwin("abc", "cba"));
    }

}
