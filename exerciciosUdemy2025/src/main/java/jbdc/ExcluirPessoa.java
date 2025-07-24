package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricarConexao.getConexao();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ID da pessoa que deseja excluir:");
        int codigo = input.nextInt();

        String sql = "DELETE FROM pessoas WHERE codigo = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setInt(1, codigo);

        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("Pessoa com ID " + codigo + " foi excluída com sucesso!");
        } else {
            System.out.println("Nenhuma pessoa encontrada com o ID " + codigo);
        }
        // Fechando os recursos
        input.close();
        conexao.close();
        preparedStatement.close();

    }
}
