package co.com.codesa.junitcurso.parametrizados;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import co.com.codesa.junitcurso.parametrizados.UtilidadesParametros2;

@RunWith(Parameterized.class)
public class UtilidadesParametros2Test {

	@Parameters
	public static Collection<Object[]> parametros() {

		return Arrays.asList(new Object[][] { { "roland", "garros", "open" }, { "estados", "unidos", "open" },
				{ "wimbledon", "tennis", "open" }, { "australian", "tennis", "open" } });

	}

	@Parameter(0)
	public String primeraCadena;
	@Parameter(1)
	public String segundaCadena;
	@Parameter(2)
	public String terceraCadena;

	private UtilidadesParametros2 utilidadesParametros2 = new UtilidadesParametros2();

	@Test
	public void testConcatenarCadenas() {

		System.out.println("Concatenar las siguientes cadenas: primeraCadena=> " + primeraCadena + " segundaCadena=> "
				+ segundaCadena + " terceraCadena=> " + terceraCadena);
		String resultadoObtenido = utilidadesParametros2.concatenar(primeraCadena, segundaCadena, terceraCadena);
		System.out.println("Resultado de concatenar las cadenas: primeraCadena=> " + primeraCadena + " segundaCadena=> "
				+ segundaCadena + " terceraCadena=> " + terceraCadena + " resultado=> " + resultadoObtenido);

		Assert.assertThat(resultadoObtenido, Matchers.containsString(segundaCadena));
	}

}
