package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        Connection conexao = FabricarConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, nome); // Substitui o primeiro '?' pelo nome e garante a segurança contra sql injection

        ps.executeUpdate(); // Executa a inserção
        sc.close();
        conexao.close();
    }
}
