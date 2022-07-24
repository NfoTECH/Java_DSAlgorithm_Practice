package arrays;

public class EnhancedForStatement {
    public static void main(String[] args) {
        int[] arr = {3,8,4,9,5};
        int total = 0;

        for(int x: arr) {       // Java ForEach Loop (Variable Name: TheArray)
            total += x;
        }
        System.out.println(total);
    }
}
