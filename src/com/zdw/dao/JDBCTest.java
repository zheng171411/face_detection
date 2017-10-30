package com.zdw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "";
		String user = "";
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "update people set firstname=? , lastname=? where id=?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, "Gary");
		statement.setString(2, "Larson");
		statement.setLong (3, 123);

		int rowsAffected = statement.executeUpdate();

	}
}
