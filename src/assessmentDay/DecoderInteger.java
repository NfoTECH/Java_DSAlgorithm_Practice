package assessmentDay;

public class DecoderInteger {
    int decodeInteger(int x, int n) {
        n = n << (1 << (1 << (1 << 1)));
        x = x & ~n;
        return x;
    }

    void decodeArray(int[] encodedArray, int[] originalArray, int n) {
        for (int i = 0; i < n; i++) {
            originalArray[i] = decodeInteger(encodedArray[i], n);
        }
    }

    public static void main(String[] args) {
        int[] encodedArray = {6, 5, 4, 3, 2, 1};
        int[] originalArray = new int[6];

        new DecoderInteger().decodeArray(encodedArray, originalArray, 6);

        for (int i : originalArray) {
            System.out.println(i);
        }
    }

}
