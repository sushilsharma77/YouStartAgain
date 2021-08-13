package javaOpps;

public class BankOfAmerica implements USBank {

	@Override
	public void houseLoan() {
		System.out.println("This is BOK house loan method");
	}

	@Override
	public void carLoan() {
		System.out.println("This is BOK car loan method");
	}

	@Override
	public void educationLoan() {
		System.out.println("This is BOK education loan method");
	}

	public void insurance() {
		System.out.println("BOK also provide insurance");
	}

}
