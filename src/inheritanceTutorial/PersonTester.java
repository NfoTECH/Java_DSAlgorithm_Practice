package inheritanceTutorial;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person("Fortunate", 50, "fortunenwachukwu@gmail.com");
        System.out.println(person);

        Student student = new Student("Jennifer", 35, "ewuziejennifer@gmail.com","Decagon", " Green");

        student.showStudent();

        person.getEmail();
    }
}
