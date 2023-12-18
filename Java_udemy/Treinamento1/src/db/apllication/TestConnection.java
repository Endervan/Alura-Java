package db.apllication;

import db.DB;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {
        Connection conn = DB.getConnection();


        DB.closeConnection();
    }
}
