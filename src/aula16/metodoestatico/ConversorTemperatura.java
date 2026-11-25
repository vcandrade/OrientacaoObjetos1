package aula16.metodoestatico;

public class ConversorTemperatura {

	public static double celsiusParaFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static double celsiusParaKelvin(double celsius) {
		return celsius + 273.15;
	}

	public static double fahrenheitParaCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static double fahrenheitParaKelvin(double fahrenheit) {
		double celsius = fahrenheitParaCelsius(fahrenheit);
		return celsius + 273.15;
	}

	public static double kelvinParaCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	public static double kelvinParaFahrenheit(double kelvin) {
		double celsius = kelvinParaCelsius(kelvin);
		return celsiusParaFahrenheit(celsius);
	}
}
