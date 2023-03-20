package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fiboFormula(50);
        System.out.println(result);
    }

    // DETERMINING FIBONACCI NUMBER USING MATH FORMULA
    static int fiboFormula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }


    // THE BELOW HAVE VERY HIGH LINEAR TIME COMPLEXITY AND AS SUCH IS NOT OPTIMAL
    static int fibo (int n) {
        if (n < 2) return n;

        return fibo(n - 1) + fibo(n - 2);
    }
}
