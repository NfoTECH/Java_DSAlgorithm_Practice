package dozieTutotial;

import dozieTutotial.Shapes.Rectangle;

public class PersonTester {
    public static void main(String[] args) {

        // Constructor with no argument
        Person noArg = new Person();
        String name = noArg.setName("NfoTECH");
        System.out.println(name);
        int myAge = noArg.setAge(40);
        System.out.println(myAge);


        // Constructor with 2 arguments
        Person oneGuy = new Person("Senior Man", 50);
        String ben = oneGuy.getName();
        int age = oneGuy.getAge();
        System.out.println("My name is " + ben + " and I am " + age + " years old.");


        // Constructor with 3 arguments
        Person newGuy = new Person("Fortune", 50, 6.7f);
        float height = newGuy.getHeight();
        System.out.println(height);
        float height2 = newGuy.setHeight(7.3f);
        System.out.println(height2);

        // Getting Student grade after inheriting from Person class
        Student nfo = new Student("Benneth", 50, GRADE.B);
        GRADE grade = nfo.getStudentGrade();
        System.out.println(grade);

        Headboy decagonHeadboy = new Headboy();
        decagonHeadboy.playFootball();

        Student student = new Student();
        student.playFootball();


        Doctor doctor = new Doctor();
        Doctor.treatPatient(); //Calling directly from the class and not the instance because the class is a static class

    }
}
