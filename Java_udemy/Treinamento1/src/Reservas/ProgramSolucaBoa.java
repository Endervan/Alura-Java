package Reservas;


import Reservas.Entities.ReservationSolucaoBoa;
import Reservas.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramSolucaBoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room Number : ");
            int number = sc.nextInt();
            System.out.print("Check in Date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check Out Date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            System.out.println("A data Check In nao poder ser maior que a data de Check Out ");

            ReservationSolucaoBoa reservationSolucaoBom = new ReservationSolucaoBoa(number, checkIn, checkOut);
            System.out.print("Reserva: " + reservationSolucaoBom);
            System.out.println();
            System.out.println("Enter com Novas Datas para Reserva");
            System.out.print("Check in Date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check Out Date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservationSolucaoBom.updateDates(checkIn, checkOut);
            System.out.print("Reserva: " + reservationSolucaoBom);

        } catch (ParseException e) {
            System.out.println("Data Invalida");
        } catch (DomainException e) {
            System.out.println("Erro na Reserva " + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unexpected Error");
        }


    }
}
