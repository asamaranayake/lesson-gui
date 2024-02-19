package lesson.gui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStatement {

        public static void main(String[] args) {
            //Step 1: initialize the JDBC URl , mysql username and password
            String dbURL = "jdbc:mysql://localhost:3306/testdb";
            String username = "root";
            String password = "root";

            try {
                //Step 2 : Db connection Creation
                Connection conn = DriverManager.getConnection(dbURL, username, password);

                //Step 3 : Its better check if JDBC Connection created or not
                if (conn != null) {
                    System.out.println("DB Connection is Creted Successfully");
                }

                //Step 4 :  Write a UPDATE query that you want to execute
                String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
                //Step 5 :  Need to create PreparedStatement instance to execute the SQL Query
                assert conn != null;
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, "123456789");
                statement.setString(2, "William Henry Bill Gates");
                statement.setString(3, "bill@gatesfoundation.org");
                statement.setString(4, "bill");

                //Execute the SQL query and check if how many record are Update into the Table
                int rowsUpdated = statement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("An existing user was updated successfully!");
                }

            } catch ( SQLException ex) {
                System.out.println("Error is  : " + ex.getMessage());
            }

        }

    }
