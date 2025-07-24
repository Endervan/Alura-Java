package jbdc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultaPessoa1 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricarConexao.getConexao();
        String sql = "select * from pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            pessoas.add(new Pessoa(
                    resultado.getString("nome"),
                    resultado.getInt("codigo"))
            );
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        stmt.close();
        conexao.close();

    }
}
