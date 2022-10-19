package assessmentDay;

import java.util.*;
import java.util.stream.Collectors;

//Application logs are used in analysis of interactions with an application and may be used to detect specific actions.

//        A log file is provided as a string array where each entry is in the form "user_id timestamp action". Each of the values is separated by a space.
//        • Both user jd and timestamp consist only of digits, are at most 9 digits long and start with a non-zero digit.
//        ⚫ timestamp represents the time in seconds since the application was last launched
//        ⚫ action will be either "sign-in" or "sign-out"
//        Given a log with entries in no particular order, return an array of strings that denote user_ids of users who signed out in maxSpan seconds or less after signing in.
//        Example
//        n=7 logs ["30 99 sign-in", "30 105 sign-out", "12 100 sign-in", "20 80 sign in", "12 120 sign-out", "20 101 sign-out", "21 110 sign-in") maxSpan-20
//
//        30
//
//        31
//
//        32 public
//
//33
//
//        pub
//
//        34
//
//        10
//
//        Sign in
//
//        Sign out
//
//        Time delta
public class ProcessLogs {
    public static List<String> processLogs(List<String> logs, int maxSpan) {
        Map<Integer, Integer[]> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< logs.size(); i++){
            String[] split =logs.get(i).split(" ");
            int index= 0;
            if(split[2].equals("sign-out")){
                index = 1;
            }
            int num = Integer.valueOf(split[0]);
            int val = Integer.valueOf(split[1]);
            if(map.containsKey(num)){
                map.get(num)[index] = val;
            }
            else{
                Integer[] temp = new Integer[2];
                temp[index] = val;
                map.put(num, temp);
            }
        }
        for(Map.Entry<Integer, Integer[]> entry: map.entrySet()){
            System.out.println(entry.getKey()+". "+entry.getValue());
            if(entry.getValue()[0] != null && entry.getValue()[1]!= null){
                int diff = entry.getValue()[1] - entry.getValue()[0];
                if(diff<=maxSpan){

                    list.add(entry.getKey());

                }
            }
        }
        list.sort(Comparator.naturalOrder());
        return list.stream().map(String::valueOf).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> logs = List.of("30 99 sign-in", "30 105 sign-out", "12 100 sign-in", "20 80 sign in", "12 120 sign-out", "20 101 sign-out", "21 110 sign-in");
        System.out.println(processLogs(logs, 20));
    }


}
