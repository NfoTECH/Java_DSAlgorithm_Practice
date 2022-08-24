package strings;

public class StringBuilderExamples {
    public static void main(String[] args) {
        String append = String.valueOf("Study" + " tonight");
        System.out.println(append);

        String reverse = new StringBuilder("Fortune the Senior Dev").reverse().toString();
        System.out.println(reverse);

        System.out.println("Fortunate" + " Nwachukwu");
    }
}
