package javaOpps;

public class WrapperClass {

	public static void main(String[] args) {
		
		 String s = "100";
		 int i = Integer.parseInt(s);
		 System.out.println(i);
		 
		 String str = Integer.toString(i);
		System.out.println(str);
		
		String a = "10";
		Double d = Double.parseDouble(a);
		System.out.println(d);
		
		int in = 100;
		String ss = String.valueOf(in);
		System.out.println(ss);
		
		String w = "150L";
		int h = Integer.parseInt(w);//NumberFormatException
		System.out.println(h);
	}

}
