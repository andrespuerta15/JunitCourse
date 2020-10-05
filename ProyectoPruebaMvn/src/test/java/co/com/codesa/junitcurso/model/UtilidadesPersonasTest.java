package co.com.codesa.junitcurso.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilidadesPersonasTest {

	private UtilidadesPersonas utilidadesPersonas;

	@Before
	public void setUp() throws Exception {
		utilidadesPersonas = new UtilidadesPersonas();
	}

	@Test
	public void testGetBatman() throws Exception {
		// given

		// when
		Persona batman = utilidadesPersonas.getBatman();

		// then
		assertEquals("Bruce", batman.getNombre());
		assertEquals("Bruce", utilidadesPersonas.getBatman().getNombre());
		assertEquals("Wayne", batman.getApellido());

	}

	@Test
	public void testGetGuason() throws Exception {
		// given

		// when
		Persona guason = utilidadesPersonas.getGuason();

		// then
		assertEquals("Arthur", guason.getNombre());
		assertEquals("Fleck", guason.getApellido());
	}

	@Test
	public void testPersonasDiferentes() throws Exception {
		// given

		// when
		Persona batman = utilidadesPersonas.getBatman();
		Persona guason = utilidadesPersonas.getGuason();

		// then
		assertNotEquals(batman, guason);
	}

}
