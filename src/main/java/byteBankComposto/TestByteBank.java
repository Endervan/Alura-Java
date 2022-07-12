package byteBankComposto;

public class TestByteBank {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Siveira";
        paulo.cpf = "111.111.111-11";
        paulo.profissao = "Programador";
        Conta contaDopaulo = new Conta();
        contaDopaulo.deposita(100);
        System.out.println("Conta do paulo "+ contaDopaulo.saldo);

        // associação atribuir referencia atributo titular
        contaDopaulo.titular = paulo;
        System.out.println("titular " +contaDopaulo.titular.nome);

        // referencia mesmissimo objeto
        System.out.println(contaDopaulo.titular); // saida Cliente@58372a00
        System.out.println(paulo); // saida Cliente@58372a00
    }
}
