package es.studium.ejercicio1;

public class Persona
{
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private int telefono;
		
		//Constructor con parámetros
		public Persona (String n, String a, String d, String c, int t) {
			nombre = n;
				apellidos =  a;
				dni = d;
				direccion = c;
				telefono = t;
		}
				
		//Constructor por defecto
		public Persona () {
			nombre = "";
			apellidos = "";
			dni = "";
			direccion = "";
			telefono =  0;
		}
		
		
		//Métodos
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String n) {
			nombre = n;
		}
		
		public String getApellidos() {
			return apellidos;
		}
		
		public void setApellidos(String a) {
			apellidos = a;
		}
		
		public String getDni() {
			return dni;
		}
		
		public void setDni(String d) {
			dni = d;
		}
		
		public String getDireccion() {
			return direccion;
		}
		
		public void setDireccion(String d) {
			direccion = d;
		}
			
		public int getTelefono() {
			return telefono;
		}
		
		public void setTelefono(int t) {
			telefono = t;
		}
	
}
