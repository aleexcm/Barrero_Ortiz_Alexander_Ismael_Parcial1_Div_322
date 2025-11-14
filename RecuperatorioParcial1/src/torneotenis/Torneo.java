
package torneotenis;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<Jugador> jugadores;

    public Torneo() {
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) throws JugadorDuplicadoException {
        if (jugadores.contains(jugador)) {
            throw new JugadorDuplicadoException("Ya existe un jugador con ese nombre y ranking: "
                    + jugador.getNombre() + " (ranking: " + jugador.getRanking() + ")");
        }
        jugadores.add(jugador);
    }

    public void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
            return;
        }
        System.out.println("=== Jugadores registrados ===");
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }

    public void sacar(Jugador jugador) {
        if (!jugadores.contains(jugador)) {
            System.out.println("El jugador no está registrado: " + jugador.getNombre());
            return;
        }
        if (jugador instanceof Sacador) {
            ((Sacador) jugador).sacar();
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no puede realizar saque.");
        }
    }

    public void practicaEnPareja(Jugador jugador) {
        if (!jugadores.contains(jugador)) {
            System.out.println("El jugador no está registrado: " + jugador.getNombre());
            return;
        }
        if (jugador instanceof PracticaEnPareja) {
            ((PracticaEnPareja) jugador).practicaEnPareja();
        } else {
            System.out.println("El jugador " + jugador.getNombre() + " no puede practicar en pareja.");
        }
    }

    public List<Jugador> filtrarPorSuperficie(Superficie superficie) {
        List<Jugador> resultado = new ArrayList<>();
        for (Jugador j : jugadores) {
            if (j.getSuperficiePreferida() == superficie) {
                resultado.add(j);
            }
        }
        System.out.println("=== Jugadores para superficie: " + superficie + " ===");
        if (resultado.isEmpty()) {
            System.out.println("No se encontraron jugadores para la superficie indicada.");
        } else {
            for (Jugador j : resultado) System.out.println(j);
        }
        return resultado;
    }

    public void generarResumenPorTipo() {
        int singlistas = 0, doblistas = 0, juveniles = 0;
        for (Jugador j : jugadores) {
            if (j instanceof Singlista) singlistas++;
            else if (j instanceof Doblista) doblistas++;
            else if (j instanceof Juvenil) juveniles++;
        }
        System.out.println("=== Resumen por tipo ===");
        System.out.println("Singlistas: " + singlistas + (singlistas == 0 ? " (ninguno registrado)" : ""));
        System.out.println("Doblistas: " + doblistas + (doblistas == 0 ? " (ninguno registrado)" : ""));
        System.out.println("Juveniles: " + juveniles + (juveniles == 0 ? " (ninguno registrado)" : ""));
    }
}
