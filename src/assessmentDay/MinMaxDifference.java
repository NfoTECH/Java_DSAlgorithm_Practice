package assessmentDay;
//
//Extract the numbers in the following String and write an algorithm to find the difference
//        between the maximum and minimum number in the string sample
//
//        Text A = "START
//        8,4,30,14,16,22,100,49,700,499";

public class MinMaxDifference {
    public static int difference (String a) {
        int diff = 0;
        a = a.replace("START", "");
        String[] arr = a.split(",");
        int lowest = Integer.parseInt(arr[0]);
        int highest = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) < lowest) {
                lowest = Integer.parseInt(arr[i]);
            }
            if (Integer.parseInt(arr[i]) > highest) {
                highest = Integer.parseInt(arr[i]);
            }
        }
        diff = highest - lowest;
        return diff;
    }

    public static void main(String[] args) {
        String a = "START8,4,30,14,16,22,100,49,700,499";
        System.out.println(difference(a));
    }
}
