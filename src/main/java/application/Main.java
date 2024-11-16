package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employee: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}