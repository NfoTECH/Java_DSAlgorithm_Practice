package assessmentDay;



public class ReverseNum {
    public static String reverseNum (int num) {
        String s = String.valueOf(num);
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1234567890));
    }
}
