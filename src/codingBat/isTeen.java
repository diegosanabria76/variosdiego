package codingBat;

public class isTeen {

	public static void main(String[] args) {
		System.out.println(in1019(10,2,13));
		System.out.println("Diego Sanabria");
		System.out.println(loneTeen(13,15));

	}
	
	public static boolean in1019(int a, int b, int c) {
		   return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)|| (c >= 13 && c <= 19));
		 
	}
	
	
	
	public static boolean loneTeen(int a, int b)
	{

		//variables with the inteval assigned
		  boolean aTeen = (a >= 13 && a <= 19);
		  boolean bTeen = (b >= 13 && b <= 19);
		  
		  return (aTeen && !bTeen) || (!aTeen && bTeen);
	
		   
		
		
	}


}
