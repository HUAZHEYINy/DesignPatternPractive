package Chap3DecoratorPattern;

public class Mocha extends CondimentDecorator{
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}
	
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return this.beverage.cost() + 1.1;
	}
}
