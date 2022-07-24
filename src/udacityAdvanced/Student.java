package udacityAdvanced;

import java.util.List;
import java.util.Objects;

public class Student {
    private int score;
    private List<Student> students;

    public Student(int score) {
        this.score = score;
    }
    public Student(List<Student> students) {
        this.students = students;
    }

    public int getScore() {
        return score;
    }

    public int imperativeTopScore(List<Student> students) {
        int topScore = 0;
        for (Student s : students) {
            if (s == null) continue;
            topScore = Math.max (topScore, s.getScore());
        }
        System.out.println(topScore);
        return topScore;
    }
    // OR
    public int functionalTopScore(List<Student> students) {
        return students.stream()
                .filter(Objects::nonNull)
                .mapToInt(Student::getScore)
                .max()
                .orElse(0);
    }
}
