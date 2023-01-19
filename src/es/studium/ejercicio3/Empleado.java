package es.studium.ejercicio3;

public class Empleado
{
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private String puesto;
	private int telefono;
	
		//Constructor por defecto
		public Empleado() {
			nombre = "";
			apellidos = "";
			dni = "";
			domicilio = "";
			puesto = "";
			telefono = 0;
		}
	
		//Constructor con parámetros
		public Empleado(String n, String a, String d, String c, String p, int t) {
				nombre = n;
				apellidos = a;
				dni = d;
				domicilio = c;
				puesto = p;
				telefono = t;
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
				
			public String getDomicilio() {
				return domicilio;
			}
				
			public void setDomicilio(String c) {
				domicilio = c;
			}
					
			public String getPuesto() {
				return puesto;
			}
				
			public void setPuesto(String p) {
				puesto = p;
			}
				
			public int getTelefono() {
				return telefono;
			}
				
			public void setTelefono(int t) {
				telefono = t;
			}
}
