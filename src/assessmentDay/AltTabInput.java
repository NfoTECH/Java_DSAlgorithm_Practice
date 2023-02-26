package assessmentDay;

public class AltTabInput {
    public int[] altTab(int input1, int input2, int[] input3) {
        int[] result = new int[input1];
        int index = 0;
        for (int i = 0; i < input3.length; i++) {
            if (input3[i] == input2) {
                result[index++] = input3[i];
            }
        }
        for (int i = 0; i < input3.length; i++) {
            if (input3[i] != input2) {
                result[index++] = input3[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AltTabInput altTabInput = new AltTabInput();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int[] result = altTabInput.altTab(10, 5, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

//        if(input2 >input1 || input1>input3.length ||input2 < 1){
//        thow new UnsupportedOperationexception("they provide the text here");
//        }
//        int temp = input3[input2 -1];
//        for(int i = 0; i< input2; i++){
//        int hold  = input3[i];
//        input3[i] = temp;
//        temp = hold;
//        }
//        return input3;
//        }


