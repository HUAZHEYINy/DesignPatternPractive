package Chap4FactoryPattern;

/**
 * Abstract class for pizza.
 * @author huazhe
 *
 */
public abstract class Pizza {
	public String desc;
	public Pizza(String desc) {
		this.desc = desc;
	}
	public abstract String getDesc();
	
	public void bakePizza() {
		//TODO: bake pizza.
	}
	
	public void cutPizza() {
		//TODO: cut pizza.
	}
}
