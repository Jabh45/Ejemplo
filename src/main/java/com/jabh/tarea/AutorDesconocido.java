package com.jabh.tarea;

import org.springframework.stereotype.Component;

@Component("autordesconocido")
public class AutorDesconocido implements AutorInterfaz{

	private String nombre = "Luis";
	private String apellido = "Perez";

	public AutorDesconocido(){
		
	}
	public AutorDesconocido(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

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
