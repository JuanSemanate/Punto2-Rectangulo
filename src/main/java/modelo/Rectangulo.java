
package modelo;

public class Rectangulo extends Figura {
    private Punto p1; // ancla
    private Punto p2; // vértice opuesto

    public Rectangulo(Punto p1, Punto p2) { this.p1 = p1; this.p2 = p2; }

    // Sobrecarga: crear con coordenadas directas
    public Rectangulo(double x1, double y1, double x2, double y2) {
        this(new Punto(x1, y1), new Punto(x2, y2));
    }

    public Punto getP1() { return p1; }
    public Punto getP2() { return p2; }

    public double ancho() { return Math.abs(p2.getX() - p1.getX()); }
    public double alto() { return Math.abs(p2.getY() - p1.getY()); }

    @Override
    public double area() { return ancho() * alto(); }

    // Escalar manteniendo p1 fijo
    public void escalar(double factor) {
        if (factor <= 0) return;
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        p2.setX(p1.getX() + dx * factor);
        p2.setY(p1.getY() + dy * factor);
    }

    // Sobrecarga: escala distinta en X e Y
    public void escalar(double factorX, double factorY) {
        if (factorX <= 0 || factorY <= 0) return;
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        p2.setX(p1.getX() + dx * factorX);
        p2.setY(p1.getY() + dy * factorY);
    }

    @Override
    public boolean contiene(Punto p) {
        double minX = Math.min(p1.getX(), p2.getX());
        double maxX = Math.max(p1.getX(), p2.getX());
        double minY = Math.min(p1.getY(), p2.getY());
        double maxY = Math.max(p1.getY(), p2.getY());
        return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }

    @Override
    public void moverHorizontal(double unidades) {
        p1.setX(p1.getX() + unidades);
        p2.setX(p2.getX() + unidades);
    }

    @Override
    public void moverVertical(double unidades) {
        p1.setY(p1.getY() + unidades);
        p2.setY(p2.getY() + unidades);
    }

    @Override
    public String toString() {
        return "Rectangulo{p1=" + p1 + ", p2=" + p2 + ", ancho=" + ancho() + ", alto=" + alto() + "}";
    }
}
