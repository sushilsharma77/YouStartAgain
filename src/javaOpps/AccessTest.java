package javaOpps;

public class AccessTest {

	public static void main(String[] args) {
		int ss = AccessModifiers.ssn;
		
		AccessModifiers obj = new AccessModifiers();
		
		int a = obj.age;
		String n = obj.name;
		//obj.salary// can't access because this access
		//level is private
		
		obj.allAccessing();
		obj.privateMethod();
		obj.mth1(50);
		

	}

}
