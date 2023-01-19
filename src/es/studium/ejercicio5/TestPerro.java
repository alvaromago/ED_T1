package es.studium.ejercicio5;

public class TestPerro
{

	public static void main(String[] args)
	{
		Perro perro1 = new Perro("Carlino", 0.82, 5, "Marrón");
		
		System.out.println(perro1.getRaza() + ", " + perro1.getTamano() + "m, " + perro1.getEdad() + ", " + perro1.getColor());
		
		Perro perro2 = new Perro("Mastín", 0.23, 8, "Negro");
		
		System.out.println(perro2.getRaza() + ", " + perro2.getTamano() + "m, " + perro2.getEdad() + ", " + perro2.getColor());
		
		Perro perro3 = new Perro("Pastor Alemán", 0.90, 12, "Verde");
		
		System.out.println(perro3.getRaza() + ", " + perro3.getTamano() + "m, " + perro3.getEdad() + ", " + perro3.getColor());
	}

}
