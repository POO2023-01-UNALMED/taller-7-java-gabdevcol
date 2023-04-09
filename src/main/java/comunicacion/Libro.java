

public class Libro extends Escrito{
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String o, String t, String a, int p, String c, String edit, String edic, String i ) {
		super(o,t,a,p);
		co_autor = c;
		editorial = edit;
		edicion = edic;
		interpretacion = i;
	}

	public int palabrasTotales(int parametro) {
		// TODO Auto-generated method stub
		return super.getPaginas()*parametro*2;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		String origen = super.getOrigen();

		return super.getOrigen()+"\n"+ super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+ getCo_autor()+"\n"+getEditorial()+"\n"+getEdicion()+"\n"+getInterpretacion();
	}
	
	public void setCo_autor(String valor) {co_autor = valor;}
	public void setEditorial( String valor) {editorial = valor;}
	public void setEdicion( String valor) {edicion = valor;}
	public void setInterpretacion( String valor) {interpretacion = valor;}
	
	
	public String getCo_autor() {return co_autor;}
	public String getEditorial() {return editorial;}
	public String getEdicion() {return edicion;}
	public String getInterpretacion() {return interpretacion;}

	@Override
	int palabrasTotales() {
		// TODO Auto-generated method stub
		return 0;
	}
}
