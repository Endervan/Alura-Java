package Contract.Apllication;

import Contract.Entities.Contract;
import Contract.Entities.Installment;
import Contract.Services.ContractService;
import Contract.Services.PaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com Dados do Contrato");
        System.out.print("NUmero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do Contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);
        System.out.print("Enter com numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaymentService());
        contractService.processContract(obj, n);


        System.out.println("Parcelas");
        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }



        sc.close();
    }
}
