package Reservas;

import Reservas.Entities.ReservationSolucaoMuitoRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramSolucaoMuitoRuim {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number : ");
        int number = sc.nextInt();
        System.out.print("Check in Date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check Out Date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("A data Check In nao poder ser maior que a data de Check Out ");
        } else {
            ReservationSolucaoMuitoRuim reservationSolucaoMuitoRuim = new ReservationSolucaoMuitoRuim(number, checkIn, checkOut);
            System.out.print("Reserva: " + reservationSolucaoMuitoRuim);


            System.out.println("Enter com Novas Datas para Reserva");
            System.out.print("Check in Date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check Out Date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Datas Reservadas deveram ser datas Futuras");
            }

            if (!checkOut.after(checkIn)) {
                System.out.println("A data Check In nao poder ser maior que a data de Check Out ");
            } else {
                reservationSolucaoMuitoRuim.updateDates(checkIn, checkOut);
                System.out.print("Reserva: " + reservationSolucaoMuitoRuim);
            }

        }


    }
}
