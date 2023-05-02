package assessmentDay;

// Write an algorithm to remove removeDuplicate character in the following word ("Charismatic") and print the result

public class removeDuplicate {
    public static void main(String[] args) {
        String word = "Charismatic";
        System.out.println(removeDuplicates(word));
    }

    static String removeDuplicates(String word) {
        String result = "";
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!result.contains(String.valueOf(currentChar))) result += currentChar;
        }
        return result;
    }

//    static String removeDuplicates (String word) {
//        String result = "";
//        word = word.toLowerCase();
//        for (int i = 0; i < word.length(); i++) {
//            if (result.indexOf(word.charAt(i)) == -1) {
//                result += word.charAt(i);
//            }
//        }
//        return result;
//    }
}


