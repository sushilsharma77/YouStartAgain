package javaOpps;

public class NonStaticMethods {

	public void method1() {
		System.out.println("This is method 1");
	}

	public String method2() {
		System.out.println("This is method 2");
		String str = "Hello";
		String s = " World";
		String con = str.concat(s);
		return con;
	}

	public int method3(int a, int b) {
		System.out.println("This is method 3");
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		
	NonStaticMethods nsm = new NonStaticMethods();
	
		 nsm.method1();
		 
		 String s = nsm.method2();
		 System.out.println(s);
		 
		int addition = nsm.method3(10, 50);
		System.out.println(addition);

	}

}
