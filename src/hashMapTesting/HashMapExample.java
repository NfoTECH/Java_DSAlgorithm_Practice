package hashMapTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<>();

        people.put("John", 32);
        people.put("Steve", 30);
        //people.put("Angie", Collections.singletonList(33));
        System.out.println(people.keySet());
        System.out.println(people.values());

        for (String i : people.keySet()) {
            System.out.println("KEY: " + i + " value: " + people.get(i));
        }
        //Iterating and printing the values alone
        for(var i : people.entrySet()) {
            System.out.println(i.getValue());
        }
        //Printing using forEach method
        people.forEach((k, v) ->System.out.println("Person: " + k + ", Age: " + v));
    }
}
