
package parcialformula1;


public class Ala extends Pieza implements Ajustable {
    private int cargaAerodinamica;

    public Ala(String nombre, String ubicacion, CondicionClimatica condicion, int cargaAerodinamica) {
        super(nombre, ubicacion, condicion);
        this.cargaAerodinamica = cargaAerodinamica;
    }

    public int getCargaAerodinamica() { return cargaAerodinamica; }
    public void setCargaAerodinamica(int cargaAerodinamica) { this.cargaAerodinamica = cargaAerodinamica; }

    @Override
    public boolean esAjustable() { return true; }

    @Override
    public void ajustar() {
        System.out.println("Ajustando ala " + getNombre() + " (carga aerodinámica: " + cargaAerodinamica + ")");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tipo: Ala | Carga: %d", cargaAerodinamica);
    }
}
