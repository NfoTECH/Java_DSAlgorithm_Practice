package arrays;

public class ArrayTab {
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int[] arr = {53,23,65,15,3};

        for (int i =  0; i < arr.length; i++) {
            System.out.println(i + "\t\t" + arr[i]);
        }
    }
}