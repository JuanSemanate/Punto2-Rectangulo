
package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    @Test
    void areaBasica() {
        Rectangulo r = new Rectangulo(0,0, 4,3);
        assertEquals(12.0, r.area(), 1e-9);
    }

    @Test
    void contienePunto() {
        Rectangulo r = new Rectangulo(0,0, 4,3);
        assertTrue(r.contiene(new Punto(2,1)));
        assertFalse(r.contiene(new Punto(5,1)));
    }

    @Test
    void escalarManteniendoP1() {
        Rectangulo r = new Rectangulo(1,1, 3,3); // ancho=2, alto=2
        r.escalar(2.0); // nuevo ancho=4, alto=4; p1=(1,1) fijo => p2=(5,5)
        assertEquals(1.0, r.getP1().getX(), 1e-9);
        assertEquals(1.0, r.getP1().getY(), 1e-9);
        assertEquals(5.0, r.getP2().getX(), 1e-9);
        assertEquals(5.0, r.getP2().getY(), 1e-9);
    }
}
