package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricarConexao {

    public static Connection getConexao() throws SQLException {
        try {
            final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
            final String usuario = "root";
            final String senha = "7064";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
