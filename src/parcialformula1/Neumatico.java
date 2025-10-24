
package parcialformula1;


public class Neumatico extends Pieza {
    private Compuesto compuesto;

    public Neumatico(String nombre, String ubicacion, CondicionClimatica condicion, Compuesto compuesto) {
        super(nombre, ubicacion, condicion);
        this.compuesto = compuesto;
    }

    public Compuesto getCompuesto() { return compuesto; }
    public void setCompuesto(Compuesto compuesto) { this.compuesto = compuesto; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tipo: Neumático | Compuesto: %s", compuesto);
    }

}
