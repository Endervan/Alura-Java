package byteBankAcess;



public class TestaSacanegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        System.out.println(conta.getSaldo());


    }
}
