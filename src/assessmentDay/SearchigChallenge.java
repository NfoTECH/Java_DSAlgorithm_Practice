package assessmentDay;//Searching Challenge
//
//        Have the function
//
//        SearchingChallenge (str) take
//
//        the str parameter being passed, which will contain only alphabetic characters and spaces, and return the first non-repeating character. For example: if str is "agettkgaeee" then your program should return k. The string will always contain at least one character and there will always be at least one non-repeating character.
//
//        10
//
//        11
//
//        12
//
//        13
//
//        14
//
//        15
//
//        16
//
//        17

public class SearchigChallenge {
    public static String SearchingChallenge(String str) {
        // code goes here
        String[] arr = str.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                result = arr[i];
                break;
            }
        }
        return result;
    }
}
