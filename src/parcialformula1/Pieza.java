
package parcialformula1;


import java.util.Objects;

public abstract class Pieza {
    private String nombre;
    private String ubicacion;
    private CondicionClimatica condicionClimatica;

    public Pieza(String nombre, String ubicacion, CondicionClimatica condicionClimatica) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.condicionClimatica = condicionClimatica;
    }

    public String getNombre() { return nombre; }
    public String getUbicacion() { return ubicacion; }
    public CondicionClimatica getCondicionClimatica() { return condicionClimatica; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setCondicionClimatica(CondicionClimatica condicion) { this.condicionClimatica = condicion; }



    @Override
    public String toString() {
        return String.format("Nombre: %s | Ubicación: %s | Condición: %s",
                nombre, ubicacion, condicionClimatica);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return nombre.equalsIgnoreCase(pieza.nombre) &&
               ubicacion.equalsIgnoreCase(pieza.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), ubicacion.toLowerCase());
    }
}