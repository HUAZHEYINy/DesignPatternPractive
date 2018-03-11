package Chap2ObserverPattern;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int humidity = 0;
		int temp = 0;
		int pressure = 0;
		
		boolean check = true;
		
		WeatherData weatherData = new WeatherData(humidity, temp, pressure);
		
		Observer currentConditionDisplay = new CurrentConditionDisplay();
		Observer staticticsConditionDisplay = new StatisticsConditionDisplay();
		
		Scanner scanner = new Scanner(System.in);
		
		weatherData.registerObserver(currentConditionDisplay);
		weatherData.registerObserver(staticticsConditionDisplay);
		
		while(check) {
			System.out.println("Do you want to change measurement ? (true/false)");
			if (!scanner.nextBoolean()) {
				System.exit(0);
			}
			System.out.println("Please input humidity...");
			humidity = scanner.nextInt();
			System.out.println("Please input temp...");
			temp = scanner.nextInt();
			System.out.println("Please input pressure...");
			pressure = scanner.nextInt();
			
			weatherData.setMeasurement(humidity, temp, pressure);
		}
	}
}
