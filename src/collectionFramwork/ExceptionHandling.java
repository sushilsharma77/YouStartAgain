package collectionFramwork;

public class ExceptionHandling {
	int i;

	public ExceptionHandling(int i) {
		this.i = i;
		try {
		System.out.println(i / 0);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception has caught");
			e.printStackTrace();
			
		}

	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling(10);

	}

}
