package es.studium.ejercicio3;

public class Principal
{

	public static void main(String[] args)
	{
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Álvaro");
		empleado1.setApellidos("Martín González");
		empleado1.setDni("39552364");
		empleado1.setDomicilio("Avda, La Mar, nº 4");
		empleado1.setPuesto("Programador");
		empleado1.setTelefono(679457312);
		
		System.out.println(empleado1.getNombre() + " " + empleado1.getApellidos() +  ", " + empleado1.getDni() + ", " + empleado1.getDomicilio() + ", " + empleado1.getPuesto() + ", " + empleado1.getTelefono());
		
		Empleado empleado2 = new Empleado("Jorge", "Sánchez García", "34231232", "Avda, La Paz, nº 3", "Médico", 954654756);
		
		System.out.println(empleado2.getNombre() + " " + empleado2.getApellidos() +  ", " + empleado2.getDni() + ", " + empleado2.getDomicilio() + ", " + empleado2.getPuesto() + ", " + empleado2.getTelefono());
	}
}
