package db.apllication;

import db.DB;
import db.DBIntergrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class ProgramUpdateDados {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "delete from department "
                            + "where "
                            + "Id = ?");

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();
            System.out.printf("Done! rows affected " + rowsAffected);
        } catch (SQLException e) {
            throw new DBIntergrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
