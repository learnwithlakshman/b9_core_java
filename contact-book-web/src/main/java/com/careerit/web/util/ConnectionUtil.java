package com.careerit.web.util;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public final class ConnectionUtil {

	private final static String DB_URL="jdbc:mysql://localhost:3306/cbook";
	private final static String DB_USERNAME="dbuser";
	private final static String DB_PASSWORD="dbuser";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private ConnectionUtil() {
		
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_USERNAME,
					DB_PASSWORD);
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
