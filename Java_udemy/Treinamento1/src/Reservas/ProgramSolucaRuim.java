package Reservas;

import Reservas.Entities.ReservationSolucaoRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramSolucaRuim {

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
            ReservationSolucaoRuim reservationSolucaoRuim = new ReservationSolucaoRuim(number, checkIn, checkOut);
            System.out.print("Reserva: " + reservationSolucaoRuim);


            System.out.println("Enter com Novas Datas para Reserva");
            System.out.print("Check in Date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check Out Date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservationSolucaoRuim.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Erro na Atualizacao da reserva: " + error);
            } else System.out.print("Reserva: " + reservationSolucaoRuim);


        }


    }
}
