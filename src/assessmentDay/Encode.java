package assessmentDay;

public class Encode {
    public static String encode(String plainText) {
        if (plainText == null || plainText.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = plainText.charAt(0);
        for (int i = 1; i < plainText.length(); i++) {
            char curr = plainText.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                sb.append(count);
                sb.append(prev);
                count = 1;
                prev = curr;
            }
        }
        sb.append(count);
        sb.append(prev);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("aaabbbcc"));
    }
}
