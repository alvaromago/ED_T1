package es.studium.ejercicio11;

public class Equipo
{
	private String nombre;
	private int anoFundacion;
	private int numeroSocios;
	
	public Equipo()
	{
		nombre = "";
		anoFundacion = 0;
		numeroSocios = 0;
	}
	
	public Equipo(String nombre, int anoFundacion, int numeroSocios)
	{
		this.nombre = nombre;
		this.anoFundacion = anoFundacion;
		this.numeroSocios = numeroSocios;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getAnoFundacion()
	{
		return anoFundacion;
	}
	public void setAnoFundacion(int anoFundacion)
	{
		this.anoFundacion = anoFundacion;
	}
	public int getNumeroSocios()
	{
		return numeroSocios;
	}
	public void setNumeroSocios(int numeroSocios)
	{
		this.numeroSocios = numeroSocios;
	}
	
}
