package Streams.Filter;

public class Aluno {

    String nome;
    double nota;
    Boolean comportamento;

    public Aluno(String nome, double nota, Boolean comportamento) {
        this.nome = nome;
        this.nota = nota;
        this.comportamento = comportamento;
    }

    @Override
    public String toString() {
        return nome ;

    }
}
