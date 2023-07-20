import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
    @Test
    public void testCtoF(){
        double celsius = 25;
        double resultadoEsperado= 77;
        double temp = TemperatureConverter.celsiusToFahrenheit(celsius);
        assertEquals(resultadoEsperado,temp,0.1);
    }
    @Test
    public void testFtoC(){
        double farenheit = 90;
        double resultadoEsperado= 32.2;
        double temp = TemperatureConverter.farenheitToCelsius(farenheit);
        assertEquals(resultadoEsperado,temp,0.1);
    }

    @Test
    public void testCtoK(){
        double celsius = 25;
        double resultadoEsperado= 298.15;
        double temp = TemperatureConverter.celsiusToKelvin(celsius);
        assertEquals(resultadoEsperado,temp,0.1);
    }
    @Test
    public void testKtoC(){
        double kelvin = 300;
        double resultadoEsperado= 26.85;
        double temp = TemperatureConverter.kelvinToCelsius(kelvin);
        assertEquals(resultadoEsperado,temp,0.1);
    }
    @Test
    public void testFtoK(){
        double farenheit = 90;
        double resultadoEsperado= 305.3;
        double temp = TemperatureConverter.farenheitToKelvin(farenheit);
        assertEquals(resultadoEsperado, temp, 0.1);
    }

    @Test
    public void testKtoF(){
        double kelvin = 305;
        double resultadoEsperado=89.3;
        double temp = TemperatureConverter.kelvinToFarenheit(kelvin);
        assertEquals(resultadoEsperado,temp,0.1);
    }
}