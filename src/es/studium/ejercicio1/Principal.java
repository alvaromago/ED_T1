package es.studium.ejercicio1;

public class Principal
{

	public static void main(String[] args)
	{
		Persona persona2 = new Persona();
		persona2.setNombre("Álvaro");
		persona2.setApellidos("Martín González");
		persona2.setDni("34231232");
		persona2.setDireccion("Avda, El Mar, nº 12");
		persona2.setTelefono(678979253);
		
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + ", " + persona2.getDni() + ", " + persona2.getDireccion() + ", " + persona2.getTelefono());
		
		Persona persona1 = new Persona("Jorge", "Sánchez García", "34231232", "Avda, La Paz, nº 3", 954654756);
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + ", " + persona1.getDni() + ", " + persona1.getDireccion() + ", " + persona1.getTelefono());
	}

}
