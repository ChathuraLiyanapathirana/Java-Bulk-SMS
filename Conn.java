/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfcsmsclient;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SUMIRAX
 */
public class Conn {

//    Connect to mysql DB
    String url = "jdbc:mysql://localhost:3306/smstest";
    String username = "root";
    String password = "";
    private static Connection connection = null;
    private static Conn connClass = null;

    private Conn() throws SQLException {
        connection = (Connection) DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public static Conn getDbConnection() throws SQLException {
        if (connClass == null) {
            connClass = new Conn();
        }
        return connClass;
    }
}
