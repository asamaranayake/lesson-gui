/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.backend;

import gui.pojo.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DbConnection {
    //Step 1: initize the JDBC URl , mysql username and password

    //DB Name is - lavtcdb
    // Hosted in Locally with default  - 3306
    // Using MySql Database

    private String JDBC_URL = "jdbc:mysql://localhost:3306/lavtcdb";
    private String userName = "root";
    private String passWord = "";

    public Connection connect() throws Exception {
        Connection conn = DriverManager.getConnection(JDBC_URL, userName, passWord);
        return conn;

    }

    public int insertUserData(Connection conn) throws Exception {

        //Step 3 : Write the SQL Query that you want to execute
        //this is For INSERT Query for Data insert operation
        String sqlQuery = "INSERT INTO users(user_id,username,password,fullname,email) VALUES (?,?,?,?,?)";

        //Step 4 : Pass the query into PreparedStatment Object
        PreparedStatement preStatment = conn.prepareStatement(sqlQuery);

        //Step 5 : Set the insert Values into relavent Coulumns
        preStatment.setInt(1, 99999);
        preStatment.setString(2, "testuser");
        preStatment.setString(3, "password123");
        preStatment.setString(4, "James bond");
        preStatment.setString(5, "javatest@email.com");

        //Execute the SQL query and check if how many record are insert into the Table
        return preStatment.executeUpdate();

    }

    public int insertUserData(Connection conn, User user) throws Exception {

        //Step 3 : Write the SQL Query that you want to execute
        //this is For INSERT Query for Data insert operation
        String sqlQuery = "INSERT INTO users(user_id,username,password,fullname,email) VALUES (?,?,?,?,?)";

        //Step 4 : Pass the query into PreparedStatment Object
        PreparedStatement preStatment = conn.prepareStatement(sqlQuery);

        //Step 5 : Set the insert Values into relavent Coulumns
        preStatment.setInt(1, user.getUserid());
        preStatment.setString(2, user.getUserName());
        preStatment.setString(3, user.getPassword());
        preStatment.setString(4, user.getFullName());
        preStatment.setString(5, user.getEmail());

        //Execute the SQL query and check if how many record are insert into the Table
        return preStatment.executeUpdate();

    }

    public ResultSet getQueryData(String query, Connection conn) throws Exception {
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public int deleteUserData(Connection conn, String username) throws SQLException {
        String query = "DELETE FROM users WHERE username=?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, username);
        return pst.executeUpdate();
    }

    public void closeConnection(Connection conn) throws Exception {
        conn.close();
    }
}
