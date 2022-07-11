package byteBank;

public class TestaMetodos {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);

        System.out.println("Conta paulo Valor atualizado ==" + contaDoPaulo.saldo);

        boolean conseguiuRetira = contaDoPaulo.saca(200);
        System.out.println(conseguiuRetira);

        Conta contamarcela = new Conta();
        contamarcela.deposita(1000);

        boolean sucessoTransferencia = contamarcela.transfere(300, contaDoPaulo);
        if (sucessoTransferencia) {
            System.out.println("Transferincia Feita com Sucesso");
        } else {
            System.out.println("Faltou Dinheiro");
        }
        System.out.println("Conta da marcela ==" + contamarcela.saldo);
        System.out.println("Conta da paulo ==" + contaDoPaulo.saldo);

    }
}
