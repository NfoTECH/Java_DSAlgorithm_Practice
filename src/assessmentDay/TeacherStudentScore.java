package assessmentDay;

import java.util.ArrayList;
import java.util.List;

public class TeacherStudentScore {
    public static String newList (String[] students) {
        //         write your code here
        List<String> list = new ArrayList<>();
        for (String student : students) {
            String[] arr = student.split(" ");
            int sum = 0;
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                try {
                    int mark = Integer.parseInt(arr[i]);
                    if (mark >= 1 && mark <= 10) {
                        sum += mark;
                        count++;
                    }
                } catch (NumberFormatException e) {
                    // Ignore non-numeric values
                }
            }
            list.add(arr[0] + " " + arr[1] + "-" + sum / count);
        }
        return String.join("; ", list);
    }


    public static void main(String[] args) {
        String[] input1 = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] Input2 = {"Denver Wagner 6 7 8", "Ernie Gibbs 11 2"};
        String[] Input3 = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};

        System.out.println(newList(input1));
        System.out.println(newList(Input2));
        System.out.println(newList(Input3));
    }
}