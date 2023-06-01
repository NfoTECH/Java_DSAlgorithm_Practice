package assessmentDay;

//String str = "Rose rose is red";
// Expected output = "Rose is red"
// Remove duplicate words from the string and take care of the case sensitivity
public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String str = "Rose rose is red";
        System.out.println(removeDuplicateWords(str)); //output: rose is red
    }

    static String removeDuplicateWords(String str) {
        str = str.toLowerCase();
        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (!result.contains(words[i])) result += words[i] + " ";
        }
        return result;
    }
}
