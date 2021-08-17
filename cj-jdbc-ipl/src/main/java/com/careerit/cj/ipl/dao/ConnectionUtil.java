package com.careerit.cj.ipl.dao;

import static com.careerit.cj.ipl.AppConstants.DB_PASSWORD;
import static com.careerit.cj.ipl.AppConstants.DB_URL;
import static com.careerit.cj.ipl.AppConstants.DB_USERNAME;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public final class ConnectionUtil {

	private static final Properties properties = new Properties();
	static {
		try {
			properties.load(ConnectionUtil.class.getResourceAsStream("/application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ConnectionUtil() {

	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(properties.getProperty(DB_URL), properties.getProperty(DB_USERNAME),
					properties.getProperty(DB_PASSWORD));
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

	public static void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (con != null) {
				con.close();
			}
			if (st != null) {
				st.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing connection :" + e);
		}
	}

	public static void close(PreparedStatement st, Connection con) {
		try {
			if (con != null) {
				con.close();
			}
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			System.out.println("While closing connection :" + e);
		}

	}
}
