package polimorfismo.exercicio1.application;

import polimorfismo.exercicio1.entities.Employee;
import polimorfismo.exercicio1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();
            if(outsourced == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                sc.nextLine();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }

        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee e : employees) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getName()).append(" - $ ").append(String.format("%.2f", e.payment()));
            System.out.println(sb);
        }
        sc.close();
    }
}
