package co.com.codesa.junitcurso.parametrizados;

public class UtilidadesParametros3 {

	public String concatenar(String pPrimeraCadena, String pSegundaCadena, String pTerceraCadena) {

		if (pPrimeraCadena == "" || pSegundaCadena == "" || pTerceraCadena == "") {
			return "";
		}
		return pPrimeraCadena.concat(" ").concat(pSegundaCadena).concat(" ").concat(pTerceraCadena);
	}

	public int sumarNumeros(int pPrimerNumero, int pSegundoNumero) {
		return pPrimerNumero + pSegundoNumero;
	}

}
