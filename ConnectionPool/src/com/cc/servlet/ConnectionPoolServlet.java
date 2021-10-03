package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/pool")
public class ConnectionPoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	InitialContext context = null;
	Connection con = null;
	DataSource ds = null;
	PrintWriter out = null;
	Statement st = null;
	ResultSet rs = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			out = response.getWriter();
			context = new InitialContext();
			ds = (DataSource) context.lookup("jndi1");
			con = ds.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from student_marks");
			out.println("<b>it is working</b>");
			while (rs.next()) {
				out.println("<table>");
				out.println("<tr>");
				out.println("<td>marks1</td>");
				out.println("<td>" + rs.getInt("marks1") + "</td>");
				out.println("<td>marks2</td>");
				out.println("<td>" + rs.getInt("marks2") + "</td>");
				out.println("<td>marks3</td>");
				out.println("<td>" + rs.getInt("marks3") + "</td>");
				out.println("</tr>");
				out.println("</table>");
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
