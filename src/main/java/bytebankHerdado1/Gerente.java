package bytebankHerdado1;

// Autenticavel , xx etc posso assinar varios contratos

//gerente e um funcionario ou herda(herança)
// java n faz herança multipla ex: extends Autenticavel, Funcionario
public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil(); // composição
    }

    //novo método, recebendo dois params ;;;
    // chamano sobrecarga funcao msm nome  da msm classe porem com mais parametros
//    public boolean autentica(String login, int senha) {
//        //implementable omitida
//        return false;
//    }
    public double getBonificacao() { // super significar q atributo e da classe mae sup classe
        return super.getSalario();
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
