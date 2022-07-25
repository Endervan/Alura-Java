package bytebankHerdado1;

// abstract => significa unico jamais poderam ser instaciado ex new Funcionario
public abstract class Funcionario {
    private double salario; // visivel tb pra filhos herdados
    private int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor
    private String nome;
    private String cpf;

    // bonificação de 10% funcionario add metodo abstract
    // metodo sem corpo
    public abstract double getBonificacao();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
