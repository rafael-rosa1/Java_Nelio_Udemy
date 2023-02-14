package listas.exercicio1.application;

import listas.exercicio1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (1 + i) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(employees, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int selectedId = sc.nextInt();
        Integer position = position(employees, selectedId);

        if (position != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employees.get(position).salaryIncrease(percentage);
        } else {
            System.out.println("This id does not exist!");
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employeeExists = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return employeeExists != null;
    }
}
