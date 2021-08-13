package javaOpps;

public class BankTest extends CitiBank {

	public static void main(String[] args) {
		
		
		CitiBank citi = new BankTest();
		citi.carLoan();
		citi.educationLoan();
		citi.houseLoan();
		
		BankOfAmerica bok = new BankOfAmerica();
		bok.carLoan();
		bok.educationLoan();
		bok.houseLoan();
		bok.insurance();
		
		System.out.println("the morgage rate is: "+ morgageRate);

	}

	@Override
	public void educationLoan() {
		System.out.println("Education loan is not avaialable");
		
	}

}
