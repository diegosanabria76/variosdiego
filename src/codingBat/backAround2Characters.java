package codingBat;

public class backAround2Characters {

	
		
		public static void main(String[] args) {
			
			System.out.println(	backAround("diego"));
				

			}
			
		public static String backAround(String str){
		 int tomar  = 2;
		 if(tomar>str.length())
		 {
		   tomar = str.length();
		 }
		 String frente = str.substring(0,tomar);
		 
		 return frente + str + frente;
		 
		}

}
