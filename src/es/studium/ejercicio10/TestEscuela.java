package es.studium.ejercicio10;

public class TestEscuela
{

	public static void main(String[] args)
	{
		Aula aula1 = new Aula("DAW", 40);
		Alumno alumno1 = new Alumno("Ana", "Abad", 21, true, aula1);
		System.out.println(alumno1.getNombre() + " " + alumno1.getApellido() + " estudia en " + alumno1.getAula().getNombre());
		
		Alumno alumno2 = new Alumno("Benito", "Bueno", 32, true, aula1);
		System.out.println(alumno2.getNombre() + " " + alumno2.getApellido() + " estudia en " + alumno2.getAula().getNombre());
		
		Aula aula2 = new Aula("DAM", 24);
		Alumno alumno3 = new Alumno("Carmen", "Cid", 27, true, aula2);
		System.out.println(alumno3.getNombre() + " " + alumno3.getApellido() + " estudia en " + alumno3.getAula().getNombre());
	}

}
