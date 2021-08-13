package javaOpps;

public class C extends B {
	public void methodIntro() {
		System.out.println("I am a grand child class");
	}

	public static void main(String[] args) {
		C ob = new C();
		ob.morning();
		ob.day();
		ob.evening();
		ob.night();
		ob.methodIntro();

	}

}
