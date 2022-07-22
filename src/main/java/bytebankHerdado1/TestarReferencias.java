package bytebankHerdado1;

public class TestarReferencias {
    public static void main(String[] args) {
        // funciona pq tanto gerente com editor tb sao funcionario
        Funcionario g1 = new Gerente();
        g1.setNome("Ender");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        Funcionario e = new EdfitorVideo();
        e.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registro(g1);
        controle.registro(f);
        controle.registro(e);

        System.out.println(controle.getSoma());
    }
}
