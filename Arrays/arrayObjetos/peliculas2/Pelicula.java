package peliculas2;

public class Pelicula {
	private int codigo;
	private String titulo;
	private String productora;
	private int a�oEstreno;
	private int numEspectadores;
	
	public Pelicula() {
		super();
	}
	
	
	
	public Pelicula(int codigo, String titulo, String productora, int a�oEstreno, int numEspectadores) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.productora = productora;
		this.a�oEstreno = a�oEstreno;
		this.numEspectadores = numEspectadores;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public int geta�oEstreno() {
		return a�oEstreno;
	}

	public void seta�oEstreno(int a�oEstreno) {
		this.a�oEstreno = a�oEstreno;
	}

	public int getNumEspectadores() {
		return numEspectadores;
	}

	public void setNumEspectadores(int numEspectadores) {
		this.numEspectadores = numEspectadores;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo +
			"\n Titulo: " + titulo + 
			"\n Productora: " + productora + 
			"\n Espectadores: " + numEspectadores +
			"\n Estrellas: ";
	}
	
}
