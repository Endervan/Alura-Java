package db.apllication;

import db.DB;

import java.sql.*;
import java.text.SimpleDateFormat;

public class insertDados {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();

//            st = conn.prepareStatement(
//                    "INSERT INTO seller"
//                            + "(name,Email,BirthDate,BaseSalary,DepartmentId)"
//                            + "VALUES"
//                            + "(?,?,?,?,?)",
//                    Statement.RETURN_GENERATED_KEYS);
//            st.setString(1, "Ender Alves");
//            st.setString(2, "Ender@gmail.com");
//            // passando datas do java pro msql
//            st.setDate(3, new java.sql.Date(sdf.parse("14/05/1989").getTime()));
//            st.setDouble(4, 3000.0);
//            st.setInt(5, 2);

            st = conn.prepareStatement("insert into department(Name) values ('D1'),('D2') ", Statement.RETURN_GENERATED_KEYS);

            int rowAffected = st.executeUpdate();

            if (rowAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done,Id : " + id);
                }

            } else {
                System.out.println("Nenhuma Linha Foi Afetada ");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
