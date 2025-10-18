
package vista;

import java.util.Scanner;

public class VistaConsola {
    private final Scanner sc = new Scanner(System.in);

    public String pedirTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }
    public double pedirDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Valor inválido, intenta de nuevo.");
            }
        }
    }
    public int pedirOpcion(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int v = Integer.parseInt(sc.nextLine().trim());
                if (v >= min && v <= max) return v;
            } catch (Exception ignored) {}
            System.out.println("Opción inválida.");
        }
    }

    public void mostrar(String msg) { System.out.println(msg); }
}
