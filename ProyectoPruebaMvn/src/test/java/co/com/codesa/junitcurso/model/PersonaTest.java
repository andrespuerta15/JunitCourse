package co.com.codesa.junitcurso.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.com.codesa.junitcurso.model.Persona;

public class PersonaTest {
	
	private Persona persona;

	@Before
	public void setUp() throws Exception {		
		persona = new Persona("Bruce", "Wayne");
	}

	@Test
	public void testGetNombre() throws Exception {
		//given
		//when
		//then
		Assert.assertTrue(persona.getNombre().equals("Bruce"));
	}

}
