package Interfaces.Locacao.Entites;

import java.time.LocalDateTime;

public class CarRental extends Invoice {

    private LocalDateTime Start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        Start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return Start;
    }

    public void setStart(LocalDateTime start) {
        Start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
