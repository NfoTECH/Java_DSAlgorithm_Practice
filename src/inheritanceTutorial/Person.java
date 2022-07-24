package inheritanceTutorial;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private int age;
    private String email;
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern myPattern = Pattern.compile(emailRegex);

    public Person (String name, int age, String email) {
        if(!myPattern.matcher(email).matches()) {
            throw new IllegalArgumentException("INVALID EMAIL!");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        if(name.length() > 20)
            return  "Name is too long";
        else
            return name;
    }
    public void setName(String name) {
        if (name != null && name.length() > 2)
            this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        System.out.println(email);
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Name: " + name + " " + "Age: " + age + "Email: " + email;
    }
}

