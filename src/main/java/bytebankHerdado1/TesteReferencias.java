package bytebankHerdado1;

public class TesteReferencias {

    public static void main(String[] args) {
//        Gerente g1 = new Gerente(); // == polimofismo podemos troca referecia Gerente  pra tipo mais genertico (Funcionario super classe)
        Funcionario g1 = new Gerente(); // polimofismo
        g1.setNome("Ender");

        String nome = g1.getNome();
        System.out.println(nome);
    }
}
