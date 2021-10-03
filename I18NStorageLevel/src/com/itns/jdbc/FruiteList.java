package com.itns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FruiteList {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/generaldb", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select * from fruit1");
			// System.out.println("fruite_no\tfruite_name\tdescription\tprice\type");
			while (rs.next()) {
				System.out.println(rs.getString("fruit_no") + " " + rs.getString("fruit_name") + "\t"
						+ rs.getString("description") + " " + rs.getInt("price") + " " + rs.getString("type"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
