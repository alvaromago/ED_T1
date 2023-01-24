package es.studium.ejercicio10;

public class Alumno
{
	private String nombre;
	private String apellido;
	private int edad;
	private Boolean haPagado;
	private Aula aula;
	
	public Alumno()
	{
		nombre = "";
		apellido = "";
		edad = 0;
		haPagado = true;
		aula = new Aula();
	}

	public Alumno(String nombre, String apellido, int edad, Boolean haPagado, Aula aula)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.haPagado = haPagado;
		this.aula = aula;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public Boolean getHaPagado()
	{
		return haPagado;
	}

	public void setHaPagado(Boolean haPagado)
	{
		this.haPagado = haPagado;
	}

	public Aula getAula()
	{
		return aula;
	}

	public void setAula(Aula aula)
	{
		this.aula = aula;
	}
	
}
