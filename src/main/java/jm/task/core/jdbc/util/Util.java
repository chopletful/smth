package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // "?serverTimezone=UTC" - эта запись для установки часового пояса MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/new_schema?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "98ofehom";

    public static Connection getMySQLConnection() {

        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
