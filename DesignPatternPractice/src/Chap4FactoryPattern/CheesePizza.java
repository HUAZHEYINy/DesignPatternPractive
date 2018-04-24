package Chap4FactoryPattern;

/**
 * SubClass of Pizza.
 * @author huazhe
 *
 */
public class CheesePizza extends Pizza{
	public CheesePizza(String desc) {
		super(desc);
	}

	public String getDesc() {
		return super.desc;
	}
}
