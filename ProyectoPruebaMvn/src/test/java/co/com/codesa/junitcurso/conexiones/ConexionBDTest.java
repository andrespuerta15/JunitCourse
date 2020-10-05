package co.com.codesa.junitcurso.conexiones;

import static org.junit.Assert.assertThat;

import java.sql.Connection;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ConexionBDTest {

	private ConexionBD conexionDb;

	@Test
	public void testFail() {
		//Assert.fail("Prueba de fail");
	}

	@Test
	public void testFailConnectionDb() {

		conexionDb = new ConexionBD();

		Connection connection = conexionDb.getConnection();
		
		if (connection == null) {
			Assert.fail("Ha fallado la conexion con bd");
		}

		assertThat(connection, Matchers.notNullValue());
		assertThat(conexionDb.bdSid, Matchers.equalTo("gamble"));
		assertThat(conexionDb.bdUrl, Matchers.equalTo("gamble"));
		assertThat(conexionDb.bdUsr, Matchers.equalTo("gamble"));
		assertThat(conexionDb.bdPwd, Matchers.equalTo("gamble"));

	}

}
