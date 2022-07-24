package strings;

public class RemoveWhitespaces {
    public static void main(String[] args) {

        // The below regex removes whitespaces at all intervals in the string
        String str = " My    name is     Fortunate";
        System.out.println(str.replaceAll("\\s+", ""));



        // Using trim() only removes white spaces before and after the word
        // To use 2 string functions with the dot notation, wrap inside String.valueOf
        String s = "   Hello  ";
        String u = String.valueOf(s.trim().length());
        System.out.println(u);
    }
}
