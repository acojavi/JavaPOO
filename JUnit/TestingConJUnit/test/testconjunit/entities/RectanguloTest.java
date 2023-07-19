package testconjunit.entities;
import org.junit.*;
import testconjunit.services.RectanguloService;

import static org.junit.Assert.*;

public class RectanguloTest {

    RectanguloService rs;

    public RectanguloTest(){
    }

    @BeforeClass
    public static void setUpClass(){
    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){
        rs = new RectanguloService();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void deberiaIniciarlizarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }

    @Test
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4,5)),0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)),0);
    }
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)),0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20,30)),0);
        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5,10)),0);
    }

    @Test
    public void deberiaActivarODesactivar(){
        Rectangulo r = new Rectangulo(5,5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }
}