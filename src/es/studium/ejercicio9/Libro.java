package es.studium.ejercicio9;

public class Libro
{
	private String titulo;
	private Autor autor;
	private int anoPublicacion;
	private String editorial;
	private int numeroPaginas;
	
	public Libro()
	{
		titulo = "";
		autor = new Autor();
		anoPublicacion = 0;
		editorial = "";
		numeroPaginas = 0;
	}

	public Libro(String titulo, Autor autor, int anoPublicacion, String editorial, int numeroPaginas)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.numeroPaginas = numeroPaginas;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public Autor getAutor()
	{
		return autor;
	}

	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}

	public int getAnoPublicacion()
	{
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion)
	{
		this.anoPublicacion = anoPublicacion;
	}

	public String getEditorial()
	{
		return editorial;
	}

	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}

	public int getNumeroPaginas()
	{
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas)
	{
		this.numeroPaginas = numeroPaginas;
	}
	
}
