package co.com.codesa.junitcurso.conexiones;

import java.sql.Connection;

import org.junit.Assume;
import org.junit.Test;

public class ConexionBDAssumptionsTest {

	private ConexionBDAssumptions conexionBDAssumptions;

	@Test
	public void testConexionAssumption() {
		conexionBDAssumptions = new ConexionBDAssumptions("bdSid", "bdUsr", "bdPwd");
		Connection connection = null;

		try {
			conexionBDAssumptions.getConnection();

			/**
			 * Ejecutar sentencias contra la BD
			 */
		} catch (Exception e) {
			Assume.assumeNotNull(connection);
		}
	}

}
