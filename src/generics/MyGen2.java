package generics;

import java.util.SortedMap;

public class MyGen2 {
    public static<E> void printArray(E[] elements) {
        for (E elem : elements) {
            System.out.println(elem);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50};
        Character[] charArray = {'N','W','A','C','H','U','K','W','U'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }
}
