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
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//String sql = "create table EmployeePayroll(id int not null primary key,name varchar(255),salary int,startDate date)";
				//create statement
		Statement st = con.createStatement();
		

		// establish connection
		
				// String sql = "create table EmployeePayroll(id int not null primary key,name
				// varchar(255),salary int,startDate date)";
				// create sConnection con = DriverManager.getConnection(url, usertatement
				

		
			// execute the query
			// st.executeUpdate(sql);
			//System.out.println("table created successfully....");

			//System.out.println("Inserting records into the table...");
			/*String sql = "INSERT INTO EmployeePayroll VALUES (101, 'Zara',30000, '2021-12-2')";
			st.executeUpdate(sql);

			sql = "INSERT INTO EmployeePayroll VALUES (102, 'ali', 40000, '2020-10-21')";
			st.executeUpdate(sql);
			sql = "INSERT INTO EmployeePayroll VALUES (103, 'pooja', 35000, '2020-05-2')";
			st.executeUpdate(sql);
			sql = "INSERT INTO EmployeePayroll VALUES(104, 'Sumit', 50000, '2021-01-20')";
			st.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

			// applying primary key
			sql = "alter table EmployeePayroll add primary key(id)";
			st.executeUpdate(sql);
			*/
			
			
	//	} catch (Exception e) {
		//	e.printStackTrace();
		//}
		//retrive all data from the table
		
		ResultSet rs = st.executeQuery("select * EmployeePayroll");
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int salary = rs.getInt("salary");
		Date startDate = rs.getDate("startDate");
		System.out.println(id+ " " +name+ " " + salary + " " + startDate);
		

	}

}
