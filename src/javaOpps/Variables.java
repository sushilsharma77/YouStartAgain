package javaOpps;

public class Variables {

	String name = "Saksham"; // global variable
	int age = 2;
	static int id = 1107;//static variable

	public static void main(String[] args) {
		String word = "Good Mornig";
		System.out.println(word);
		System.out.println(id);
		System.out.println(Variables.id);
		additon(150, 275);
		
		Variables obj = new Variables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sayHello();
		
		}
	public void sayHello() {//non static method
		System.out.println("say hello");
	}
	public static void additon(int a, int b) {//static method
		int c = a+b;
		System.out.println(c);
	}

}
