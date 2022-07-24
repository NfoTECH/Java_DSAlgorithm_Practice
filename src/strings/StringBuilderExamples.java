package strings;

public class StringBuilderExamples {
    public static void main(String[] args) {
        String append = String.valueOf(new StringBuilder("Study").append(" tonight"));
        System.out.println(append);

        String reverse = new StringBuilder("Fortune the Senior Dev").reverse().toString();
        System.out.println(reverse);

        StringBuilder strB = new StringBuilder("Fortunate");
        strB.append(" Nwachukwu");
        System.out.println(strB);
    }
}
