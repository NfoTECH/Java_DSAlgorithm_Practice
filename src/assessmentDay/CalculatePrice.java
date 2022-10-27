package assessmentDay;

//It's almost the Summer Sales!
//
//        You work for a shop that wishes to give a discount of ass to the most expensive tem
//
//        customer during the sales period. Only one product can benefit from the cut You are tasked by the shop owner to implement the method callataviste simp the list of prices of the products purchased by a customer and the peronsap the total purchase price as an integer rounded down the total a founde
//
//        Constraints
//
//        0s discos $100
//
//        0% price of a product< 100000 •D<number of products 100


public class CalculatePrice {
    public static int calculateTotalPrice(int[] prices, int discount) {
        // Write your code here
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxIndex = i;
            }
        }
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == maxIndex) {
                total += prices[i] - prices[i] * discount / 100;
            } else {
                total += prices[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculateTotalPrice(new int[]{100, 200, 300}, 10));
    }
}
