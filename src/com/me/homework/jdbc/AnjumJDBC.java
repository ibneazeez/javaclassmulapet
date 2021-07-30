package com.me.homework.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnjumJDBC {
	static final String DB_URL = "jdbc:mysql://sql158.main-hosting.eu/u490063748_java";
	static final String USER = "u490063748_java";
	static final String PASS = "$Atyam123";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from najmstudents where sname like '%" + args[0] +"%'");
		
		while(rs.next()) {
			int sno = rs.getInt("sno");
			int rno = rs.getInt("rollno");
			String name = rs.getString("sname");
			String branch = rs.getString("brnch");
			
			System.out.print(" Serial No : " +sno );
			System.out.print(" Role No : " +rno );
			System.out.print(" Student Name  : " +name );
			System.out.print(" Branch : " +branch);
			System.out.println();
		}
		
	}
	
	
}
