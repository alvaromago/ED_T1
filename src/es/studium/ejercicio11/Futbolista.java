package es.studium.ejercicio11;

public class Futbolista
{
	private String nombre;
	private String apellido;
	private Boolean comunitario;
	private Equipo equipo;
	
	public Futbolista()
	{
		nombre = "";
		apellido = "";
		comunitario = true;
		equipo = new Equipo();
	}

	public Futbolista(String nombre, String apellido, Boolean comunitario, Equipo equipo)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.comunitario = comunitario;
		this.equipo = equipo;
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

	public Boolean getComunitario()
	{
		return comunitario;
	}

	public void setComunitario(Boolean comunitario)
	{
		this.comunitario = comunitario;
	}

	public Equipo getEquipo()
	{
		return equipo;
	}

	public void setEquipo(Equipo equipo)
	{
		this.equipo = equipo;
	}
	
}
