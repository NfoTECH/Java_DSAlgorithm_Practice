package strings;

public class StringLength {
    public static void main(String[] args) {
        String text = "    ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String count = String.valueOf(text.length());
        System.out.println(count);          // Prints the length of the alphabets passed in as String in a variable "count"
        System.out.println(text.trim().length());    // Prints the length of String directly without saving in a variable

        //
        System.out.println("\"My name is Fortunate\"\n And I am a boy"); //String literal to print " and texts in a new line
        System.out.println("\t1\t2\t3\n");  // Literal to print 1 2 3 spaced with tap and then new line

        for (int i= 0; i < 26; i++){
            char letter = (char) ('a' + i);
            System.out.print(letter);       // Prints the lowercase alphabets from a to z
        }
    }

}
