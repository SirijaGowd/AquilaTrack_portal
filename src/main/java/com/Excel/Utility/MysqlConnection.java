package com.Excel.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnection {
	// static String vehicle_no;
	static Connection con;

	public static Connection setup() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "zeliot123");

		System.out.println("mysql connection success");

		Statement stmt = con.createStatement();

		// String s = "INSERT INTO testdb.VehicleNumber VALUES(105,'KA32415')";
		String s = "select * from Vehicle";

		ResultSet set = stmt.executeQuery(s);

		System.out.println(set);

		return con;
	}

	public static void close() throws SQLException {
		// if(con==null)

		con.close();

	}

}
