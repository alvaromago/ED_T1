package es.studium.ejercicio7;

public class Coche
{
	private String fabricante;
	private String modelo;
	private int anoFabricacion;
	private boolean gasolina;
	
	public Coche(String f, String m, int a, boolean g)
	{
		fabricante = f;
		modelo = m;
		anoFabricacion = a;
		gasolina = g;
	}

	public String getFabricante()
	{
		return fabricante;
	}

	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public int getAnoFabricacion()
	{
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion)
	{
		this.anoFabricacion = anoFabricacion;
	}

	public boolean isGasolina()
	{
		return gasolina;
	}

	public void setGasolina(boolean gasolina)
	{
		this.gasolina = gasolina;
	}
	
}
