package javaOpps;

public class EncapsulationDemo {

	private int age;
	private String name;
	private int ssn;

	public static void main(String[] args) {

		EncapsulationDemo ecd = new EncapsulationDemo();

		ecd.setAge(25);
		ecd.setName("Ramesh Pandy");
		ecd.setSsn(4554546);
		
		ecd.getAge();
		ecd.getName();
		ecd.getSsn();

	}

	public int getAge() {
		System.out.println("He is " + age + " years old");
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		System.out.println("his name is " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		System.out.println("His social security number is " + ssn);
		return ssn;
	}

	public void setSsn(int sss) {
		this.ssn = sss;
	}

}
