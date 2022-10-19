package assessmentDay;//Searching Challenge
//
//        Have the function
//
//        SearchingChallenge (str) take
//
//        the str parameter being passed and determine if the string is a valid username according to the following rules:
//
//        1. The username is between 4 and 25 characters.
//
//        2. It must start with a letter.
//
//        3. It can only contain letters, numbers, and the underscore character.
//
//        4. It cannot end with an underscore character.
//
//        If the username is valid then your program should return the string true, otherwise return the string false.

public class SearchingChalleng2 {
    public static String SearchingChallenge(String str) {
        // code goes here
        String result = "";
        if (str.length() >= 4 && str.length() <= 25) {
            if (Character.isLetter(str.charAt(0))) {
                if (str.charAt(str.length() - 1) != '_') {
                    for (int i = 0; i < str.length(); i++) {
                        if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i) == '_') {
                            result = "true";
                        } else {
                            result = "false";
                            break;
                        }
                    }
                } else {
                    result = "false";
                }
            } else {
                result = "false";
            }
        } else {
            result = "false";
        }
        return result;
    }
}
