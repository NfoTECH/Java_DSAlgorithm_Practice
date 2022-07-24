package udacityAdvanced;

import java.util.ArrayList;
import java.util.List;

public class ImperativeVsFunctional {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student nfo = new Student(92);
        Student imeh = new Student(38);
        Student dozie = new Student(88);
        Student benneth = new Student(70);
        Student imoh = new Student(98);

        students.add(nfo);
        students.add(imeh);
        students.add(dozie);
        students.add(benneth);
        students.add(imeh);

        Student student = new Student(students);
        student.imperativeTopScore(students);
        //System.out.println(max);
    }
}
