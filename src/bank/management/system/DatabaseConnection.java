package bank.management.system;
import java.sql.*;

public class DatabaseConnection {
    Connection connection;
    Statement statement;
    public DatabaseConnection(){
        try{
            String password = System.getenv("BANK_DB_PASSWORD");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root",password);
            statement=connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void main(String[] args) {

    }
}
