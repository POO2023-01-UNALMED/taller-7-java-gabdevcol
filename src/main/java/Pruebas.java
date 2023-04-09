package comunicacion;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
					"Alfabeto latino");
			Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, 
					"no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
			
			Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
			
			Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");
			
			Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
			
			
			System.out.println(alfabeto.cantidadLetras());
			System.out.println(alfabeto.getOrigen());
//			System.out.println(alfabeto.cantidadLetras());
//			System.out.println(alfabeto.cantidadLetras());
//			System.out.println(alfabeto.cantidadLetras());
//			
			
			if(fabula.getOrigen().equals("pensamiento") && fabula.getTitulo().equals("La tortuga y la liebre") && 
						fabula.getAutor().equals("Esopo") && fabula.getPaginas() == 2 && 
						fabula.getEnsenanza().equals("no se debe uno burlar de los demas, ni presumir o ser vanidoso")) {System.out.println("si");}
		
		
			if(libro.getOrigen().equals("Creacion") && libro.getTitulo().equals("El resplandor") && 
						libro.getAutor().equals("Stephen King") && libro.getPaginas() == 599 && 
						libro.getCo_autor().equals("N/A") && libro.getEditorial().equals("Doubleday") && libro.getEdicion().equals("Primera")) {System.out.println("si");}
		
		
				
			if(periodico.getOrigen().equals("Investigacion") && periodico.getTitulo().equals("Se encontro la solucion") && 
						periodico.getAutor().equals("Colombiano") && periodico.getPaginas() == 6 && 
						periodico.getFecha().equals("20/12/2020") && periodico.getPrimicia().equals("Cura del covid")) {System.out.println("si");}
							
			
				
			if(tesis.getOrigen().equals("Pensamiento expansivo") && tesis.getTitulo().equals("Recomendador") && 
						tesis.getAutor().equals("Alejandro") && tesis.getPaginas() == 20 && 
						tesis.getIdea().equals("Recomendar asignaturas") && tesis.getArgumentos().length == 2 && 
						tesis.getConclusion().equals("Se hace trabajo futuro") && tesis.getReferencias().equals("[1] Maquinaria")) {System.out.println("si");}
			

	}
}
