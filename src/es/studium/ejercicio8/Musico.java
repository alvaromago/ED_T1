package es.studium.ejercicio8;

public class Musico
{
	private String nombre;
	private String sexo;
	
	public Musico(String n, String s)
	{
		nombre = n;
		sexo = s;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getSexo()
	{
		return sexo;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
}
