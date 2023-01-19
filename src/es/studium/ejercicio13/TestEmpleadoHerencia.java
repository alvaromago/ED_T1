package es.studium.ejercicio13;

public class TestEmpleadoHerencia
{

	public static void main(String[] args)
	{
		EmpleadoHerencia persona1 = new EmpleadoHerencia("Alvaro", "Martin", "24242423L", "Avd, El Mar", 534553345, "Ingeniero Informatico");
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + ", " + persona1.getDni() + ", " + persona1.getDireccion() + ", " + persona1.getTelefono() + ", " + persona1.getLugar());
		EmpleadoHerencia persona2 = new EmpleadoHerencia("Jorge", "Perez", "534534543S", "C/Pelco", 434534534, "Médico");
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + ", " + persona2.getDni() + ", " + persona2.getDireccion() + ", " + persona2.getTelefono() + ", " + persona2.getLugar());
	}

}
