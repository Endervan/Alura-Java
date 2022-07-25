package byteBankHerdadoConta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override // sobreescreve o saca da Conta super classe
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2; // todos os saques tei cobraça de 20 centavos
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
