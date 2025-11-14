
package torneotenis;


public class Singlista extends Jugador implements Sacador {
    private int velocidadSaque; // km/h

    public Singlista(String nombre, int ranking, Superficie superficie, int velocidadSaque) {
        super(nombre, ranking, superficie);
        this.velocidadSaque = velocidadSaque;
    }

    public int getVelocidadSaque() { return velocidadSaque; }
    public void setVelocidadSaque(int velocidadSaque) { this.velocidadSaque = velocidadSaque; }

    @Override
    public void sacar() {
        System.out.println("Singlista " + getNombre() + " realiza un saque a " + velocidadSaque + " km/h.");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tipo: Singlista | Velocidad saque: %d km/h", velocidadSaque);
    }
}
