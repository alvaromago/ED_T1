package es.studium.ejercicio11;

public class TestLiga
{

	public static void main(String[] args)
	{
		Equipo equipo1 = new Equipo("Real Betis Balompié", 1953, 60000);
		Futbolista futbolista1 = new Futbolista("Joaquín", "Sánchez", true, equipo1);
		System.out.println(futbolista1.getNombre() + " " + futbolista1.getApellido() + " juega en el " + futbolista1.getEquipo().getNombre());
		
		Equipo equipo2 = new Equipo("Sevilla F.C.", 1953, 60000);
		Futbolista futbolista2 = new Futbolista("Jesús", "Navas", true, equipo2);
		System.out.println(futbolista2.getNombre() + " " + futbolista2.getApellido() + " juega en el " + futbolista2.getEquipo().getNombre());
		
		Futbolista futbolista3 = new Futbolista("Diego", "Lainez", true, equipo1);
		System.out.println(futbolista3.getNombre() + " " + futbolista3.getApellido() + " juega en el " + futbolista3.getEquipo().getNombre());

		Futbolista futbolista4 = new Futbolista("Franco", "Vázquez", true, equipo2);
		System.out.println(futbolista4.getNombre() + " " + futbolista4.getApellido() + " juega en el " + futbolista4.getEquipo().getNombre());
	}

}
