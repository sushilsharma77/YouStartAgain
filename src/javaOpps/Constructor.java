package javaOpps;

public class Constructor {
	String name;
	int age;

	public Constructor() {
		System.out.println("Default constructor");
	}

	public Constructor(String name) {
		this.name=name;
		System.out.println("One paramitarized constructor");
		System.out.println("My name is "+ name);
	}

	public Constructor(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("Two paramiterized constructor");
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor("Mike");
		Constructor obj2 = new Constructor("Tina",26);
		

	}

}
