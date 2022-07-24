package generics;

import java.util.ArrayList;

public class GenExercise {
    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<>();
        Double doubleNumber = 1.5;
        String name = "Sally";
        Integer intNumber = 1;
        Character letter = 'a';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable : variables) {
            GenExercise.displayClassName(variable);
        }
    }

    static <T> void displayClassName(T variable) {
        System.out.println(variable.getClass().getName());
    }

}
