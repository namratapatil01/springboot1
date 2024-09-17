package com.tka.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {

	public static void loadDiver(String driverName) throws ClassNotFoundException {
		Class.forName(driverName);
	}

	public static Connection createConnection(String url, String username, String password) throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

//option 1
	public static Statement createStmt(Connection connection) throws SQLException {
		return connection.createStatement();
	}

//option 2
	public static Statement createStmtoption2() throws SQLException {
		Connection connection = createConnection("jdbc:mysql://localhost:3306/185db", "root", "Namrata@05");
		return connection.createStatement();
	}

	// option 3

	public static Statement createStmtoption3(String url, String uname, String passwd) throws SQLException {
		Connection connection = createConnection(url, uname, passwd);
		Statement statement = connection.createStatement();
		return statement;
	}

	public static ResultSet generateResultSet(String sql, Statement statement) throws SQLException {
		ResultSet rs = statement.executeQuery(sql);
		return rs;
	}

}









