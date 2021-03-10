package util;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonUtil {
    public static IntStream integerStream = new Random().ints(4, 0, 100);
    public static List<Integer> integerList = new Random().ints(4, 0, 100).boxed().collect(Collectors.toList());
    public static Consumer print = System.out::println;
    public static Consumer printStars = (s) -> System.out.println("************************************************************");
}
