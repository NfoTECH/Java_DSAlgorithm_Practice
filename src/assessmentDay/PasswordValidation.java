package assessmentDay;
//
//String Challenge
//
//        Have the function StringChallenge (str) take the stx parameter being passed and determine if it passes
//        as a valid password that follows the list of constraints: A
//
//        1. It must have a capital letter.
//
//        2. It must contain at least one number.
//
//        3. It must contain a punctuation mark or
//
//        mathematical symbol.
//
//        4. It cannot have the word "password" in the string.
//
//        5. It must be longer than 7 characters and shorter than 31 characters.
//
//        If all the above constraints are met within the string, the your program should return the string true,
//        otherwise your program should return the string false.
//        For example: if str is "applelM7" then your program should return "true".
//        Examples
//
//        Input: "password123!!!!"
//
//        Output: false
//
//        Input: "turkey90AAA=" Output: true

public class PasswordValidation {
    public static String stringChallenge (String str) {
        if (str.length() < 8 || str.length() > 30) {
            return "false";
        }
        String strLower = str.toLowerCase();
        if (strLower.contains("password")) {
            return "false";
        }
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasPunctuation = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasPunctuation = true;
            }
        }
        if (hasCapital && hasNumber && hasPunctuation) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        String str = "passWord123!!!!";
        String str2 = "turkey90AAA=";
        System.out.println(stringChallenge(str));
        System.out.println(stringChallenge(str2));
    }
}
