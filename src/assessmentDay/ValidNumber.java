package assessmentDay;

//Validate if a given string is numeric.
//        Some examples:
//        "0"  true
//        "0.1"  true
//        "abc"  false
//        Example Questions Candidate Might Ask:
//        Q: How to account for whitespaces in the string?
//        A: When deciding if a string is numeric, ignore both leading and trailing whitespaces.
//        Q: Should I ignore spaces in between numbers – such as “1 1”?
//        A: No, only ignore leading and trailing whitespaces. “1 1” is not numeric.
//        Q: If the string contains additional characters after a number, is it considered valid?
//        A: No. If the string contains any non-numeric characters (excluding whitespaces and decimal
//        point), it is not numeric.
//        Q: Is it valid if a plus or minus sign appear before the number?
//        A: Yes. “+1” and “-1” are both numeric.
//        Q: Should I consider only numbers in decimal? How about numbers in other bases such as
//        hexadecimal (0xFF)?
//        A: Only consider decimal numbers. “0xFF” is not numeric.
//        Q: Should I consider exponent such as “1e10” as numeric?
//        A: No. But feel free to work on the challenge that takes exponent into consideration. (The Online
//        Judge problem does take exponent into account.)

public class ValidNumber {
    public boolean isNumber(String s) {
        int i = 0, n = s.length();
        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
        boolean isNumeric = false;
        while (i < n && Character.isDigit(s.charAt(i))) {
            i++;
            isNumeric = true;
        }
        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNumeric = true;
            }
        }
        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
        return isNumeric && i == n;
    }

    public static void main(String[] args) {
        ValidNumber validNumber = new ValidNumber();
        System.out.println(validNumber.isNumber("0"));
        System.out.println(validNumber.isNumber(" 0.1 "));
        System.out.println(validNumber.isNumber("abc"));
        System.out.println(validNumber.isNumber("1 a"));
        System.out.println(validNumber.isNumber("2e10"));
        System.out.println(validNumber.isNumber(" -90e3   "));
        System.out.println(validNumber.isNumber(" 1e"));
        System.out.println(validNumber.isNumber("e3"));
        System.out.println(validNumber.isNumber(" 6e-1"));
        System.out.println(validNumber.isNumber(" 99e2.5 "));
        System.out.println(validNumber.isNumber("53.5e93"));
        System.out.println(validNumber.isNumber(" --6 "));
        System.out.println(validNumber.isNumber("-+3"));
        System.out.println(validNumber.isNumber("95a54e53"));
    }
}
