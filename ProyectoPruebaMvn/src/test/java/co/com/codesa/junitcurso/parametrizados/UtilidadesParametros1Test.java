package co.com.codesa.junitcurso.parametrizados;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import co.com.codesa.junitcurso.parametrizados.UtilidadesParametros1;

@RunWith(Parameterized.class)
public class UtilidadesParametros1Test {

	@Parameters
	public static Collection<Object[]> parametros() {

		return Arrays.asList(new Object[][] { { 2, 4 }, { 3, 5 }, { 4, 6 }, { 5, 7 }, { 6, 8 } });

	}

	private int primerNumero;
	private int segundoNumero;
	private UtilidadesParametros1 utilidadesParametros1 = new UtilidadesParametros1();

	public UtilidadesParametros1Test(int pPrimerNumero, int pSegundoNumero) {
		this.primerNumero = pPrimerNumero;
		this.segundoNumero = pSegundoNumero;
	}

	@Test
	public void testSumarNumerosNumeros() {

		System.out.println("Numeros a sumar, primerNumero: " + primerNumero + " segundoNumero: " + segundoNumero);
		int resultado = utilidadesParametros1.sumarNumeros(primerNumero, segundoNumero);
		System.out.println("Resultado de sumar, primerNumero: " + primerNumero + " segundoNumero: " + segundoNumero
				+ " fue: " + resultado);
		
		Assert.assertEquals((primerNumero + segundoNumero), resultado);
	}

}
