package comunicacion;

public class Alfabeto extends Pictograma{
	
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto( String o, String[] l, String i) {
		super(o);
		letras = l;
		interpretacion = i;	
	}
	
	public int cantidadLetras(int p) {
		return letras.length;
	}

	
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}
	
	
	public String toString() {
		String letrasSeparadas = "";
		
		for(int i = 0; i < letras.length; i++) {
			letrasSeparadas += letras[i];
			
			if(i != letras.length - 1) {
				letrasSeparadas += ", ";
			}
		}
		return letrasSeparadas;
	}
	
	public void setLetras(String[] l) {letras = l;}
	public void setInterpretacion( String i) {interpretacion = i;}
	
	public String[] getLetras() {return letras;}
	public String getInterpretacion() {return interpretacion;}
}

	