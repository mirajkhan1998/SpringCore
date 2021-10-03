package com.ci.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ci.bean.City;
import com.ci.cache.Cache;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int cityId = 0;
		String cityName = null;
		PrintWriter out = null;
		List<City> cities = null;
		City city = null;
		cities = new ArrayList<City>();
		Cache cache = null;
		try {
			cache = Cache.getInstance();
			out = response.getWriter();
			if (cache.containsKey("cities") == false) {
				System.out.println("Going to DataBase");
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedb", "root", "root");
				st = con.createStatement();
				rs = st.executeQuery("select * from city");
				while (rs.next()) {
					cityId = rs.getInt("city_id");
					cityName = rs.getString("city_name");
					city = new City(cityId, cityName);
					cities.add(city);
				}
				cache.put("cities", cities);
				System.out.println("dataStored in cache");
				out = response.getWriter();
				cities = (List<City>) cache.get("cities");
				/*for (int i = 0; i < cities.size(); i++) {
					city = cities.get(i);
					out.println("<table>");
					out.print("<tr><td>" + city.getCity_id() + "</td><td>" + city.getCity_name() + "</td></tr>");
					out.println("</table>");
				}*/
				for(City city1:cities) {
					out.println("<table>");
					out.print("<tr><td>" + city1.getCity_id() + "</td><td>" + city1.getCity_name() + "</td></tr>");
					out.println("</table>");
				}

			} else {
				System.out.println("DataAlready Stored in cached");
				cities = (List<City>) cache.get("cities");
				/*for (int i = 0; i < cities.size(); i++) {
					city = cities.get(i);
					// System.out.println("DataAlready Stored in cached");
					out.println("<table>");
					out.print("<tr><td>" + city.getCity_id() + "</td><td>" + city.getCity_name() + "</td></tr>");
					out.println("</table>");
				}*/
				for(City city1:cities) {
					out.println("<table>");
					out.print("<tr><td>" + city1.getCity_id() + "</td><td>" + city1.getCity_name() + "</td></tr>");
					out.println("</table>");
				}
			}

		} catch (SQLException | ClassNotFoundException se) {
			se.printStackTrace();
			// throw se;
		}
	}

}
