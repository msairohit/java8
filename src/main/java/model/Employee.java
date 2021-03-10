package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee/* implements Comparable*/ {
    private String id;
    private String name;
    private Integer age;
    private Double salary;

   /* @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Employee)o).getName());
    }*/

    public static List<Employee> getStaticEmployees() {
        Employee e1 = new Employee("1", "a", 5, 2000.0);
        Employee e2 = new Employee("2", "b", 20, 2001.0);
        Employee e3 = new Employee("3", "c", 75, 20.0);
        Employee e4 = new Employee("4", "d", 82, 205.0);
        Employee e5 = new Employee("5", "e", 15, 2007.0);
        return Arrays.asList(e5, e2, e4, e3, e1);
    }
}
