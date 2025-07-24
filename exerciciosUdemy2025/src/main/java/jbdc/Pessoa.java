package jbdc;

public class Pessoa {

    private  int codigo;
    private String nome;

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
