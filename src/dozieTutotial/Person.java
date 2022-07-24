package dozieTutotial;

public class Person implements IPlayFootall{
    private String name;
    private int age;
    private float height;




    public Person (String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public float getHeight() {
        return height;
    }

    public float setHeight(float height) {
        this.height = height;
        return height;
    }

    public void playFootball() {
        System.out.println("Student dey Play ball with your heart");
    }
}
