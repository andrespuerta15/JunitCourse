package co.com.codesa.junitcurso.utilidades;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilidadesTest {

	private String primeraCadena;
	private String segundaCadena;
	private String resultadoObtenido;
	private String resultadoEsperado;
	private Utilidades utilidades;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Se inicia el proceso de pruebas para la clase Utilidades");
	}

	@Before
	public void setUp() {
		primeraCadena = "Hello";
		segundaCadena = "World";
		resultadoEsperado = "Hello World";
		utilidades = new Utilidades();

		System.out.println("\n\nInicialización de variables:");
		System.out.println("Primera cadena: " + primeraCadena);
		System.out.println("Segunda cadena:" + segundaCadena);
		System.out.println("Resultado esperado:" + resultadoEsperado);
	}

	@After
	public void tearDown() {
		System.out.println("Resultado obtenido:" + resultadoObtenido);
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("Se termina el proceso de pruebas para la clase Utilidades");
	}

	@Test
	public void testConcatenar() {

		System.out.println("Inicia test concatenar exitoso");

		// Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();

		// Ejecutar el metodoa probar
		resultadoObtenido = utilidades.concatenar(primeraCadena, segundaCadena);

		// Validaciones
		Assert.assertEquals("Las cadenas son diferentes", resultadoEsperado, resultadoObtenido);

		System.out.println("Termina test concatenar exitoso");

	}

	@Test
	public void testConcatenarFallo() {

		System.out.println("Inicia test concatenar con fallo");

		// Fsllo, es cuando el método se ejecuta sin rpoblemas, pero el
		// resultado esperado no es igual al resultado obtenido
		resultadoEsperado = null;

		// Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();

		// Ejecutar el metodoa probar
		resultadoObtenido = utilidades.concatenar(primeraCadena, segundaCadena);

		// Validaciones
		Assert.assertEquals("Las cadenas son diferentes", "", resultadoObtenido);

		System.out.println("Termina test concatenar con fallo");

	}

	@Test
	public void testConcatenarError() {

		System.out.println("Inicia test concatenar con error");

		// Error, es cuando el método a probar, genera una excepcion no
		// controlada
		resultadoEsperado = "";

		// Instanciar la clase a probar
		Utilidades utilidades = new Utilidades();

		// Ejecutar el metodoa probar
		resultadoObtenido = utilidades.concatenar(null, segundaCadena);

		// Validaciones
		Assert.assertEquals("Las cadenas son diferentes", null, resultadoObtenido);

		System.out.println("Termina test concatenar con error");

	}

	@Test
	public void testGetArrayStrings() throws Exception {

		System.out.println("Inicia test arrays strings");

		// given
		String[] arrStringEsperado = { "batman", "robbin", "batichica" };

		// when
		String[] arrStringObtenido = utilidades.getArrayStrings("batman", "robbin", "batichica");

		// then
		assertArrayEquals(arrStringEsperado, arrStringObtenido);
		assertEquals(arrStringEsperado.length, arrStringObtenido.length);

		// Los elementos del arreglo sean iguales uno a uno
		assertEquals(arrStringEsperado[0], arrStringObtenido[0]);
		assertEquals(arrStringEsperado[1], arrStringObtenido[1]);
		assertEquals(arrStringEsperado[2], arrStringObtenido[2]);

		assertNotEquals(arrStringEsperado[0], arrStringObtenido[1]);
		assertNotEquals(arrStringEsperado[0], arrStringObtenido[2]);

		System.out.println("Termina test arrays strings");

	}

	@Test
	public void testEsMayorQueDiez() throws Exception {
		
		System.out.println("Inicia test es mayor que diez");

		// given
		boolean resultadoObtenidoVerdadero = utilidades.esMayorQueDiez(11);
		boolean resultadoObtenidoFalso = utilidades.esMayorQueDiez(5);

		// when
		//Successfully
		assertTrue("La asercion ha fallado para true: ", resultadoObtenidoVerdadero);
		assertFalse("La asercion ha fallado para false: ", resultadoObtenidoFalso);
		//Failed
		//assertTrue("La asercion ha fallado para true: ", resultadoObtenidoFalso);
		//assertFalse("La asercion ha fallado para false: ", resultadoObtenidoVerdadero);

		// then

		
		System.out.println("Termina test es mayor que diez");
	}

}
