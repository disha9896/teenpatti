/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author s062
 */
public class Database {

    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;
        Statement stat = null;
        // String path = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            stat = con.createStatement();
            rs = stat.executeQuery("Select roll,Name,cgpa from student");
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("Name");
                float cgpa = rs.getFloat("cgpa");
                System.out.println("Roll=" + roll + "Name=" + name + "cgpa=" + cgpa);
            }
            stat.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
