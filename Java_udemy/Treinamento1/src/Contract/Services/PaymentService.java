package Contract.Services;

import Contract.Services.Interface.OnlinePaymentInterface;

public class PaymentService implements OnlinePaymentInterface {


    @Override
    public double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(Double amount, int months) {
        return amount * 0.01 * months;
    }
}
