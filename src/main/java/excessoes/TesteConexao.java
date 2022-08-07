package excessoes;

public class TesteConexao {
    public static void main(String[] args) {

        // resumido bloco try + finally
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();

        } catch (IllegalStateException ex) {
            System.out.println("deu erro na conexão");
        }
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("deu erro na conexão");
//        } finally {
//            con.fecha();
//        }
    }
}
