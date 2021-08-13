package javaBasic;

public class TwoDArray {

	public static void main(String[] args) {
		
		String i[][] = new String [3][4];
		
		i[0][0] = "A";
		i[0][1] = "B";
		i[0][2] = "C";
		i[0][3]  = "D";		
		
		i[1][0] = "A1";
		i[1][1] = "B1";
		i[1][2] = "C1";
		i[1][3]  = "D1";	
		
		i[2][0] = "A2";
		i[2][1] = "B2";
		i[2][2] = "C2";
		i[2][3]  = "D2";	
		
		System.out.println(i[2][0]);
		System.out.println(i.length); //row
		System.out.println(i[0].length); //column
		
		//all values of 2D array
		for(int row=0; row<i.length; row++) {
			for(int col=0; col<i[0].length; col++) {
				System.out.println(i[row][col]);
			} 
		}

	}

}
