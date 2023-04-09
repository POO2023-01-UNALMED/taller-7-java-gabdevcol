package comunicacion;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;	
	
	public Periodico(String o, String t, String a, int p, String f, String pr, String i) {
		super(o,t,a,p);
		fecha = f;
		primicia = pr;
		interpretacion = i;
	}
	@Override
	public int palabrasTotales(int p) {
		// TODO Auto-generated method stub
		return super.getPaginas()*10*p;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getOrigen()+"\n"+ super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+getFecha()+"\n"+getPrimicia();
	}
	
	public void setFecha( String valor) {fecha = valor;}
	public void setPrimicia( String valor) {primicia = valor;}
	public void setInterpretacion( String valor) {interpretacion = valor;}
	
	
	public String getFecha() {return fecha;}
	public String getPrimicia() {return primicia;}
	public String getInterpretacion() {return interpretacion;}


}
