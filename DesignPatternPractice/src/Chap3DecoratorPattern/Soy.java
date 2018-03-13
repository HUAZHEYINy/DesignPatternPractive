package Chap3DecoratorPattern;

public class Soy extends CondimentDecorator{
	public Soy(Beverage beverage) {
		super(beverage);
	}
	
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return this.beverage.cost() + 1.2;
	}
}
