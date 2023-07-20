public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }
    public static double farenheitToCelsius(double farenheit){
        return (farenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }
    public static double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public static double farenheitToKelvin(double farenheit){
        double celsius = farenheitToCelsius(farenheit);
        return celsiusToKelvin(celsius);
    }

    public static double kelvinToFarenheit(double kelvin){
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }




}
