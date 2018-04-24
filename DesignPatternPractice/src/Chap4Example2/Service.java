package Chap4Example2;

public class Service {
	SimpleFactory simpleFactory;
	
	public Service (SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}
	
	public void start(String input) {
		simpleFactory.dress();
	}
	
	public SimpleFactory factoryPicker(String input) {
		SimpleFactory simpleFac = null;
		if (input.equals("women")) {
			simpleFac = new WomenFactory();
		} else if (input.equals("men")) {
			simpleFac = new MenFactory();
		}
		
		return simpleFac;
	}
}
