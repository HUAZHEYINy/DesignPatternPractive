package Chap3DecoratorPattern;

public class Decaf extends Beverage{
	public Decaf() {
		description = "Espresso";
	}
	
	public double cost() {
		return 5.5;
	}
}
