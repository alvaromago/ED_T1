package es.studium.ejercicio7;

public class Piloto
{
	private String nombre;
	private String nacionalidad;
	
	public Piloto(String n, String p)
	{
		nombre = n;
		nacionalidad = p;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}
	
}
