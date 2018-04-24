package Chap4FactoryPattern;

/**
 * Pizza store.
 * @author huazhe
 *
 */
public class PizzaStore {
	SimplePizzaFac simplePizzaFac;
	
	public PizzaStore(SimplePizzaFac simplePizzaFac) {
		this.simplePizzaFac = simplePizzaFac;
	}
	
	public Pizza orderPizza(String type) {
		return simplePizzaFac.createPizza(type);
	}
	
}
