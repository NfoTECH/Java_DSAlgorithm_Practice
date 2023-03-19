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
//        Input: [Madeline Choi 5 5 6, Ethan Wyatt 8 9 10]
//        Output: Madeline Choi-5; Ethan Wyatt-9;

//        Input: [Denver Wagner 6 7 8, Ernie Gibbs 11 2]
//        Output: Denver Wagner-7; Ernie Gibts-2;

//        Input: [Kim Ramos: 4 5 6,Giovanni Landry - 10 10;]
//        Output: Kim Ramos-5; Giovanni Landry-10;]

//        Input: [Henrietta Moon:5;5;8,Edwin Bonilla 100;]
//        Output: Henrietta Moon-6; Edwin Bonilla-0;

public class TeacherStudentScore_2 {
    public static String calculateAverageMarks(String[] students) {
        java.util.List<String> studentList = new java.util.ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            String studentName = "";
            int count = 0;
            int sumScore = 0;

            java.util.regex.Matcher match = java.util.regex.Pattern.compile("\\d+").matcher(students[i]);
            while (match.find()) {
                int score = Integer.parseInt(match.group());
                if (score <= 10 && score >= 1) {
                    count += 1;
                    sumScore += score;
                }
            }

            java.util.regex.Matcher match2 = java.util.regex.Pattern.compile("[a-zA-Z]+").matcher(students[i]);
            while (match2.find()) {
                studentName += match2.group() + " ";
            }
            java.lang.String avgScore = count == 0 ? "0" : java.lang.String.valueOf((int) java.lang.Math.floor(sumScore / count));
            studentList.add(studentName.trim() + "-" + avgScore);
        }
        return String.join(";", studentList) + ";";
    }

    public static void main(String[] args) {
        String[] input1 = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] Input2 = {"Denver Wagner 6 7 8", "Ernie Gibbs 11 2"};
        String[] Input3 = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};
        String[] Input4 = {"Henrietta Moon:5;5;8","Edwin Bonilla 100;"};

        System.out.println(calculateAverageMarks(input1));
        System.out.println(calculateAverageMarks(Input2));
        System.out.println(calculateAverageMarks(Input3));
        System.out.println(calculateAverageMarks(Input4));
    }
}

