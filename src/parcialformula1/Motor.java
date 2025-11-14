
package parcialformula1;


public class Motor extends Pieza implements Ajustable {
    private int potenciaMaxima;

    public Motor(String nombre, String ubicacion, CondicionClimatica condicion, int potenciaMaxima) {
        super(nombre, ubicacion, condicion);
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMaxima() { return potenciaMaxima; }
    public void setPotenciaMaxima(int potenciaMaxima) { this.potenciaMaxima = potenciaMaxima; }



    @Override
    public void ajustar() {
        System.out.println("Ajustando motor " + getNombre() + " en " + getUbicacion()
                + " (potencia: " + potenciaMaxima + " CV)");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tipo: Motor | Potencia: %d CV", potenciaMaxima);
    }
}
