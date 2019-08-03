/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcfirst;

import java.sql.*;

/**
 *
 * @author Binish125
 */
public class JdbcFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Diver Loaded Successfully");
            try{
                //String query= "select * from login_table";
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
                Statement st = con.createStatement();
                int uid=4;
                String username="Prithivi";
                String password="Birendra";
                String country="Dipendra";
                String query = "Insert into login_table values ("+uid+",'"+username+"','"+password+"','"+country+"')";
                //ResultSet rs = st.executeQuery(query);
                int Count = st.executeUpdate(query);
                System.out.println(Count + " Rows affected");
                //while(rs.next()){
                //    String name = rs.getString("username") + " " +rs.getString("password");
                //    System.out.println(name);
                //}
                System.out.println("Inserted Successfully");
                st.close();
                con.close();
            }catch(SQLException e){
                System.out.println("SQL Exception");
            }
        }catch(ClassNotFoundException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
