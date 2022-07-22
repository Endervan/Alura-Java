package bytebankHerdado1;

public class EdfitorVideo extends Funcionario {

    public double getBonificacao() {
        return super.getBonificacao() + 100;

    }
}
