package bytebankHerdado1;

//heranca pra funcionario e implements(interface) Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() { // super significar q atributo e da classe mae sup classe
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
