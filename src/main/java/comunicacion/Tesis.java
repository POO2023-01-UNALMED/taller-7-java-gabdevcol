package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String o, String t, String a, int p, String idea, String[] arg, String conclu, String ref, String inter) {
		super(o,t,a,p);
		this.idea = idea;
		argumentos = arg;
		conclusion = conclu;
		referencias = ref;
		interpretacion = inter;
		
	}

	public int palabrasTotales(int parametro) {
		// TODO Auto-generated method stub
		return super.getPaginas()*parametro*5;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		String argSeparados = "";
//		for (int i = 0; i< argumentos.length; i++) {
//			ar
//		}
		return super.getOrigen()+"\n"+ super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+getIdea()+"\n"+getArgumentos().length+"\n"+getConclusion()+"\n"+getReferencias()+"\n"+getInterpretacion();
	}
	
	public void setIdea(String valor) {idea = valor;}
	public void setArgumentos( String[] valor) {argumentos = valor;}
	public void setConclusion( String valor) {conclusion = valor;}
	public void setInterpretacion( String valor) {interpretacion = valor;}
	public void setReferencias(String valor) {referencias = valor;}
	
	public String getIdea() {return idea;}
	public String[] getArgumentos() {return argumentos;}
	public String getConclusion() {return conclusion;}
	public String getInterpretacion() {return interpretacion;}
	public String getReferencias() {return referencias;}

	@Override
	int palabrasTotales() {
		// TODO Auto-generated method stub
		return 0;
	}
}
