
package torneotenis;


import java.util.Objects;

public abstract class Jugador {
    private String nombre;
    private int ranking;
    private Superficie superficiePreferida;

    public Jugador(String nombre, int ranking, Superficie superficiePreferida) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.superficiePreferida = superficiePreferida;
    }

    public String getNombre() { return nombre; }
    public int getRanking() { return ranking; }
    public Superficie getSuperficiePreferida() { return superficiePreferida; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRanking(int ranking) { this.ranking = ranking; }
    public void setSuperficiePreferida(Superficie superficiePreferida) { this.superficiePreferida = superficiePreferida; }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Ranking: %d | Superficie: %s",
                nombre, ranking, superficiePreferida);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return ranking == jugador.ranking &&
                nombre.equalsIgnoreCase(jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), ranking);
    }
}