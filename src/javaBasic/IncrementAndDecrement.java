package javaBasic;

public class IncrementAndDecrement {
	public static void main (String args[]) {
		int i = 2;
		//System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		int a = 4;   // 5
		int b = a++; // 4
		System.out.println(a);
		System.out.println(b);
		
		int c = 5; // 6
		int d = ++c; // 6
		System.out.println(c);
		System.out.println(d);
		
		int e = 10; //9
		int f = e--;//10
		System.out.println(e);
		System.out.println(f);
		
		int x = 2; //1
		int y = --x;//1
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}
