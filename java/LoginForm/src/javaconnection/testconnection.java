package javaconnection;
import java.sql.*;

public class testconnection {
	public static void main(String[]args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
			try {
				Connection con = DriverManager.getConnection( "jdbc:mysql:http://localhost:3306/student","root","");
				String queryst ="select Name from student";
				Statement st= con.createStatement();
				ResultSet rs = st.executeQuery(queryst);
				String name= rs.getString("Name");
				System.out.println(name);
			}catch(SQLException e) {
				System.out.println("Sql exception");
						
			}
		}catch(ClassNotFoundException e) {
			System.out.println("Driver not loaded");
		}
			
			
			
	}
	

}
