package loopsAndConditionals;

public class ContinueLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;       // Same as Skip or Ignore
            }
            System.out.println(i);
        }
    }
}
