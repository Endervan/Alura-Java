package bytebankHerdado1;

//gerente e um funcionario ou herda(herança)
public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //novo método, recebendo dois params ;;;
    // chamano sobrecarga funcao msm nome  da msm classe porem com mais parametros
    public boolean autentica(String login, int senha) {
        //implementable omitida
        return false;
    }

    public double getBonificacao() { // super significar q atributo e da classe mae sup classe
        return super.getBonificacao() + super.getSalario();
    }


}
