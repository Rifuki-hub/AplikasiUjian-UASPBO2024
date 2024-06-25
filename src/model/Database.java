package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Database instance;
    private Connection conn;

    private Database() {}

    /**
     * Get the singleton instance of Config.
     * @return Config instance
     */
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    /**
     * Establish a connection to the SQLite database.
     * @return Connection object
     * @throws SQLException if a database access error occurs
     */
    public Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:UasPbo.db";
                conn = DriverManager.getConnection(url);
            } catch (ClassNotFoundException e) {
                System.out.println("SQLite JDBC Driver not found. Add the driver to your classpath.");
                e.printStackTrace();
                throw new SQLException(e);
            }
        }
        return conn;
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing database connection: " + e.getMessage());
        }
    }
}
