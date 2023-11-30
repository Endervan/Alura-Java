package Interfaces.Locacao.main;

import Interfaces.Locacao.Entites.CarRental;
import Interfaces.Locacao.Entites.Vehicle;
import Interfaces.Locacao.Services.BrazilTaxService;
import Interfaces.Locacao.Services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com dados do Aluguel");
        System.out.print("Modelo do Carro: ");
        String carModel = sc.nextLine();

        System.out.println("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), ftm);

        System.out.println("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), ftm);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre Com preco por horas: ");
        double pricePerHours = sc.nextDouble();

        System.out.print("Entre Com preco por dia: ");
        double priceHours = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHours, priceHours, new BrazilTaxService());

        rentalService.ProcessInvoice(cr);

        System.out.println("Fatura");
        System.out.println("Pagamento Basico:" + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto:" + cr.getInvoice().getTax());
        System.out.println("Pagamento Total:" + cr.getInvoice().getTotalPayment());


        sc.close();
    }
}
