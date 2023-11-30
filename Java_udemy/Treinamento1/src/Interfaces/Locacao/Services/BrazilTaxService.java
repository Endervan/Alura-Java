package Interfaces.Locacao.Services;

public class BrazilTaxService {

    // imposto cobrado no brazil
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }


}
