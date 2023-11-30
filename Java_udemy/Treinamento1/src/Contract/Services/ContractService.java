package Contract.Services;

import Contract.Entities.Contract;
import Contract.Entities.Installment;
import Contract.Services.Interface.OnlinePaymentInterface;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentInterface onlinePaymentInterface;

    public ContractService(OnlinePaymentInterface onlinePaymentInterface) {
        this.onlinePaymentInterface = onlinePaymentInterface;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            // juros simples por meses
            double interest = onlinePaymentInterface.interest(basicQuota, i);

            // taxa de pagamento
            double fee = onlinePaymentInterface.paymentFee(basicQuota + interest);

            // quota pagamento total com juros
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));


        }
    }
}
