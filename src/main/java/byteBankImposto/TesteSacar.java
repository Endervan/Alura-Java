package byteBankImposto;

public class TesteSacar {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(125, 254);
        c.deposita(200);

        try {
            c.saca(200);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(c.getSaldo());
    }
}
