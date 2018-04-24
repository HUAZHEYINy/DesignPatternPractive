package Chap4FactoryPattern;

/**
 * Factory used to encapsulate creation of pizza.
 * @author huazhe
 *
 */
public class SimplePizzaFac {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type == "cheese") {
			pizza = new CheesePizza("cheese");
		}
		pizza.bakePizza();
		pizza.cutPizza();
		return pizza;
	}
}
