package br.com.lista;

public class Aluno {
    private final String nome;
    private final int numeromatricula;


    public Aluno(String nome, int numeromatricula) {
        if (nome == null){
            throw new NullPointerException("nome não pode ser null");
        }
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

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() { // numero magico q java atribuir ao seus objetos
        return this.nome.hashCode();
    }
}
