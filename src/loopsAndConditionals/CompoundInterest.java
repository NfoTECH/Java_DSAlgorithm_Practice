package loopsAndConditionals;

public class CompoundInterest {
    // Formula = A = P(1 + R)^n where A = amount, P = principal, R = rate, n = no of years.
    public static void main(String[] args) {
        double amount;
        double principal = 10000;
        double rate = 0.01;

        for(int i = 1; i <= 20; i++) {
            amount = principal * Math.pow(1+rate, i) ;
            System.out.println(i + " " + amount);
        }
    }
}
