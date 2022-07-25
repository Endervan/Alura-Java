package bytebankHerdado1;

//interface eum contrato nao pode ser reescrito
//interface  nda mais e que classe e todos os  metodos abstract ,e portanto n pode
//ter classe ou metodos concretos
// obrigar os filhos a implementar o q ele ta imposto caso setSenha e autentica
public abstract interface Autenticavel {
    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
