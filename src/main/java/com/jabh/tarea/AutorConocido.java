package com.jabh.tarea;

import org.springframework.stereotype.Component;

@Component("autorconocido")
public class AutorConocido implements AutorInterfaz{
	
	private String nombre = "Antonio";
	private String apellido = "Fernandez";
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
