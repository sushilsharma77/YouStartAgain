package javaBasic;

public class StringManupulation {
	public static void main (String [] args) {
		
		String str = "Hello";
		String str1 = new String (" Good morning");
		String s = "hello";
		
		String strAdd = str +""+ str1;
		System.out.println(strAdd);
		
		String con = str.concat(str1);
		System.out.println(con);
		
		System.out.println(str.isEmpty());
		System.out.println(str.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		int size = str1.length();
		System.out.println(size);
		
		String newString = str1.trim();
		System.out.println(newString);
		
		boolean isEqual = str.equals(s);
		System.out.println(isEqual);
		
		boolean equal = str.equalsIgnoreCase(s);
		System.out.println(equal);
	}


}
