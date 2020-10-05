package co.com.codesa.junitcurso.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBDAssumptions {

	private final String bdSid; // = "springboot_db";
	private final String bdUrl; // = "jdbc:mysql://localhost/" + bdSid + "?";
	private final String bdUsr; // = "root";
	private final String bdPwd; // = "admin";
	private final String bdTimeZone; //  = "GMT-4";
	
	

	public ConexionBDAssumptions(final String bdSid, final String bdUsr, final String bdPwd) {
		super();
		this.bdSid = bdSid;
		this.bdUrl = "jdbc:mysql://localhost/" + this.bdSid;
		this.bdUsr = bdUsr;
		this.bdPwd = bdPwd;
		this.bdTimeZone = "GMT-4";
	}

	public Connection getConnection() throws SQLException {

		Properties properties = new Properties();
		properties.put("user", bdUsr);
		properties.put("password", bdPwd);
		properties.put("serverTimezone", bdTimeZone);
		properties.put("verifyServerCertificate", "false");
		properties.put("useSSL", "false");

		return DriverManager.getConnection(bdUrl, properties);
	}

	public String getBdSid() {
		return bdSid;
	}

	public String getBdUrl() {
		return bdUrl;
	}

	public String getBdUsr() {
		return bdUsr;
	}

	public String getBdPwd() {
		return bdPwd;
	}

	public String getBdTimeZone() {
		return bdTimeZone;
	}

}
