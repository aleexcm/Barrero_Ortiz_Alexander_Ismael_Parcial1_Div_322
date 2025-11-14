
package torneotenis;

public class Doblista extends Jugador implements Sacador, PracticaEnPareja {
    private int indiceCoordinacion; 

    public Doblista(String nombre, int ranking, Superficie superficie, int indiceCoordinacion) {
        super(nombre, ranking, superficie);
        this.indiceCoordinacion = indiceCoordinacion;
    }

    public int getIndiceCoordinacion() { return indiceCoordinacion; }
    public void setIndiceCoordinacion(int indiceCoordinacion) { this.indiceCoordinacion = indiceCoordinacion; }

    @Override
    public void sacar() {
        System.out.println("Doblista " + getNombre() + " realiza un saque (índice coordinación: " + indiceCoordinacion + ").");
    }

    @Override
    public void practicaEnPareja() {
        System.out.println("Doblista " + getNombre() + " practica en pareja (índice coordinación: " + indiceCoordinacion + ").");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tipo: Doblista | Indice coordinación: %d", indiceCoordinacion);
    }
}
