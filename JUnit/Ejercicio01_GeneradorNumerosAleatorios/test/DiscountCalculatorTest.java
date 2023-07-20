import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    @Test
    public void descuentoDel10(){
        DiscountCalculator dc = new DiscountCalculator();
        double precioOriginal = 100;
        double porcentajeDescuento = 10;
        double precioEsperado = 90;

        double precioDescontado = dc.calcularDescuento(precioOriginal, porcentajeDescuento);
        // verificar el descuento del 10%,
        assertEquals(precioEsperado, precioDescontado, 0);
    }

    @Test
    public void descuentoMitadPrecio(){
        DiscountCalculator dc = new DiscountCalculator();
        double precioOriginal = 100;
        double porcentajeDescuento = 50;
        double precioEsperado = 50;

        double precioDescontado = dc.calcularDescuento(precioOriginal, porcentajeDescuento);
        // verificar descuento del 50%
        assertEquals(precioEsperado, precioDescontado, 0);
    }

    @Test
    public void descuentoMaximo(){
        DiscountCalculator dc = new DiscountCalculator();
        double precioOriginal = 100;
        double porcentajeDescuento = 100;
        double precioEsperado = 0;

        double precioDescontado = dc.calcularDescuento(precioOriginal, porcentajeDescuento);
        // verificar descuento máximo (100%)
        assertEquals(precioEsperado, precioDescontado, 0);
    }

    @Test
    public void precioSinDescuento(){
        DiscountCalculator dc = new DiscountCalculator();
        double precioOriginal = 100;
        double porcentajeDescuento = 0;
        double precioEsperado = 100;

        double precioDescontado = dc.calcularDescuento(precioOriginal, porcentajeDescuento);
        // verificar precio sin descuento (0%)
        assertEquals(precioEsperado, precioDescontado, 0);
    }
}