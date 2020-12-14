package com.Sonata.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	Connection connection;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/JDBCExample","root","admin@123");
		}catch(ClassNotFoundException exp1) {System.out.println(exp1);}
		catch(SQLException exp2) {exp2.printStackTrace();}
	
			return connection;
	}
	public void closeConnection() {
		try {
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException e) {e.printStackTrace();}
	}
}