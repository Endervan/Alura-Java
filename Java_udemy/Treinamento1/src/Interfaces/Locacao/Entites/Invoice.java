package Interfaces.Locacao.Entites;

public class Invoice {

    private Double basicPayment;
    private Double Tax;

    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        Tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }


    public Double getTotalPayment() {
        return this.getBasicPayment() + getTax();
    }
}
