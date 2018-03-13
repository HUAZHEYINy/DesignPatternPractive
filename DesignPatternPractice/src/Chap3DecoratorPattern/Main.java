package Chap3DecoratorPattern;

public class Main {
	
	public static void main(String[] args) {
		Beverage epresso = new Espresso();
		
		epresso = new Mocha(epresso);
		epresso = new Mocha(epresso);
		epresso = new Soy(epresso);
		
		System.out.println(epresso.getDescription() + ". Price: " + epresso.cost());
		
		Beverage decaf = new Decaf();
		decaf = new Soy(decaf);
		
		System.out.println(decaf.getDescription() + ".Price: " + decaf.cost());
	}
	
}
