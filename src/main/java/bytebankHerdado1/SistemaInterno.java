package bytebankHerdado1;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Nao tei acesso ");
        }
    }
}
