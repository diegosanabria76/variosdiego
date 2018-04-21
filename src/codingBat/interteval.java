package codingBat;

public class interteval {

	public static void main(String[] args) {
	
System.out.println(in1020(10,2));
System.out.println("Diego Sanabria");
	}
	
	/*
	 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 * 
	 * funciona pero es la primera vez que veo q no es necesario escribir true or false!!
	 */
	public static boolean in1020(int a, int b) {
		   return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
		 
	}

}
