package assessmentDay;

//We call a integer a "duodigit" if its decimal representation uses no more than two different oigts. For exam 130, -33333 are duodigits, but tea is not
//
//        Implement the method indigit(number) which returns a string
//
//        number is a duodigit
//
//        otherwise

public class IsDuoDigits {
    public static String isDuodigit(int number) {
int firstDigit = number % 10;
        int secondDigit = number / 10 % 10;
        if (firstDigit == secondDigit) {
            return "YES";
        }
        while (number > 0) {
            int digit = number % 10;
            if (digit != firstDigit && digit != secondDigit) {
                return "NO";
            }
            number /= 10;
        }
        return "YES";

    }

    public static void main(String[] args) {
        System.out.println(isDuodigit(-2021));
    }
}
