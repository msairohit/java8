package model;

import enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private Double price;
    private Category category;

    public static List<Product> getStaticProducts() {
        Product product1 = new Product("a", 1000.0, Category.Electrical);
        Product product2 = new Product("b", 1230.0, Category.Electronics);
        Product product3 = new Product("c", 1220.0, Category.Software);
        Product product4 = new Product("d", 100.0, Category.Electrical);
        Product product5 = new Product("e", 120.0, Category.Electronics);
        return Arrays.asList(product1, product2, product3, product4, product5);
    }
}
