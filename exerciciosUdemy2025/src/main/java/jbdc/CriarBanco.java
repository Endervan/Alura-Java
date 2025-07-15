package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "7064";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS curso_java");

        conexao.close();
    }
}
