package co.com.codesa.junitcurso.model;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesSame {

	List<Persona> lstPersonas;

	public UtilidadesSame() {

		lstPersonas = new ArrayList<Persona>();
		lstPersonas.add(new Persona("Bruce", "Wayne"));
		lstPersonas.add(new Persona("John", "Blake"));
	}

	public Persona obtenerPersona(Persona pPersona) {
		if (lstPersonas.contains(pPersona)) {
			return pPersona;
		} else {
			return new Persona("Selina", "Kyle");
		}
	}

}
