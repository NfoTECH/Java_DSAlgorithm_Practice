package assessmentDay;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProcessLogs2 {
    public static void process(String[] arr, int n){
        Map<String, Integer[]> mapped = new LinkedHashMap<>();
        List<String> values = new LinkedList<>();
        for(int i =0; i < arr.length; i++){
            String[] split = arr[i].split( " ");
            if( split[2].equals("sign-in")){
                if(!mapped.containsKey(split[0])){
                    Integer[] temp = new Integer[2];
                    temp[0] = Integer.valueOf(split[1]);
                    mapped.put(split[0], temp);
                }
            }
            else{
                if(mapped.containsKey(split[0])){
                    mapped.get(split[0])[1] = Integer.valueOf(split[1]);
                }
            }
        }
        for (Map.Entry<String, Integer[]> entry: mapped.entrySet()){
            if(entry.getValue()[0] != null && entry.getValue()[1] != null){
                int diff = entry.getValue()[1] - entry.getValue()[0];
                if(diff <= n){
                    values.add(entry.getKey());
                }
            }
        }
        System.out.println(values);
    }

    public static void main(String[] args) {
        String[] arr = {"30 99 sign-in", "30 105 sign-out", "12 100 sign-in", "20 80 sign in", "12 120 sign-out", "20 101 sign-out", "21 110 sign-in"};
        process(arr, 20);
    }
}
