package es.studium.ejercicio8;

public class TestOrquesta
{

	public static void main(String[] args)
	{
		Instrumento instrumento1 = new Instrumento("saxofón", 'C');
		Musico musico1 = new Musico("Alberto", "Hombre");
		System.out.println("Hola me llamo " + musico1.getNombre() + " y toco el " + instrumento1.getNombre());
		
		Instrumento instrumento2 = new Instrumento("clarinete", 'B');
		Musico musico2 = new Musico("Elena", "Mujer");
		System.out.println("Hola me llamo " + musico2.getNombre() + " y toco el " + instrumento2.getNombre());
	}

}
