package hashSet;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void setDemo() {
        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());   //4
        System.out.println(fruit);          //[banana, orange, apple, lemon]

        // One way of iterating through the Set
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Iterating using the enhanced for loop
        for (String j: fruit) {
            System.out.println(j);
        }

        // Iterating using a forEach method
        fruit.forEach(x -> System.out.println(x));
        // OR
        fruit.forEach(System.out::println);

    }

    public static void main(String[] args) {
        setDemo();
    }
}
