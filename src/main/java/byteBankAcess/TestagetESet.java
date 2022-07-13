package byteBankAcess;

public class TestagetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(0002,1337);
        // conta.numero nao acessa por ser private
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Ender");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        // agora em duas linhas
        Cliente titularConta = conta.getTitular();
        titularConta.setProfissao("Progamador");

        System.out.println(titularConta.getProfissao());

        System.out.println(titularConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());


    }
}
