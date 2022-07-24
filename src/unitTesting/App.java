package unitTesting;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.testAddTwoNumbers();
    }

    public void testAddTwoNumbers() {
        int input1 = 5;
        int input2 = 6;
        int expected = 12;
        int result = addTwoNumbers(input1, input2);

        if(expected != result)
            throw new RuntimeException(String.format("addTwoNumbers expected %d but returned %d for inputs %d, %d", expected, result, input1, input2));
        else
            System.out.println("Test add two numbers passed");

    }
    public int addTwoNumbers(int x, int y) {
        return x + y;
    }
}
