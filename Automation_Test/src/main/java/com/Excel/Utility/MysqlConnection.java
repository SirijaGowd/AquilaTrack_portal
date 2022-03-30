package com.Excel.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnection {
	static String vehicle_no;
	static Connection con;

	public static Connection setup() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://3.7.140.198:3306/test_automation_test", "admin",
				"aQuila@dmin");

		// Connection con =
		// DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb", "root",
		// "zeliot@123");
		System.out.println("mysql connection success");

		Statement stmt = con.createStatement();

		// String s = "INSERT INTO testdb.VehicleNumber VALUES(105,'KA32415')";
		//String s = "select * from VehicleNumber";

//		ResultSet set = stmt.executeQuery(s);

		//System.out.println(set);

		return con;
	}

	public static void close() throws SQLException {
		// if(con==null)

		con.close();

	}

}
