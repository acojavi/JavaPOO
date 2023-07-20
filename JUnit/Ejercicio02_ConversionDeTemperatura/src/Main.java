public class Main {
    public static void main(String[] args) {

        double celsius = 20;
        double farenheit = 90;
        double kelvin  = 300;

        double celsiusToFarenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius es " + celsiusToFarenheit + " grados Fahrenheit");

        double farenheitToCelsius = TemperatureConverter.farenheitToCelsius(farenheit);
        System.out.println(farenheit + " grados Farenheit es " + farenheitToCelsius + " grados Celsius");

        double celsiusToKelvin = TemperatureConverter.celsiusToKelvin(celsius);
        System.out.println(celsius + " grados Celsius es " + celsiusToKelvin + " grados Kelvin");

        double kelvinToCelsius = TemperatureConverter.kelvinToCelsius(kelvin);
        System.out.println(kelvin + " grados Kelvin es " + kelvinToCelsius + " grados Celsius");

        double farenheitToKelvin = TemperatureConverter.farenheitToKelvin(farenheit);
        System.out.println(farenheit + " grados Farenheit es " + farenheitToKelvin + " grados Kelvin");

        double kelvinToFarenheit = TemperatureConverter.kelvinToFarenheit(kelvin);
        System.out.println(kelvin + " grados Kelvin es " + kelvinToFarenheit + " grados Farenheit" );

    }
}