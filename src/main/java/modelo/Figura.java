
package modelo;

public abstract class Figura {
    public abstract double area();
    public abstract void moverHorizontal(double unidades);
    public abstract void moverVertical(double unidades);
    public abstract boolean contiene(Punto p);
}
