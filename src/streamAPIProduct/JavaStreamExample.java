package streamAPIProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        // Printing List of prices of all products less than 30000
        List<Float> productPriceList = productsList.stream()
                .filter(product -> product.price < 30000)
                .map(product -> product.price).toList();
        System.out.println(productPriceList);

        // Printing names of product with the 30000 price
        productsList.stream()
                .filter(product -> product.price < 30000)
                .forEach(product -> System.out.println(product.name));

        // Sum of all the product prices
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum); //.reduce(0.0f, (sum, price) -> sum + price);
        System.out.println(totalPrice);

        // Sum all the product prices
        Double totalPrice2 = productsList.stream()
                .mapToDouble(product -> product.price).sum();
        System.out.println(totalPrice2);

        // Get the maximum Product price
        Product productMax = productsList.stream()
                .max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productMax.price);

        // Get the minimum Product price
        Product productMin = productsList.stream()
                .max((product1, product2) -> product1.price < product2.price ? 1 : -1).get();
        System.out.println(productMin.price);

        // Count number of products below 30000
        long count = productsList.stream()
                .filter(product -> product.price < 30000)
                .count();
        System.out.println(count);

        // Converting product List into Set
        Set<Float> productPriceList1 = productsList.stream()
                .filter(product -> product.price < 30000)
                .map(product -> product.price)
                .collect(Collectors.toSet());
        System.out.println(productPriceList1);

        // Converting Product List into a Map
        Map<Integer, String> productPriceMap = productsList.stream()
                .collect(Collectors.toMap(product -> product.id, product -> product.name));
        System.out.println(productPriceMap);
    }
}
