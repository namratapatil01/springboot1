package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tka.entity.Classroom;
import com.tka.util.DatabaseUtil;

public class ClassroomDao {

	public static void deleteClassroomDetailsAboveCapacity(int capacity) {
		try {
			System.out.println("I am in dao - deleteClassroomDetailsAboveCapacity");

			// Class.forName("com.mysql.cj.jdbc.Driver");
			DatabaseUtil.loadDiver("com.mysql.cj.jdbc.Driver");
			// Connection connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/185db", "root",
			// "root");
			Connection connection = DatabaseUtil.createConnection("jdbc:mysql://localhost:3306/185db", "root", "Namrata@05");

			// Statement statement = connection.createStatement();
			Statement statement = DatabaseUtil.createStmt(connection);
			String sql = "delete from classroom where clsAreaCapacity >" + capacity;
			System.out.println("sql >>> " + sql);
			statement.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Classroom> fetchAllClassrooms() {

		ArrayList<Classroom> listCls = new ArrayList<>();
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			DatabaseUtil.loadDiver("com.mysql.cj.jdbc.Driver");
			// Connection connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/185db", "root",
			// "root");
			Connection connection = DatabaseUtil.createConnection("jdbc:mysql://localhost:3306/185db", "root", "root");

			// Statement statement = connection.createStatement();
			Statement statement = DatabaseUtil.createStmt(connection);

			String sql = "select * from classroom";
			System.out.println("sql >>> " + sql);

			// ResultSet rs = statement.executeQuery(sql);
			ResultSet rs = DatabaseUtil.generateResultSet(sql, statement);

			while (rs.next()) {
				Classroom classroom = new Classroom();
				int id = rs.getInt(1);
				String clasName = rs.getString(2);
				classroom.setClsId(id);
				classroom.setClsName(clasName);
				listCls.add(classroom);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCls;

	}
}
