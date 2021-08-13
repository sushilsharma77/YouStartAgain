package javaOpps;

public class Car {
	
	String color;
	String brand;
	double price;
	String model;
	
	public void runs() {
		System.out.println(color +" "+ model+ " runs fast");
	}
	public void braks() {
		System.out.println(brand + " braks to quickly");
	}
	
	public static void main(String[] args) {
		
		Car a = new Car();
		a.color = "red";
		a.brand = "Toyota";
		a.price = 20000;
		a.model = "Camry";
		
		Car b= new Car();
		b.color = "black";
		b.brand = "BMW";
		b.price = 50500.99;
		b.model = "BMWXX";
		
		System.out.println(a.color);
		System.out.println(b.model);
		
		a.runs();
		b.braks();
		
	}
	

}
