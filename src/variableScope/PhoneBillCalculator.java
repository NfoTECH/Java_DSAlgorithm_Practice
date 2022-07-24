package variableScope;

import java.util.Scanner;

/*
* Calculate the final total of someone's cell phone bill.
* Allow the operator to input the plan fee and the number of overage minutes
* Charge the user 0.25 for every minute they were over their plan,
* and 15% tax on the subtotal.
* Create separate methods to calculate the tax, overage fees, and final total.
* Print the itemized bill.
*/
public class PhoneBillCalculator {
    static  Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {

        double planFee = getPlanFee();
        int overageMinute = getOverageMinutes();
        scanner.close();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        calculateOverageFee(overageMinute);
        double tax = calculateTax(planFee,overageMinute);
        calculateTotal(planFee,overageMinute,tax);
    }


    public static double getPlanFee() {
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static int getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double calculateOverageFee(int overageMinutes) {
        double overageFee = overageMinutes * 0.25;
        System.out.println("Overage: $" + overageFee);
        return overageFee;
    }
    public static double calculateTax(double planFee, int overageFee) {
        double subTotal = planFee + overageFee;
        double tax = subTotal * 0.15;
        System.out.println("Tax: $" + tax);
        return tax;
    }
    public static double calculateTotal(double planFee, int overageMinutes, double tax) {
        double total = planFee + overageMinutes +tax;
        System.out.println("Total: $" + total);
        return total;
    }
}
