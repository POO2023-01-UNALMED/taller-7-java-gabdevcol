package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	
	public Fabula(String o, String t, String a, int p, String e, String i) {
		super(o,t,a,p);
		interpretacion = i;
		ensenanza = e;
	}
	
	public int palabrasTotales(int p) {
		// TODO Auto-generated method stub
		return super.getPaginas()*1*p;
	}

	
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.getOrigen()+"\n"+ super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+getEnsenanza();
	}
	
	public void setEnsenanza( String valor) {ensenanza = valor;}
	public void setInterpretacion( String valor) {interpretacion = valor;}
	
	public String getEnsenanza() {return ensenanza;}
	public String getInterpretacion() {return interpretacion;}

	

}
