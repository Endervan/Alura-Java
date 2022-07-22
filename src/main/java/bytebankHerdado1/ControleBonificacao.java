package bytebankHerdado1;

public class ControleBonificacao {
    private double soma;

//    public void registro(Gerente g) {
//        double boni = g.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    // usando polimorfismo
    public void registro(Funcionario f) {
        this.soma += f.getBonificacao();
    }

//    public void registro(EdfitorVideo e) {
//        double boni = e.getBonificacao();
//        this.soma = this.soma + boni;
//    }

    public double getSoma() {
        return soma;
    }
}
