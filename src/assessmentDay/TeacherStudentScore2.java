package assessmentDay;

//Imagine you're a teacher. At the end of the school year, you need to calculate the average marks of your students.
//
//        There marks of the students are arranged in an array. Each student item is given as a string and has the following format: <student><mark 1><mark 2><mark N>
//
//        Return a string in the following format (without white-spaces): <student A>-<average mark>; <student B>-<average mark>;
//
//        Take the following into account:
//
//        Any kind of separator can be used in the string.
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

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TeacherStudentScore2 {
    public static String calculateAverageMarks(String[] students) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            String name = "";
            int sum = 0;
            int count = 0;

            Pattern pattern = java.util.regex.Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(students[i]);
            while (matcher.find()) {
                int num = Integer.parseInt(matcher.group());
                if (num >= 0 && num <= 10) {
                    sum += num;
                    count++;
                }
            }

            Pattern pattern2 = java.util.regex.Pattern.compile("[a-zA-Z]+");
            Matcher matcher2 = pattern2.matcher(students[i]);
            while (matcher2.find()) {
                name += matcher2.group() + " ";
            }
            String result = count == 0 ? "0" : String.valueOf((int) Math.floor(sum / count));
            list.add(name.trim() + "-" + result);
        }
        return String.join(";", list) + ";";
    }
    public static void main(String[] args) {
        String[] input1 = {"Madeline Choi 5 5 6", "Ethan Wyatt 8 9 10"};
        String[] Input2 = {"Denver Wagner 6 7 8", "Ernie Gibbs 11 2"};
        String[] Input3 = {"Kim Ramos: 4 5 6", "Giovanni Landry - 10 10"};
        String[] Input4 = {"Henrietta Moon:5;5;8","Edwin Bonilla 100;"}; // Expected output4: Henrietta Moon-6; Edwin Bonilla-0;
        System.out.println(calculateAverageMarks(input1));
        System.out.println(calculateAverageMarks(Input2));
        System.out.println(calculateAverageMarks(Input3));
        System.out.println(calculateAverageMarks(Input4));
    }
}
//    This Java solution takes an array of student records as input and returns a string
//    that contains each student's name and their average marks.
//    The input array contains strings that represent each student record in the following format:
//    "<student name> <mark1> <mark2> ... <markN>", where each mark is a number between 0 and 10.
//
//    The solution first creates an empty list to store the results.
//    Then, it iterates over each element of the input array using a for loop.
//    For each element, it extracts the student's name and marks using regular expressions.
//    The marks are stored in a sum variable and a count variable is used to keep track of the number of marks.
//    If a mark is between 0 and 10, it is added to the sum, and the count is incremented.
//
//    After extracting the student's name and marks,
//    the solution calculates the average marks by dividing the sum by the count.
//    If the count is 0, the average marks are set to 0.
//    The solution then adds the student's name and average marks to the result list.
//
//    Finally, the solution uses the String.join() method to join the elements of the result list into a single string,
//    separated by semicolons, and returns the resulting string.

//The regular expression "\d+" in Java matches one or more consecutive digits in a string.
//The regular expression "[a-zA-Z]+" in Java matches one or more consecutive alphabetical characters (both lowercase and uppercase) in a string.
//"+" is a quantifier that matches one or more occurrences of the preceding element