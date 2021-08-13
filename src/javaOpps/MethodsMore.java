package javaOpps;

public class MethodsMore {

	// create a method that will say welcome 10 times
	public void sayWelcome(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}

	}

	// create a method isItRaining
	// that will accept boolean value as a param
	// and based on the value it will print message accordingly
	public void isItRaining(boolean b) {
		if (b == true) {
			System.out.println("It is raining outside");
		} else {
			System.out.println("It is not raining. Enjoy the weather");
		}

		// we want to create a method that will accept marks(90, 80)
		// based on the marks it will return grade(A, B, C)
		// if grade > 90--> A, if 90<grade>80 --> B, if 80<grade>70 --> C
	}

public char getGrade(int marks) {
	
	char grade;
	
	if(marks>90) {
		grade='A';
	}else if(marks<90&&marks>80){
		grade='B';
	}else if(marks<80&&marks>70){
		grade='c';
	}else if(marks<70&&marks>60){
		grade='D';
	}else {
		grade='F';
	}
		
		return grade;

	}
}
