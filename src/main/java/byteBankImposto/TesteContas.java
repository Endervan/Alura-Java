package byteBankImposto;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(444, 222);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 201);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());

    }
}
