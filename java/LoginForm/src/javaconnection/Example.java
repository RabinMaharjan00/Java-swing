package javaconnection;

import java.sql.*;
public class Example {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root ";
		String pwd = " ";
		String query = "select * from student";
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String data="";
		while(rs.next()) {
			data=rs.getInt(1)+ " " + rs.getInt(2);
			System.out.println(data);
			st.close();
			con.close();
		}
		
		
		
		
	}

}
