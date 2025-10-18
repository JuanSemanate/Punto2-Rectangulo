
package integracion;

import controlador.ControladorFiguras;
import modelo.Rectangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracionIT {
    @Test
    void flujoBasico() {
        ControladorFiguras c = new ControladorFiguras();
        Rectangulo r = c.crearRectangulo(0,0, 2,2);
        c.escalar(r, 1.5);
        c.moverHorizontal(r, 1);
        c.moverVertical(r, -1);
        double area = c.calcularArea(r);
        assertTrue(area > 0);
        assertTrue(c.contiene(r, 1.5, 0.5));
    }
}
