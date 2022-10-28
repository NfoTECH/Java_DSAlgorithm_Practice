package assessmentDay;
//
//in this problem, you'll be given a list of daily stock prices, and you'll be asked to return the three stocks with the highest average price.
//
//        Implementation
//
//        Implement the method getTopacks(stocks, prices) which takes as input
//
//        an array of strings (atoeks), representing the considered stocks
//
//        an array of 2 dimensions (pre), representing the stock prices (inner lists) for each day (outer list
//
//        An example input would look like this:
//
//        [AMZN
//
//        CACC
//
//        "EQIX",
//
//        "GOOG,
//
//        ORLY,
//
//        ULTA
//
//        (10.34,
//
//        18:56,
//
//        0.14,
//
//        12.17,
//
//        13.1,
//
//        11.223.
//
//        [11:53,
//
//        10.67
//
//        [12.81,
//
//        11.69,
//
//        12.11,
//
//        10.93,
//
//        9.83,
//
//        8.14)
//
//        Your gestop method should return an array containing the names of the three stocks with the highest average value. The array should be sorted by decreasing average value. You're guaranteed that each stock will have a unique average value
//
//        For the above example, the correct output would be
//
//        [GOOG
//
//        ORLY
//
//        AMEN!]

public class GetTopStocks {

    public static String[] getTopStocks(String[] stocks, double[][] prices) {
        double[] averagePrice = new double[stocks.length];
        for (int i = 0; i < stocks.length; i++) {
            double sum = 0;
            for (int j = 0; j < prices.length; j++) {
                sum += prices[j][i];
            }
            averagePrice[i] = sum / prices.length;
        }
        String[] topStocks = new String[3];
        for (int i = 0; i < 3; i++) {
            int maxIndex = 0;
            for (int j = 0; j < stocks.length; j++) {
                if (averagePrice[j] > averagePrice[maxIndex]) {
                    maxIndex = j;
                }
            }
            topStocks[i] = stocks[maxIndex];
            averagePrice[maxIndex] = -1;
        }
        return topStocks;
    }


    public static void main(String[] args) {
        String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
        double[][] prices = {{12.81, 11.09, 12.11, 10.93, 9.83, 8.14, }, {10.34, 10.56, 10.14, 12.17, 13.1, 11.22}, {11.53, 10.67, 10.42, 11.88, 11.77, 10.21}};
        String[] result = getTopStocks(stocks, prices);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


}
