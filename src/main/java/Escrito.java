package taller7;

public abstract class Escrito extends Pictograma{
	
	private String titulo;
	private String autor;
	private int paginas;
	
	public Escrito(String o, String t, String a, int p) {
		super(o);
		titulo = t;
		autor = a;
		paginas = p;
	}
	
	abstract int palabrasTotales();
	
	public void resumen() {	
	}
	
	public void setTitulo(String valor) {titulo = valor;}
	public void setAutor( String valor) {autor = valor;}
	public void setPaginas( int valor) {paginas = valor;}
	
	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public int getPaginas() {return paginas;}
}
