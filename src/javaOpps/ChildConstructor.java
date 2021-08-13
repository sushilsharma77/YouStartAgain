package javaOpps;

public class ChildConstructor extends Constructor {
	
	String occupation;
	
	ChildConstructor(String name, int age, String occupation){
		super.name=name;
		super.age=age;
		this.occupation=occupation;
		System.out.println("My name is "+name+" I am "+age+" years old"+
		" I am a "+occupation);
	}

	public static void main(String[] args) {
		ChildConstructor obj = new ChildConstructor("Dina",54,"Teacher");

	}

}
