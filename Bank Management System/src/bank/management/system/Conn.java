package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection (Replace with your database details)
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Manoj@46518");

            // Create a Statement
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database Connection Failed!");
        }
    }

    // ✅ Fix: Properly return the connection
    public Connection getConnection() {
        return c;
    }
}
