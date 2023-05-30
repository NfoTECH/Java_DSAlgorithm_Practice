package assessmentDay;

//Javanais, also known as "Langue de feu (fire language), is a slang coding process that was used in the late 19th century by some criminals to encrypt their conversations. Write a program that returns the Javanais translation of a sentence.
//
//        How it works
//
//        Before each of the following vowel (a, e, i, o, u), insert the parasitic syllable
//
//        • Unless the vowel is preceded by another vowel.
//
//        Implementation
//
//        Implement the method translate (text) which:
//
//        takes as input [text] a string of fewer than 255 characters;
//
//        returns the Javanais translation as a string.
//
//        For simplicity, the inputs contain only lowercase letters.

public class Translate {
    public static String translate(String text) {
        String vowels = "aeiou";
        StringBuilder translation = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) != -1 && (i == 0 || vowels.indexOf(text.charAt(i-1)) == -1)) {
                translation.append("av").append(c);
            } else {
                translation.append(c);
            }
        }
        return translation.toString();
    }

    public static void main(String[] args) {
        System.out.println(translate("the"));
        System.out.println(translate("this is fun"));
        System.out.println(translate("a quick brown fox jumps over the lazy dog"));
    }
}


//    public static int translate (String text){
//        int count = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
//                count++;
//            }
//        }
//        return count;

//    }