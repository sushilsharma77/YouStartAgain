package javaOpps;

public class MethodOverriding {

	public void sayHello() {
		System.out.println("Hello everyone");
	}

	public String sayHello(String word) {
		System.out.println(word);
		return word;
	}

	public int sayHello(int a, int b) {
		int addition = a + b;
		System.out.println(addition);
		return addition;

	}

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.sayHello();
		obj.sayHello("Hi guys");
		obj.sayHello(250,175);
		
		

	}

}
