package es.studium.ejercicio6;

public class Pelicula
{
	private String titulo;
	private int ano;
	private double duracion;
	
	public Pelicula(String t, int a, double d)
	{
		titulo = t;
		ano = a;
		duracion = d;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public double getDuracion()
	{
		return duracion;
	}

	public void setDuracion(double duracion)
	{
		this.duracion = duracion;
	}

	public int getAno()
	{
		return ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}
		
}
