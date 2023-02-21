package br.com.lista;

public class Aluno {
    private final String nome;
    private final int numeromatricula;


    public Aluno(String nome, int numeromatricula) {
        this.nome = nome;
        this.numeromatricula = numeromatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeromatricula() {
        return numeromatricula;
    }

    @Override
    public String toString() {
        return "[Aluno -" + this.nome + " , matricula :" + this.numeromatricula + " ]";
    }


}
