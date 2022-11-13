package assessmentDay;

public class IsPerfect {
    public String isPerfect (int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return "Perfect";
        } else {
            return "Not Perfect";
        }
    }

    public static void main(String[] args) {
        IsPerfect p = new IsPerfect();
        System.out.println(p.isPerfect(56));
    }
}
