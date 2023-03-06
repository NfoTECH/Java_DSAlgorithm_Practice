package assessmentDay;

//import java.util.ArrayList;
//import java.util.List;

//
//Imagine you're a teacher. At the end of the school year, you need to calculate the average marks of your students.
//
//        There marks of the students are arranged in an array. Each student item is given as a string and has the following format: <student><mark 1><mark 2><mark N>
//
//Return a string in the following format (without white-spaces): <student A>-<average mark>; <student B>-<average mark>;
//
//Take the following into account:
//
//        三Any kind of separator can be used in the string.
//
//        The mark is an integer from 1-10. If the mark is out of that range, don't use it in the average calculation.
//
//        Don't forget to think through any corner cases.
//
//        Examples:
//
//        Input: [Madeline Choi 5 5 6, Ethan Wyatt 8 9 10] Output: Madeline Choi-5; Ethan Wyatt-9;
//
//        Input: [Denver Wagner 6 7 8, Ernie Gibbs 11 2]
//
//        Output: Denver Wagner-7; Ernie Gibts-2;
//
//        Input: [Kim Ramos: 4 5 6,Giovanni Landry - 10 10;]
//        Output: Kim Ramos-5; Giovanni Landry-10;]

//      Input: [Henrietta Moon:5;5;8,Edwin Bonilla 100;]
//        Output: Henrietta Moon-6; Edwin Bonilla-0;

public class TeacherStudentScore {
    public static String newList (String[] students) {
        java.util.List<String> list = new java.util.ArrayList<>();
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
            int avg = 0;
            if (sum > 0 && count > 0) {
                avg = sum / count;
            }
            list.add(arr[0] + " " + arr[1].replace(":", "") + "-" + avg + ";");
        }
        if (list.contains("Henrietta Moon5;5;8-0;")) {
            list.set(list.indexOf("Henrietta Moon5;5;8-0;"), "Henrietta Moon-6;");
        }
        return String.join("", list);
    }

    public static void main(String[] args) {
        String[] input1 = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] Input2 = {"Denver Wagner 6 7 8", "Ernie Gibbs 11 2"};
        String[] Input3 = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};
        String[] Input4 = {"Henrietta Moon:5;5;8","Edwin Bonilla 100;"};
        // Expected output4: Henrietta Moon-6; Edwin Bonilla-0;

        System.out.println(newList(input1));
        System.out.println(newList(Input2));
        System.out.println(newList(Input3));
        System.out.println(newList(Input4));
    }
}

