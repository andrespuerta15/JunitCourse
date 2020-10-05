package co.com.codesa.junitcurso.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class UtilidadesSameTest {

	private UtilidadesSame utilidadesSame;

	@Before
	public void setUp() throws Exception {
		utilidadesSame = new UtilidadesSame();
	}

	@Test
	public void testObtenerPersonaSame() throws Exception {
		// given
		Persona personaEsperada = new Persona("Bruce", "Wayne");

		// when
		Persona personaObtenida = utilidadesSame.obtenerPersona(personaEsperada);

		// then
		assertSame("La asercion same ha fallado", personaEsperada, personaObtenida);
		assertEquals("La asersion equals ha fallado", personaEsperada, personaObtenida);
	}

	@Test
	public void testObtenerPersonaNotSameSuccess() throws Exception {
		// given
		Persona personaEsperada = new Persona("Arthur", "Fleck");

		// when
		Persona personaObtenida = utilidadesSame.obtenerPersona(personaEsperada);

		// then
		assertNotSame("La asercion not same ha fallado", personaEsperada, personaObtenida);
		assertNotEquals("La asersion not equals ha fallado", personaEsperada, personaObtenida);
	}

	@Test
	public void testObtenerPersonaNotSameFailed() throws Exception {
		// given
		Persona personaEsperada = new Persona("Selina", "Kyle");

		// when
		Persona personaObtenida = utilidadesSame.obtenerPersona(personaEsperada);

		// then
		assertNotSame("La asercion not same ha fallado", personaEsperada, personaObtenida);
		assertEquals("La asersion not equals ha fallado", personaEsperada, personaObtenida);
	}

}
