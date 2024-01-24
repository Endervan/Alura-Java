package db.apllication;

import db.DB;
import db.DBException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class transacaoDados {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            conn.setAutoCommit(false); // nao executa as transacoes automaticamente

            int row1 = st.executeUpdate("UPDATE seller set BaseSalary = 2090 where DepartmentId = 1");

//            int x = 1;
//            while (x < 2) {
//                throw new SQLException("fake error");
//            }
            int row2 = st.executeUpdate("UPDATE seller set BaseSalary = 2090 where DepartmentId = 2");

            conn.commit(); // confirma as transacoes

            System.out.println("row1 " + row1);
            System.out.println("row2 " + row2);

        } catch (SQLException e) {
            try {
                conn.rollback(); // volta a transacao caso sistema der excessao
                throw new DBException("Transicion rolled back! caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DBException("Error trying roolback! caused by: " + ex);
            }

        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
