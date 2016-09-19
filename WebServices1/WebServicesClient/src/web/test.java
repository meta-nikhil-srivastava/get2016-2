package web;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		TemperatureConversionServiceLocator temperatureConversionServiceLocator=new TemperatureConversionServiceLocator();
		temperatureConversionServiceLocator.setTemperatureConversionEndpointAddress("http://localhost:8080/WebServices/services/TemperatureConversion");
		
		try {
			TemperatureConversion tConversion=temperatureConversionServiceLocator.getTemperatureConversion();
			Scanner sc=new Scanner(System.in);
			double fah=sc.nextDouble();
			System.out.println(tConversion.fahrenheitToCelsius(fah));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
