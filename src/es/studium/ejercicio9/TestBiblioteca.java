package es.studium.ejercicio9;

public class TestBiblioteca
{

	public static void main(String[] args)
	{
		Autor autor1 = new Autor("Álvaro", "Martín González", "España");
		Libro libro1 = new Libro("Titulo 1", autor1, 2012, "Inditex", 215);
		
		System.out.println(libro1.getTitulo() + ", " + libro1.getAutor().getNombre() + " " + libro1.getAutor().getApellidos() + ", " + libro1.getAutor().getNacionalidad());
		
		Libro libro2 = new Libro();
		libro2.setTitulo("Titulo del libro2");
		libro2.setAutor(autor1);
		libro2.setEditorial("Editorial del libro 2");
		libro2.setAnoPublicacion(2000);
		libro2.setNumeroPaginas(320);
		
		System.out.println(libro2.getTitulo() + ", " + libro2.getAutor().getNombre() + " " + libro2.getAutor().getApellidos() + ", " + libro2.getAutor().getNacionalidad() + ", " + libro2.getAnoPublicacion() + ", " + libro2.getNumeroPaginas());
	}

}
