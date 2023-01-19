package es.studium.ejercicio6;

public class TestPelicula
{

	public static void main(String[] args)
	{
		Pelicula pelicula1 = new Pelicula("Batman", 2013, 1.45);
		System.out.println(pelicula1.getAno());
		
		Pelicula pelicula2 = new Pelicula("Superman", 2017, 1.30);
		System.out.println(pelicula2.getAno());
		
		Pelicula pelicula3 = new Pelicula("Iron Man", 2015, 2.08);
		System.out.println(pelicula3.getAno());
		
		Pelicula pelicula4 = new Pelicula("Star Wars 1", 1993, 1.54);
		System.out.println(pelicula4.getAno());
		
		Pelicula pelicula5 = new Pelicula("El lobo de Wall Street", 2014, 2.14);
		System.out.println(pelicula5.getAno());
	}

}
