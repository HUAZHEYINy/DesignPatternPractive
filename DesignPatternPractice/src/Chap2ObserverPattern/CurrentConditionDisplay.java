package Chap2ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private int humidity;
	private int temp;
	private int pressure;
	
	@Override
	public void display() {
		System.out.println(
				String.format("I am CurrentCondition, the humidity is %s, the temp is %s, the pressure is %s.", 
						this.humidity, 
						this.temp, 
						this.pressure)
				);
	}

	@Override
	public void update(int humidity, int temp, int pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		
		this.display();
	}
	
}
