package com.me.homework.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String DB_URL = "jdbc:mysql://sql158.main-hosting.eu/u490063748_java";
	static final String USER = "u490063748_java";
	static final String PASS = "$Atyam123";
	static final String QUERY = "select * from emp";

	public static void main(String[] args) {
		// Open a connection
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Loading the driver
			Connection con = DriverManager.getConnection(DB_URL,USER,PASS); // Creating Connection - Estabilishing Connection
			Statement st = con.createStatement(); // Statment
			ResultSet rs = st.executeQuery(QUERY);// Exeucting query
			while (rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				Double sal = rs.getDouble("sal");
				System.out.print("Empno :"+ empno);
				System.out.print(" Emp Name :"+ ename);
				System.out.print(" Salary : " + sal);
				System.out.println();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
 * EMP ------------------------------- empno, ename, salary, department
 * 
 * 1 anees 1000 IT 2 Basheer 12333 IT ------------------------------ Account
 * 10000
 * 
 * Accoubt B
 * 
 * Account C
 * 
 * 
 * 
 * 
 */