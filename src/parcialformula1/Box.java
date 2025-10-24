
package parcialformula1;


import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Pieza> piezas;

    public Box() {
        piezas = new ArrayList<>();
    }

    public void agregarPieza(Pieza pieza) throws PiezaDuplicadaException {
        if (piezas.contains(pieza)) {
            throw new PiezaDuplicadaException("Ya existe una pieza con ese nombre y ubicación: "
                    + pieza.getNombre() + " (" + pieza.getUbicacion() + ")");
        }
        piezas.add(pieza);
    }

    public void mostrarPiezas() {
        if (piezas.isEmpty()) {
            System.out.println("No hay piezas registradas.");
            return;
        }
        System.out.println("=== Piezas en el box ===");
        for (Pieza p : piezas) System.out.println(p);
    }

    public void ajustarPiezas() {
        System.out.println("=== Ajustando piezas ajustables ===");
        for (Pieza p : piezas) {
            if (p instanceof Ajustable) {
                ((Ajustable) p).ajustar();
            } else {
                System.out.println("La pieza " + p.getNombre() + " no es ajustable.");
            }
        }
    }

    public List<Pieza> buscarPiezasPorCondicion(CondicionClimatica condicion) {
        List<Pieza> resultado = new ArrayList<>();
        for (Pieza p : piezas) {
            if (p.getCondicionClimatica() == condicion) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}