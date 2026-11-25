package aula16.metodoestatico;

public class ConversorTemperaturaTeste {

	public static void main(String[] args) {
		
		double celsius = 25.0;
		
		double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
		double kelvin = ConversorTemperatura.celsiusParaKelvin(celsius);
		
		System.out.println(fahrenheit + "º Fahrenheit");
		System.out.println(kelvin + " Kelvin");
	}
}
