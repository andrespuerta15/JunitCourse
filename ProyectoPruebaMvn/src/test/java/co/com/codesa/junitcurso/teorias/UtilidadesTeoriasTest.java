package co.com.codesa.junitcurso.teorias;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class UtilidadesTeoriasTest {

	private UtilidadesTeorias utilidadesTeorias = new UtilidadesTeorias();

	/**
	 * Usando variables especificas
	 */
	/*
	 * @DataPoint public static String primeraCadena = "Perro";
	 * 
	 * @DataPoint public static String segundaCadena = "Gato";
	 * 
	 * @Theory public void testConcatenarTeoria(String pPrimeraCadena, String
	 * pSegundaCadena) { System.out.println("Concatenar cadenas con Datapoint: "
	 * + pPrimeraCadena + " segundaCadena=> " + pSegundaCadena); }
	 */

	/**
	 * USando un arreglo de datos
	 */
	@DataPoints
	public static String[] listaCadenas = { "Ajedrez", "Voley", "Tenis" };

	@Theory
	public void testConcatenarTeoriaMultiples(String pPrimerDeporte, String pSegundDeporte, String pTercerDeoprte) {

		System.out.println("Concatenar cadenas con Datapoints: primerDeporte=> " + pPrimerDeporte + " segundoDeporte=> "
				+ pSegundDeporte + " tercerDeporte=> " + pTercerDeoprte);

		String resultadoObtenido = utilidadesTeorias.concatenar(pPrimerDeporte, pSegundDeporte, pTercerDeoprte);

		Assert.assertThat(resultadoObtenido, Matchers.containsString("e"));

	}

}
