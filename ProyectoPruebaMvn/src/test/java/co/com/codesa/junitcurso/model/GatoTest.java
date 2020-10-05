package co.com.codesa.junitcurso.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GatoTest {

	private static final String NOMBRE = "Dominic";
	private static final String RAZA = "Americano";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConstructWithFields() {

		Gato gato = new Gato(NOMBRE, RAZA);

		Assert.assertThat(gato, Matchers.notNullValue());
		Assert.assertThat(gato.getNombre(), Matchers.is(NOMBRE));
		Assert.assertThat(gato.getRaza(), Matchers.is(RAZA));
	}

	@Test
	public void testConstructDefault() {

		Gato gato = new Gato();
		gato.setNombre(NOMBRE);
		gato.setRaza(RAZA);

		Assert.assertThat(gato, Matchers.notNullValue());
		Assert.assertThat(gato.getNombre(), Matchers.is(NOMBRE));
		Assert.assertThat(gato.getRaza(), Matchers.is(RAZA));
	}

}
