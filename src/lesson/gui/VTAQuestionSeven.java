package lesson.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VTAQuestionSeven {

    public static void main(String[] args) {

         try {

             String JDBC_URL = "jdbc:mysql://localhost:3306/lavtcdb";
             String userName = "root";
             String passWord = "";
             String studentID = "EXAPLE_1000";
             int updatedMarks = 95;

             Connection conn = DriverManager.getConnection(JDBC_URL, userName, passWord);

             //Step 3 : Its better check if JDBC Connection created or not
             if (conn != null) {
                 System.out.println("DB Connection is Created Successfully");
             }else{
                 throw new Exception("DB is not connected");
             }

             //Step 4 :  Write a UPDATE query that you want to execute
             String updateSql = "UPDATE Student SET Marks=? WHERE StudentId=?";

             //Step 5 :  Need to create PreparedStatement instance to execute the SQL Query
             PreparedStatement statement = conn.prepareStatement(updateSql);
             statement.setInt(1,updatedMarks);
             statement.setString(2,studentID);

             //UPDATE Student SET Marks=95 WHERE StudentId= 'EXAPLE_1000';

             //Execute the SQL query and check if how many record are Update into the Table
             int rowsUpdated = statement.executeUpdate();
             if(rowsUpdated>0){
                 System.out.println("Record is Updated");
             }

             //Step 4 :  Write a SELECT query that you want to execute
             String selectSql = "SELECT * FROM Student WHERE StudentId = ?";

             //Step 5 :  Need to create PreparedStatement instance to execute the SQL Query
             PreparedStatement statement2 = conn.prepareStatement(selectSql);

             ResultSet resultSet = statement2.executeQuery();

             while (resultSet.next()) {

                 // Retrieve the Data when using table Column index
                 String studentId = resultSet.getString(1);
                 String firstName  = resultSet.getString(2);
                 String lastName =  resultSet.getString(3);
                 int marks = resultSet.getInt(4);

                 System.out.println("Student Id : " + studentId + " First Name : "+firstName + " Last Name : " + lastName + " Marks : " + marks  );
             }

             conn.close();

         }catch (Exception e){
             e.getMessage();
         }


    }


}
