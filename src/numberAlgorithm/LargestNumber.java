package numberAlgorithm;

public class LargestNumber {
    public static int largestNumber(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(40, 78, 19));
    }
}
