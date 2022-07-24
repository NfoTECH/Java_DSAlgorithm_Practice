package hashMapTesting;

import java.util.*;

public class StoreBasedOnValues {
    public static void main(String[] args) {
//        Input :-
//                Key : 12  Value : "java"
//        Key : 9  Value : "sql"
//        Key : 15  Value : "python"
//        Key : 30  Value : "php"
//
//
//        Logic :-

                HashMap<Integer, String> map = new HashMap<>();
        map.put(12, "java");
        map.put(9, "sql");
        map.put(15, "python");
        map.put(30, "php");

        //Convert values to List
        List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());

        //Sort the List
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //Finally put that List data to map object
        HashMap<Integer, String> finalMap = new HashMap<>();

        for(Map.Entry<Integer, String> mp : list) {
            finalMap.put(mp.getKey(), mp.getValue());
        }

 //=> finalMap contains sorted data based on values.

    }
}
