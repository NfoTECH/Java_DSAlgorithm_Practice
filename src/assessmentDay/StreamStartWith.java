package assessmentDay;

//For a given list
//        List<String> list = List.of("John", "James", "Mark","Joanna","Henry");
//        using java streams
//        return a list that contains only names beginning with "J"

import java.util.List;
import java.util.stream.Collectors;

public class StreamStartWith {
    public static List<String> jNames (List<String> list) {
       return list.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = List.of("John", "James", "Mark","Joanna","Henry");
        System.out.println(jNames(list));
    }
}
