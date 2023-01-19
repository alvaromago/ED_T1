package es.studium.ejercicio5;

public class Perro
{
	private String raza;
	private double tamano;
	private int edad;
	private String color;
	
	public Perro(String r, double t, int e, String c)
	{
		raza = r;
		tamano = t;
		edad = e;
		color = c;
	}

	public String getRaza()
	{
		return raza;
	}

	public void setRaza(String raza)
	{
		this.raza = raza;
	}

	public double getTamano()
	{
		return tamano;
	}

	public void setTamano(double tamano)
	{
		this.tamano = tamano;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
}
	
