package Contract.Services.Interface;

public interface OnlinePaymentInterface {

    double paymentFee(Double amount);
    double interest(Double amount, int months);
}
