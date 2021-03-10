package day1;

import model.Employee;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import util.*;

import static util.CommonUtil.print;
import static util.CommonUtil.printStars;

public class Task {


    BiConsumer printWithTwoValues = (param1, param2) -> System.out.println(param1 + " : " + param2);

    public static void main(String[] args) {
        Task task = new Task();
//        task.checkPalindrome("nitin");
//        task.secondBiggestNumber(integerStream);
//        task.rotationsOfEachOther("abc", "cba");
//        task.printNumbersUsingRunnable();
//        task.sortByEmployeeName();
//        task.treeSetByReversingNumbers(integerList);
//        task.treeSetByEmployeeNames(Employee.getStaticEmployees());
        task.employeeNamesDescOrder(Employee.getStaticEmployees());

    }

    public void checkPalindrome(String string) {
        StringBuilder reverseString = new StringBuilder(string).reverse();
        BiPredicate<String, String> palindrome = (original, reverse) -> original.equals(reverse);
        System.out.println(palindrome.test(string, reverseString.toString()));
    }

    @SuppressWarnings("unchecked")
    public void secondBiggestNumber(List<Integer> integerList) {
        integerList.forEach(System.out::println);
        printStars.accept("s");
        System.out.println();
        Optional<Integer> second = integerList
                .stream()
                .sorted(Comparator.reverseOrder())
                .peek(print)
                .skip(1)
                .findFirst();
        System.out.println("result : " + second.orElse(0));
    }

    @SuppressWarnings("unchecked")
    public void secondBiggestNumber(IntStream integerList) {
//        integerList.forEach(System.out::println);
        Optional<Integer> second = integerList
                .boxed()
                .peek(print)
                .sorted(Comparator.reverseOrder())
                .peek(printStars)
                .peek(print)
                .skip(1)
                .findFirst();
        System.out.println("result : " + second.orElse(0));
    }

    public void rotationsOfEachOther(String string1, String string2) {
        String concat = string1.concat(string1);
        BiPredicate<String, String> contains = (originalString, concatinatedString) -> concatinatedString.contains(originalString);
        print.accept(contains.test(string2, concat));
    }

    public void printNumbersUsingRunnable() {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                print.accept(i);
            }
        };
        runnable.run();
    }

    public void sortByEmployeeName() {
        List<Employee> employees = Employee.getStaticEmployees();
        for (Employee e : employees) {
            System.out.println(e);
        }
        printStars.accept("a");
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
//                .sorted((o1, o2) -> o1.getName().compareTo((o2).getName()))
                .forEach(print);
    }

    public void treeSetByReversingNumbers(List<Integer> integers) {
        integers.add(integers.get(0));
        integers.forEach(print);
        printStars.accept("S");
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(integers);
        treeSet.forEach(print);
    }

    public void treeSetByEmployeeNames(List<Employee> employees) {
        employees.forEach(print);
        printStars.accept("S");
        TreeSet<Employee> treeSet = new TreeSet<>(Comparator.comparing(Employee::getName));
        treeSet.addAll(employees);
        treeSet.forEach(print);
    }

    public void employeeNamesDescOrder(List<Employee> employees) {
        employees.forEach(print);
        printStars.accept("S");
        Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
        employees.forEach(print);
    }
}
