package assessmentDay;


// Write an algorithm to confirm if there are character repetition and print the removeDuplicate if available
// A sample word is "School" Kindly implement the below functions
// public boolean isDuplicateExisting (String word)
// public void printDuplicate(String word)

public class PrintDuplicateChar {

        public static void main(String[] args) {
            String word = "Charismatic";

            PrintDuplicateChar PrintDuplicateChar = new PrintDuplicateChar();
            System.out.println(PrintDuplicateChar.isDuplicateExisting(word));

            PrintDuplicateChar.printDuplicate(word);
        }

        public boolean isDuplicateExisting(String word) {
            word = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void printDuplicate(String word) {
            word = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        System.out.println(word.charAt(i));
                    }
                }
            }
        }
}
