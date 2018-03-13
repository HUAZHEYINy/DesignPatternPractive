package Chap3DecoratorPattern;

public class Espresso extends Beverage{
	public Espresso() {
		description = "Espresso";
	}
	
	public double cost() {
		return 5.5;
	}
}
