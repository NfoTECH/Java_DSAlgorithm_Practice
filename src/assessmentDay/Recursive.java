package assessmentDay;

public class Recursive {
    public static int recursiveChallenge(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursiveChallenge(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveChallenge(5));
    }
}
