package es.studium.ejercicio7;

public class TestCarrera
{

	public static void main(String[] args)
	{
		Coche coche1 = new Coche("Aston Martin", "Vantage F1 Edition", 2021, true);
		Piloto piloto1 = new Piloto("Fernando Alonso", "España");
		System.out.println(piloto1.getNombre() + ", " + coche1.getFabricante());
		
		Coche coche2 = new Coche("Ferrari", "F40", 1987, true);
		Piloto piloto2 = new Piloto("Michael Schumacher", "Alemania");
		System.out.println(piloto2.getNombre() + ", " + coche2.getFabricante());
	}

}
