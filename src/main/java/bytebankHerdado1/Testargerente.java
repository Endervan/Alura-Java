package bytebankHerdado1;

public class Testargerente {
    public static void main(String[] args) {
        Autenticavel referencia = new Gerente();

        Gerente g1 = new Gerente();
        g1.setNome("marco");
        g1.setCpf("00000000000");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getNome());

        g1.setSenha(2222);

        boolean autenticaçãoGerente = g1.autentica(2222);
        System.out.println(autenticaçãoGerente);

        System.out.println(g1.getBonificacao());
    }
}
