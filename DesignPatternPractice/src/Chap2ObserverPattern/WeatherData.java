package Chap2ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to represent concrete publisher.
 * @author huazhe
 *
 */
public class WeatherData implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	
	private int humidity;
	private int temp;
	private int pressure;
	
	/**
	 * Basic constructor.
	 * @param humidity
	 * @param temp
	 * @param pressure
	 */
	public WeatherData(final int humidity, final int temp, final int pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observers.indexOf(observer));
	}

	@Override
	public void notifyObservers() {
		observers.stream()
		.forEach(
				observer -> observer.update(this.humidity, this.temp, this.pressure)
				);
	}
	
	public void setMeasurement(int humidity, int temp, int pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		
		notifyObservers();
	}
	
}
