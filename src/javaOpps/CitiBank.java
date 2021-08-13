package javaOpps;

public abstract class CitiBank implements USBank {

	@Override
	public void houseLoan() {
		System.out.println("This is city bank house loan method");
	}

	@Override
	public void carLoan() {
		System.out.println("This is citi bank car loan method");

	}

	public abstract void educationLoan();

}
