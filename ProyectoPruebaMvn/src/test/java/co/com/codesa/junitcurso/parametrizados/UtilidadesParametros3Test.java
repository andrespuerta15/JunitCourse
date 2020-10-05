package co.com.codesa.junitcurso.parametrizados;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UtilidadesParametros3Test {
	
	@Parameters
	public static Object[] parametros() {
		
		return new Object[]{"Futbol","Tenis","Tenis de mesa"};		
	}
	
	@Parameter
	public String cadena;
	
	@Test
	public void testCadena(){
		
		System.out.println("Valor de cadena: " + cadena);
		Assert.assertThat(cadena, Matchers.startsWith("Ten"));

	}

}
