package recursion;

// ADDING ALL NUMBERS FROM 1 to 10
//
public class AddRecursively {
    public static void main(String[] args) {
        int result = sum (10);    // Descending
        System.out.println(result);
    }
    public static int sum(int num) {      // Descending
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }
}

// RUNNING STEPS OF THE PROGRAM
// 10 + sum(9)
// 10 + ( 9 + sum(8) )
// 10 + ( 9 + ( 8 + sum(7) ) )
// ...
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
//
//public class AddRecursively {
//    public static void main(String[] args) {
//        int result = sum(1);                // Ascending
//        System.out.println(result);
//    }
//    public static int sum(int num) {        // Ascending
//        if (num < 20) {
//            return num + sum(num + 1);
//        } else {
//            return 20;
//        }
//    }
//}