package com.spring;

public class EntrenadorRugby implements Entrenador {

	protected String email, equipo;
	
	private ExperienciaServicio experienciaServicio;
	 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Inyección por properties email: " 
				+ email); 
		this.email = email;
	}
	public String getEquipo() { 
		return equipo;
	}
	public void setEquipo(String equipo) {
		System.out.println("Inyección por properties equipo: " 
				+ equipo); 
		this.equipo = equipo;
	}
	@Override
	public String getEntrenamiento() {
		// TODO Auto-generated method stub
		return "Realizar 30 pases de balón";
	}
	@Override
	public int getExperiencia() {
		// TODO Auto-generated method stub
		return experienciaServicio.getExperiencia();
	}

}
