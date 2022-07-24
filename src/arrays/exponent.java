package arrays;

public class exponent {
    public static void main(String[] args) {
//        int x = 15 ^ 3;     // OUTPUT = 12; where ^ = bitwise XOR
//        int y = 10 ^ 4;     // OUTPUT = 14; where ^ = bitwise XOR
//        int z = 8 ^ 5;     // OUTPUT = 13; where ^ = bitwise XOR
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

        //For positive number, >> and >>> works same
        System.out.println(20>>2);      // OUTPUT = 5
        System.out.println(20>>>2);     // OUTPUT = 5
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);     //  OUTPUT = -5
        System.out.println(-20>>>2);    // OUTPUT = 1073741819
    }
}
