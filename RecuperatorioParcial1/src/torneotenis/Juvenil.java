
package torneotenis;


public class Juvenil extends Jugador implements PracticaEnPareja {
    private boolean tieneTutorDeportivo;

    public Juvenil(String nombre, int ranking, Superficie superficie, boolean tieneTutorDeportivo) {
        super(nombre, ranking, superficie);
        this.tieneTutorDeportivo = tieneTutorDeportivo;
    }

    public boolean isTieneTutorDeportivo() { return tieneTutorDeportivo; }
    public void setTieneTutorDeportivo(boolean tieneTutorDeportivo) { this.tieneTutorDeportivo = tieneTutorDeportivo; }

    @Override
    public void practicaEnPareja() {
        System.out.println("Juvenil " + getNombre() + (tieneTutorDeportivo ? " (con tutor) " : " ") + "practica en pareja.");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tipo: Juvenil | Tutor deportivo: %s", tieneTutorDeportivo ? "Sí" : "No");
    }
}
