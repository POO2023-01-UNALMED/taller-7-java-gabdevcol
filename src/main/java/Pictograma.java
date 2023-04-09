/**
 * 
 */
package taller7;

/**
 * @author Gabriel
 *
 */
public abstract class Pictograma {
	
	private String origen;
	
	public Pictograma(String o) {
		origen = o;
	}
	
	public abstract String interpretacion();
	
	public abstract String toString();
	
	public void setOrigen(String o) {origen = o;}
	public String getOrigen() {return origen;}
	

}
