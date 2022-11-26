package assessmentDay;

public class IsPrime {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPrime ip = new IsPrime();
        System.out.println(ip.isPrime(2));
    }
}
