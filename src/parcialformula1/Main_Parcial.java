
package parcialformula1;

import java.util.List;

public class Main_Parcial {
    public static void main(String[] args) {
        Box box = new Box();

        try {
            box.agregarPieza(new Motor("PU-016", "Estación Motor", CondicionClimatica.SECO, 950));
            box.agregarPieza(new Ala("Ala-Front-1", "Estación Aero", CondicionClimatica.MIXTO, 7));
            box.agregarPieza(new Neumatico("Rueda-01", "Carro Neumaticos", CondicionClimatica.LLUVIA, Compuesto.WET));

            box.agregarPieza(new Motor("PU-016", "Estación Motor", CondicionClimatica.SECO, 960));
        } catch (PiezaDuplicadaException ex) {
            System.out.println("Error al agregar: " + ex.getMessage());
        }

        box.mostrarPiezas();
        box.ajustarPiezas();

        List<Pieza> secos = box.buscarPiezasPorCondicion(CondicionClimatica.SECO);
        System.out.println("\nPiezas para condición SECO:");
        if (secos.isEmpty()) {
            System.out.println("No se encontraron piezas para SECO.");
        } else {
            for (Pieza p : secos) System.out.println(p);
        }
    }
}
