package co.com.codesa.junitcurso.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UtilidadesNull {

	private List<Persona> lstPersonas;

	public UtilidadesNull() {

		lstPersonas = new ArrayList<Persona>();
		lstPersonas.add(new Persona("Bruce", "Wayne"));
		lstPersonas.add(new Persona("Selina", "Kyle"));
		lstPersonas.add(new Persona("John", "Blake"));
	}

	public Persona obtenerPersonaPorNombre(String pNombrePersona) {

		List<Persona> lstResultadoPersona = lstPersonas.stream()
				.filter(p -> p.getNombre().equalsIgnoreCase(pNombrePersona)).collect(Collectors.toList());

		return lstResultadoPersona != null && !lstResultadoPersona.isEmpty() ? lstResultadoPersona.get(0) : null;
	}

}
