package byteBankAcess;

public class TestagetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        // conta.numero nao acessa por ser private
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Ender");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

    }
}
