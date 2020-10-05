package co.com.codesa.junitcurso.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBD {

	public final String bdSid = "springboot_db";
	public final String bdUrl = "jdbc:mysql://localhost/" + bdSid + "?";
	public final String bdUsr = "root";
	public final String bdPwd = "admin";
	public final String bdTimeZone = "GMT-4";

	public Connection getConnection() {

		Connection connection = null;

		try {

			Properties properties = new Properties();
			properties.put("user", bdUsr);
			properties.put("password", bdPwd);
			properties.put("serverTimezone", bdTimeZone);
			properties.put("verifyServerCertificate", "false");
			properties.put("useSSL", "false");

			connection = DriverManager.getConnection(bdUrl, properties);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return connection;
	}

}
