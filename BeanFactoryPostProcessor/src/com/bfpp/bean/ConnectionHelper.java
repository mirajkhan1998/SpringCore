package com.bfpp.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public ConnectionHelper(String driverClassName, String url, String username, String password) {
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName(driverClassName);
		con = DriverManager.getConnection(url, username, password);
		return con;
	}

	@Override
	public String toString() {
		return "ConnectionHelper [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
}
