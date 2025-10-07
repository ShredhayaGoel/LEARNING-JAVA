package databases;

import java.sql.*;

import java.util.Scanner;

public class addstudents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID (integer): ");
        int StudentID = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter student name: ");
        String StudentName = sc.nextLine();

        System.out.print("Enter student age: ");
        int StudentAge = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter father name: ");
        String FatherName = sc.nextLine();

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/login_db";
        String user = "root";  // your MySQL username
        String password = "SGMIET1234";  // your MySQL password (if any)

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL query to insert data
             String sql = "INSERT INTO student (StudentID, StudentName, StudentAge, FatherName) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set values
            stmt.setInt(1, StudentID);
            stmt.setString(2, StudentName);
            stmt.setInt(3, StudentAge);
            stmt.setString(4, FatherName);

            // Execute the query
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Student data inserted successfully!");
            }

            // Close the connection
            conn.close();

        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        }

        sc.close();
    }
}
// javac -cp ".;mysql-connector-j-9.4.0.jar" addstudents.java
// java -cp ".;mysql-connector-j-9.4.0.jar" addstudents
