package arrays;

public class DuplicateCharacters {
    public static String duplicateCharacter(String string) {
        String output = "";
        String[] arr = string.split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    output += arr[i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCharacter("Hello World"));
    }

}
