package calculadora1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Calculadora1Test {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        assertEquals(5, result);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int result = calculator.substract(2,3);
        assertEquals(-1,result);
    }
    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2,3);
        assertEquals(6,result);
    }
    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(10,2);
        assertEquals(5,result);
    }
}