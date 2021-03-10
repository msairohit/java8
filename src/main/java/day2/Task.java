package day2;

import enums.Category;
import model.Product;

import java.util.List;
import java.util.function.Predicate;

import static util.CommonUtil.print;
import static util.CommonUtil.printStars;

public class Task {
    static Predicate<Product> priceGreaterThanThousand = product -> product.getPrice() > 1000;

    static Predicate<Product> electronicsCategory = product -> Category.Electronics.equals(product.getCategory());

    public static void main(String[] args) {
        Task task = new Task();
//        task.productGreaterThan1000(Product.getStaticProducts());
//        task.electronicsProduct(Product.getStaticProducts());
//        task.electronicsProductWithPriceGreaterThan1000(Product.getStaticProducts());
//        task.electronicsProductOrPriceGreaterThan1000(Product.getStaticProducts());
        task.productLessThan1000(Product.getStaticProducts());
    }

    public void productGreaterThan1000(List<Product> list) {
        list.forEach(print);
        printStars.accept("s");
        list
                .stream()
                .filter(a -> priceGreaterThanThousand.test(a))
                .forEach(print);
    }

    public void electronicsProduct(List<Product> list) {
        list.forEach(print);
        printStars.accept("s");
        list
                .stream()
                .filter(a -> electronicsCategory.test(a))
                .forEach(print);
    }

    public void electronicsProductWithPriceGreaterThan1000(List<Product> list) {
        list.forEach(print);
        printStars.accept("s");
        list
                .stream()
                .filter(a -> electronicsCategory.and(priceGreaterThanThousand).test(a))
//                .filter(a -> priceGreaterThanThousand.test(a))
                .forEach(print);
    }

    public void electronicsProductOrPriceGreaterThan1000(List<Product> list) {
        list.forEach(print);
        printStars.accept("s");
        list
                .stream()
                .filter(a -> electronicsCategory.or(priceGreaterThanThousand).test(a))
                .forEach(print);
    }

    public void productLessThan1000(List<Product> list) {
        list.forEach(print);
        printStars.accept("s");
        list
                .stream()
                .filter(a -> priceGreaterThanThousand.negate().test(a))
                .forEach(print);
    }
}
