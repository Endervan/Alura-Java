package Streams.reduce.testReduceAvancado;

public class Aluno {

    public double nota;
    String nome;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " tei nota = " + nota;
    }

}
