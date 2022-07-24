package inheritanceTutorial;

public class Student extends Person{
    private String school;
    private String uniform;

    public Student (String name, int age, String email, String school, String uniform) {
        super(name, age, email);
        this.school = school;
        this.uniform = uniform;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }
    public void showStudent() {

        String result = super.toString() + " School: " + school + " Uniform: " + uniform;
        System.out.println(result);
    }

  //  @Override
//    public String toString() {
//        return super.toString() + " School: " + school + " Uniform" + uniform;
//    }
}
