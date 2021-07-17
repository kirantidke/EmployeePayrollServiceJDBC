package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class EmployeePayroll {

	static final String url = "jdbc:mysql://localhost/";;
	static final String user = "root";
	static final String password = "root";

	public static void main(String[] args) throws Exception {

		// Open a connection
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();) {
			String sql = "create database EmployeePayrollServices";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
