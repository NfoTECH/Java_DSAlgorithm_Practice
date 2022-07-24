package numberAlgorithm;

public class ReverseNumber {
    public static int reverseNum(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + (n % 10);
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(987654321));
    }
}
