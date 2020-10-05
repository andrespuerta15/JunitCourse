package co.com.codesa.junitcurso.model;

public class UtilidadesPersonas {

	private Persona batman;
	private Persona guason;

	public UtilidadesPersonas() {
		super();
		batman = new Persona("Bruce", "Wayne");
		guason = new Persona("Arthur", "Fleck");
	}

	public Persona getBatman() {
		return batman;
	}

	public Persona getGuason() {
		return guason;
	}

	/** AssertArrayEquals **/
	public Persona[] getArrayPersonas() {
		Persona[] arrPersonas = { batman, guason };
		return arrPersonas;
	}

}
