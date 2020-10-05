package co.com.codesa.junitcurso.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class UtilidadesNullTest {

	private UtilidadesNull utilidadesNull;

	@Before
	public void setUp() throws Exception {
		utilidadesNull = new UtilidadesNull();
	}

	@Test
	public void testObtenerPersonaPorNombre() throws Exception {

		// given

		// when
		Persona batman = utilidadesNull.obtenerPersonaPorNombre("Bruce");
		Persona catwoman = utilidadesNull.obtenerPersonaPorNombre("Rebeca");

		// then
		assertNull("La asercion nula ha fallado", catwoman);
		assertNotNull("La asercion no nula ha fallado", batman);
		
		//failed
		//assertNull("La asercion nula ha fallado", batman);
		assertNotNull("La asercion no nula ha fallado", catwoman);		
		
		
	}

}
