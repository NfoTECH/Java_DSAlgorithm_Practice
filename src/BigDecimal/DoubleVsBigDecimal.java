package BigDecimal;

import java.math.BigDecimal;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class DoubleVsBigDecimal {
    public static void main(String[] args) {
        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);

        // Using the BigDecimal class to print the exact decimal values
        BigDecimal bd1 = new BigDecimal("0.03");
        BigDecimal bd2 = new BigDecimal("0.04");
        BigDecimal bd3 = bd2.subtract(bd1);
        System.out.println(bd3);

        BigDecimal bd4 = BigDecimal.valueOf(0.04);
        BigDecimal bd5 = BigDecimal.valueOf(0.03);
        System.out.println(bd4.subtract(bd5));

        // To get the MAX or MIN_VALUE of any numeric data type by importing the API
        int high = MAX_VALUE;
        double low = MIN_VALUE;
        System.out.println(high);
        System.out.println(low);
    }
}
