
package controlador;

import modelo.*;

public class ControladorFiguras {

    public Rectangulo crearRectangulo(double x1, double y1, double x2, double y2) {
        return new Rectangulo(x1, y1, x2, y2);
    }

    public double calcularArea(Rectangulo r) { return r.area(); }

    public void escalar(Rectangulo r, double factor) { r.escalar(factor); }
    public void escalar(Rectangulo r, double fx, double fy) { r.escalar(fx, fy); }

    public boolean contiene(Rectangulo r, double x, double y) { return r.contiene(new Punto(x, y)); }

    public void moverHorizontal(Rectangulo r, double unidades) { r.moverHorizontal(unidades); }
    public void moverVertical(Rectangulo r, double unidades) { r.moverVertical(unidades); }
}
