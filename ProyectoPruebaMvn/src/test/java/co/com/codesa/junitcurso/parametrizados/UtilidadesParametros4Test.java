package co.com.codesa.junitcurso.parametrizados;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class UtilidadesParametros4Test {

	private static UtilidadesParametros4 utilidadesParametros4;

	@BeforeClass
	public static void setUpClass() {
		utilidadesParametros4 = new UtilidadesParametros4();
	}

	@Test
	@Parameters({ "1,4", "2,5", "3,6" })
	public void testSumarNumeros(int pPrimerNumero, int pSegundoNumero) {

		System.out.println("Sumar numeros: primerNumero=> " + pPrimerNumero + " segundoNumero=> " + pSegundoNumero);
		int resultadoObtenido = utilidadesParametros4.sumarNumeros(pPrimerNumero, pSegundoNumero);
		System.out.println("Resultado de sumar numeros primerNumero=> " + pPrimerNumero + " segundoNumero=> "
				+ pSegundoNumero + " resultado=> " + resultadoObtenido);

		Assert.assertThat(resultadoObtenido, Matchers.equalTo(pPrimerNumero + pSegundoNumero));
	}

}
