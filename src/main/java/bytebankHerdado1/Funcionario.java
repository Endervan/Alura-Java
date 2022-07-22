package bytebankHerdado1;

public class Funcionario {
    private double salario; // visivel tb pra filhos herdados
    private int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor
    private String nome;
    private String cpf;

    // bonificação de 10% funcionario
    public double getBonificacao() {

        if (this.tipo == 0) { // Funcionário comum;
            return this.salario * 0.1;
        } else if (this.tipo == 1) { // Gerente;
            return this.salario;
        } else {
            return this.salario + 1000.0;
        }

    }

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
