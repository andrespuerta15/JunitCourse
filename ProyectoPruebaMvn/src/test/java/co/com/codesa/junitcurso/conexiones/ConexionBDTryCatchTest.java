package co.com.codesa.junitcurso.conexiones;

import java.sql.Connection;
import java.sql.SQLException;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConexionBDTryCatchTest {

	private static final String BD_SID = "springboot_db";
	private static final String BD_USR = "tester";
	private static final String BD_PWD = "tester";
	private static final String BD_USR_FAIL = "developer";

	private ConexionBDTryCatch conexionBDTryCatch;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void testConnectionSuccess() {
		conexionBDTryCatch = new ConexionBDTryCatch(BD_SID, BD_USR, BD_PWD);
		Connection connection = null;

		try {
			connection = conexionBDTryCatch.getConnection();
		} catch (SQLException e) {
			Assert.fail("La creación de la conexión ha fallado");
		}

		Assert.assertThat(connection, Matchers.notNullValue());
	}

	@Test
	public void testConnectionFailed() {
		conexionBDTryCatch = new ConexionBDTryCatch(BD_SID, BD_USR_FAIL, BD_PWD);
		Connection connection = null;

		try {
			connection = conexionBDTryCatch.getConnection();
			Assert.fail("La creación de la conexión ha fallado");
		} catch (SQLException e) {
			Assert.assertThat(e, Matchers.isA(SQLException.class));
			Assert.assertThat(e.getMessage(), Matchers.startsWith("Access denied"));
			Assert.assertThat(e.getMessage(), Matchers.containsString("Access denied"));
			Assert.assertThat(e.getSQLState(), Matchers.is("28000"));
		}

		Assert.assertThat("La conexion a la bd ha fallado", connection, Matchers.nullValue());
	}

	// Si el metodo arroja una excepcion de tipo SQLExcepction, entonces la
	// prueba es exitosa.
	@Test(expected = SQLException.class)
	public void testConnectionFailedAnotations() throws SQLException {
		conexionBDTryCatch = new ConexionBDTryCatch(BD_SID, BD_USR_FAIL, BD_PWD);
		conexionBDTryCatch.getConnection();
	}

	// Si el metodo arroja una excepcion dentro de la regla, la prueba es
	// exitosa
	@Test
	public void testConnectionFailedRule() throws SQLException {

		expectedException.expect(SQLException.class);
		expectedException.expectMessage("Access denied for user 'developer'@'localhost' (using password: YES)");
		expectedException.expectMessage("Access denied");
		expectedException.expectMessage("'developer'@'localhost' (using password: YES)");
		expectedException.expectMessage(
				Matchers.equalTo("Access denied for user 'developer'@'localhost' (using password: YES)"));
		expectedException.expectMessage(Matchers.containsString("denied for user 'developer'"));
		expectedException.expectMessage(Matchers.startsWith("Access denied"));
		expectedException.expectMessage(Matchers.endsWith("(using password: YES)"));

		conexionBDTryCatch = new ConexionBDTryCatch(BD_SID, BD_USR_FAIL, BD_PWD);
		conexionBDTryCatch.getConnection();
	}

}
