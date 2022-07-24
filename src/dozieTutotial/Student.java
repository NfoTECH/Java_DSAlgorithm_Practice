package dozieTutotial;

public class Student extends Person {
    private GRADE studentGrade;


    public Student(String name, int age, GRADE studentGrade) {
        super(name, age);
        this.studentGrade = studentGrade;
    }

    public Student() {

    }

    public GRADE getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(GRADE studentGrade) {
        this.studentGrade = studentGrade;
    }

}
