package javaOpps;

public class AccessModifiers {
	public int age;
	protected String name;
	static int ssn;
	 private double salary;

	public static void main(String[] args) {
		
		AccessModifiers am = new AccessModifiers();
		am.age = 25;
		am.name = "Mike";
		am.salary = 25200.50;
		ssn = 2547;
		
		am.mth1(45);
		am.allAccessing();
		am.privateMethod();

	}

	public int mth1(int a) {

		System.out.println("my age is " + a);
		return a;
	}

	public void allAccessing() {
		System.out.println("my name is " + name +""+ " and my age is " + age);
	}

	public void privateMethod() {
		System.out.println("My salary is " + salary);
	}

}
