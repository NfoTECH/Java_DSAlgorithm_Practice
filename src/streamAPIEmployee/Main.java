package streamAPIEmployee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(
                new Employee("Fortunate", "Nwachukwu", 5000.45, List.of("Project1", "Project2"))
        );
        employees.add(
                new Employee("Pelumi", "Ogunwole", 7263.0, List.of("Project1", "Project3"))
        );
        employees.add(
                new Employee("Samson", "Oghenemiyeruwe", 4947.0, List.of("Project2", "Project3"))
        );
        employees.add(
                new Employee("Ikechukwu", "Iwunna", 10500.80, List.of("Project3", "Project4"))
        );
        employees.add(
                new Employee("Okeoghene", "Peter", 6400.45, List.of("Project1", "Project4"))
        );
    }

    public static void main(String[] args) {

        //forEach: Print all the employees on the console
        employees.forEach(System.out::println);


        //map: Increment the salary of all employees by 10%
        Set <Employee> increasedSalary = employees.stream()
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .collect(Collectors.toSet());
        System.out.println(increasedSalary);


        //filter: Increase the salary of employee with current salary > 5000
        List <Employee> filteredEmployeeSalary = employees.stream()
                .filter(employee -> employee.getSalary() > 7000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .collect(Collectors.toList());
        System.out.println(filteredEmployeeSalary);


        //findFirst: Find the first employee whose salary have been increased
        Employee findFirstEmployee = employees.stream()
                .filter(employee -> employee.getSalary() > 12000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .findFirst()
                .orElse(null);
        System.out.println(findFirstEmployee);

        //flatMap:
        String employeeProjects = employees.stream()
                .map(employee -> employee.getProjects())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));
        System.out.println(employeeProjects);


        //skip and limit: Short circuit operations
        List<Employee> shortCircuit = employees.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(shortCircuit);


        //Finite data
        Stream.generate(Math::random)
                .limit(3)
                .forEach(System.out::println);


        //StartsWith
        List<Employee> firstNameStartsWith = employees.stream()
                .filter(employee -> employee.getLastName()
                        .startsWith("O"))
                .toList();
        System.out.println(firstNameStartsWith);


        //sorted
        List<Employee> sortedEmployees =
                employees.stream()
                        .sorted(((o1, o2) -> o1.getFirstName()
                                .compareToIgnoreCase(o2.getFirstName())))
                        .toList();
        System.out.println(sortedEmployees);


        //min or max
        Employee maxSalary = employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxSalary);


        //reduce
        Double totalSalary = employees
                .stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println(totalSalary);
    }
}
