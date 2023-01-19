package es.studium.ejercicio8;

public class Instrumento
{
	private String nombre;
	private char afinacion;
	
	public Instrumento(String n, char a)
	{
		nombre = n;
		afinacion = a;	
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public char getAfinacion()
	{
		return afinacion;
	}

	public void setAfinacion(char afinacion)
	{
		this.afinacion = afinacion;
	}
	
}
