package codingBat;

public class backAround {

	public static void main(String[] args) {
	System.out.println(	backAround("cat"));
		

	}
	
	public static String backAround(String str) {
		
		char ultimo = (char) str.length();
		  char ultimocaracter = str.charAt(ultimo-1);
		  
		  String resultado = ultimocaracter+ str+ ultimocaracter;
		  
		  
		 return resultado;
		  
		  
		}

	

}
