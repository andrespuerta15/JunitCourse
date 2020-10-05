package co.com.codesa.junitcurso.utilidades;

public class Utilidades {

	public String concatenar(String pPrimeraCadena, String pSegundaCadena) {

		if (pPrimeraCadena == "" || pSegundaCadena == "") {
			return "";
		}
		return pPrimeraCadena.concat(" ").concat(pSegundaCadena);
	}

	public String[] getArrayStrings(String... strings) {

		String[] arrStrings = new String[strings.length];

		for (int i = 0; i < arrStrings.length; i++) {
			arrStrings[i] = strings[i];
		}

		return arrStrings;
	}

	public boolean esMayorQueDiez(int pNumero) {
		return pNumero > 10;
	}
}
