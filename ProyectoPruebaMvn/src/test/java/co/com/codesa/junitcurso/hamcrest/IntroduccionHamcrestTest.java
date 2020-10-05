package co.com.codesa.junitcurso.hamcrest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntroduccionHamcrestTest {

	public IntroduccionHamcrestTest() {
	}

	@Before
	public void setUp() {

	}

	@Test
	public void ejemplosInicialesHamcrest() {
		String cadena = "Hola Mundo";

		// comparativa
		Assert.assertEquals("Hola Mundo", cadena);
		Assert.assertThat(cadena, is(equalTo("Hola Mundo")));

		// Equals - Not Equals
		Assert.assertThat(cadena, equalTo("Hola Mundo"));
		Assert.assertThat(cadena, is(equalTo("Hola Mundo")));
		Assert.assertThat(cadena, not(equalTo("Adios Mundo")));
		Assert.assertThat(cadena, is(not(equalTo("Adios Mundo"))));

		// Null
		Assert.assertThat(cadena, notNullValue());
		Assert.assertThat(cadena, is(notNullValue()));
		Assert.assertThat(cadena, is(not(nullValue())));
	}
	
	@Test
	public void ejemplosInicialesHamcrestMatchers(){
		String cadena = "Hola Mundo";
		
		// comparativa
		Assert.assertEquals("Hola Mundo", cadena);
		Assert.assertThat(cadena, Matchers.is("Hola Mundo"));
	}

}
