package com.spring;

//no se establece la anotación @Component
public class EntrenadorBaloncesto implements Entrenador {

	//Atributos
	private String email,equipo;
	private ExperienciaServicio experienciaServicio;
	
	
	//Constructor
	// el constructor espera recibir los valores de email y equipo 
	// cargados desde el archivo properties
	public EntrenadorBaloncesto(String email, String equipo) { 
		this.email = email;
		this.equipo = equipo;
	}
	
	
	public EntrenadorBaloncesto(ExperienciaServicio experienciaServicio) { 
		this.experienciaServicio = experienciaServicio;
	}
	
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	@Override
	public String getEmail() { 
		return email;
	}
	@Override
	public String getEquipo() { 
		return equipo;
	}
}
