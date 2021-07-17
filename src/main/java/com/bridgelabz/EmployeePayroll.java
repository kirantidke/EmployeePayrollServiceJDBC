package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class EmployeePayroll {
	public static void main(String[] args) throws Exception {
		
	String url = "jdbc:mysql://localhost:3306/EmployeePayrollServices";
	String userName = "root";
	String password = "root";
	Class.forName("com.mysql.cj.jdbc.Driver");
	

	// establish connection
	try(
	Connection con = DriverManager.getConnection(url, userName, password);
	String sql = "create table EmployeePayroll(id int not null primary key,name varchar(255),salary int,startDate date)";
	//create statement
	Statement st = con.createStatement();
	){
	//execute the query
	st.executeUpdate(sql);
	System.out.println("table created successfully....");
	}
	catch (SQLException e) {
        e.printStackTrace();
	}
}
