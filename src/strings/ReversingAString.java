package strings;

public class ReversingAString {
    public static void main(String[] args) {

        // USING STRING BUILDER
        //String code = "reverse this string!";
        //System.out.println(code);

        String result = new StringBuilder("Bucky").reverse().toString();
        System.out.println(result);


        // USING STRING BUFFER
        String string = "My name is Fortunate";
        System.out.println(string);

        String reversed = new StringBuffer(string).reverse().toString();
        System.out.println(reversed);


        // USING FOR LOOP IN CHAR ARRAY
        String input = "And I am a Java Developer"; //public static String reverse(String input) {
        System.out.println(input);

        char[] arr = input.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {      // Where i = index; and j = mirroredIndex
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(new String(arr));

        //OR
        String inputString = "Another reversal using for loop";
        System.out.println(inputString);
        char[] inArray = inputString.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = inArray.length - 1; i >= 0; i --) {
            output.append(inArray[i]);
        }
        System.out.println(output);


        // USING WHILE LOOP IN CHAR ARRAY[]
        String in = "I am a student of Decagon";
        System.out.println(in);

        char[] array = in.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(array));
    }
}
