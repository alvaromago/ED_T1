package es.studium.ejercicio13;

import es.studium.ejercicio1.Persona;

public class EmpleadoHerencia extends Persona
{
	public String lugar;
	
	public EmpleadoHerencia()
	{
		super();
		lugar = "";
	}

	public EmpleadoHerencia(String n, String a, String d, String c, int t, String lugar)
	{
		super(n, a, d, c, t);
		this.lugar = lugar;
	}

	public String getLugar()
	{
		return lugar;
	}

	public void setLugar(String lugar)
	{
		this.lugar = lugar;
	}
	
	
}
