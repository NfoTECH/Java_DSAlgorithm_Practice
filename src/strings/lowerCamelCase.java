package strings;

public class lowerCamelCase {
    public static String convertString (String s) {
        StringBuilder result = new StringBuilder();
        char[] c =  s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if (i == 0) c[i] = Character.toLowerCase(c[i]);
            if(c[i] == ' ' || c[i] == '-' || c[i] == '_') {
                result.append(Character.toUpperCase(c[i + 1]));
                i++;
            } else {
                result.append(c[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args)
    {
        // passing the name of a method
        String s = "Max Marks()" ;
        System.out.println( convertString( s ) ) ;
        // passing the name of a variable
        String str1 = "Last_name" ;
        System.out.println( convertString( str1 ) ) ;
        // passing the String
        String str2 = "Java is the best programming language there is." ;
        System.out.println( convertString( str2 ) ) ;
    }
}
