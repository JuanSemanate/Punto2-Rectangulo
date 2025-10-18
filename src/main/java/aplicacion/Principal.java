
package aplicacion;

import controlador.ControladorFiguras;
import modelo.Rectangulo;
import vista.VistaConsola;

public class Principal {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        ControladorFiguras ctrl = new ControladorFiguras();

        vista.mostrar("=== Punto 2 - Rectángulo (MVC, interactivo) ===");
        double x1 = vista.pedirDouble("x1: ");
        double y1 = vista.pedirDouble("y1: ");
        double x2 = vista.pedirDouble("x2 (vértice opuesto): ");
        double y2 = vista.pedirDouble("y2 (vértice opuesto): ");

        Rectangulo r = ctrl.crearRectangulo(x1, y1, x2, y2);
        vista.mostrar("Rectángulo creado: " + r);

        boolean salir = false;
        while(!salir) {
            vista.mostrar("\nMenú:");
            vista.mostrar("1. Calcular área");
            vista.mostrar("2. Escalar (p1 fijo) con un factor");
            vista.mostrar("3. Escalar con factores distintos (fx, fy)");
            vista.mostrar("4. ¿Punto dentro del rectángulo?");
            vista.mostrar("5. Mover horizontalmente");
            vista.mostrar("6. Mover verticalmente");
            vista.mostrar("7. Mostrar estado");
            vista.mostrar("0. Salir");
            int op = vista.pedirOpcion("Elige: ", 0, 7);
            switch(op) {
                case 1 -> vista.mostrar("Área = " + ctrl.calcularArea(r));
                case 2 -> { double f = vista.pedirDouble("Factor (>0): "); ctrl.escalar(r, f); vista.mostrar("Escalado. " + r); }
                case 3 -> { double fx = vista.pedirDouble("Factor X (>0): "); double fy = vista.pedirDouble("Factor Y (>0): "); ctrl.escalar(r, fx, fy); vista.mostrar("Escalado. " + r); }
                case 4 -> { double px = vista.pedirDouble("x del punto: "); double py = vista.pedirDouble("y del punto: "); boolean dentro = ctrl.contiene(r, px, py); vista.mostrar(dentro ? "El punto está dentro" : "El punto está fuera"); }
                case 5 -> { double u = vista.pedirDouble("Unidades H (neg=izq, pos=der): "); ctrl.moverHorizontal(r, u); vista.mostrar("Movido. " + r); }
                case 6 -> { double u = vista.pedirDouble("Unidades V (neg=abajo, pos=arriba): "); ctrl.moverVertical(r, u); vista.mostrar("Movido. " + r); }
                case 7 -> vista.mostrar(r.toString());
                case 0 -> salir = true;
            }
        }
        vista.mostrar("Fin del programa.");
    }
}
