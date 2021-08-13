package javaOpps;

public class B extends A {

	public String evening() {
		String word = "Good evening";
		return word;
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.day();
		obj.morning();
		obj.night();
		System.out.println(obj.evening());

	}

}
