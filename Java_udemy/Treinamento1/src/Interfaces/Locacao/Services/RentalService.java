package Interfaces.Locacao.Services;

import Interfaces.Locacao.Entites.CarRental;
import Interfaces.Locacao.Entites.Invoice;

import java.time.Duration;

public class RentalService {

    private Double priceDay;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double priceDay, Double pricePerDay, BrazilTaxService taxService) {
        this.priceDay = priceDay;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }


    public void ProcessInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerDay * Math.ceil(hours); // Math.ceil arredonda pra cima ex:4,16 = 5
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);


        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
}
