package byteBankImposto;

public class TesteTributavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(444, 222);
        cc.deposita(100.00);

        SeguraDeVida seguro = new SeguraDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());
    }
}