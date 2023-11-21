package CalculosPerHours.entities.main;

import CalculosPerHours.entities.Departament;
import CalculosPerHours.entities.HoursContact;
import CalculosPerHours.entities.Worker;
import CalculosPerHours.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Departamento name : ");
        String departamentName = sc.nextLine();

        System.out.print("Enter com Work data");

        System.out.print("Name: ");
        String workName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();


        Worker worker = new Worker(workName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
        System.out.print("How many contracts to this worker?");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre Contact # " + i + " data :");
            System.out.print("Date(DD/MM/YYYY):");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duraction - Hour: ");
            int hours = sc.nextInt();
            HoursContact contact = new HoursContact(contractDate, valuePerHour, hours);
            worker.addContracts(contact);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name : " + workName);
        System.out.println("Departament : " + worker.getDepartament().getName());
        System.out.println("Income for  : " + monthAndYear + " : " + String.format("%.2f", worker.income(year,month)));



        sc.close();
    }
}
