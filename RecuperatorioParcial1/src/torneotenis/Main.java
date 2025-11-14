
package torneotenis;


public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        try {
            
            Singlista s1 = new Singlista("David Nalbandian", 3, Superficie.CEMENTO, 200);
            torneo.agregarJugador(s1);

            Doblista d1 = new Doblista("Bob Pair", 50, Superficie.CESPED, 8);
            torneo.agregarJugador(d1);

            Juvenil j1 = new Juvenil("Carlos Junior", 120, Superficie.POLVO, true);
            torneo.agregarJugador(j1);

            
            Singlista sDuplicado = new Singlista("David Nalbandian", 3, Superficie.CEMENTO, 202);
            torneo.agregarJugador(sDuplicado);
        } catch (JugadorDuplicadoException ex) {
            System.out.println("Error al agregar: " + ex.getMessage());
        }

        
        torneo.mostrarJugadores();

        
        System.out.println();
        
        Singlista pruebaS = new Singlista("David Nalbandian", 3, Superficie.CEMENTO, 200);
        torneo.sacar(pruebaS);
        try {
            torneo.agregarJugador(pruebaS);
        } catch (JugadorDuplicadoException e) {
            
        }
        torneo.sacar(pruebaS); 

        System.out.println();
        
        Doblista d2 = new Doblista("Bob Pair", 50, Superficie.CESPED, 8);
        torneo.practicaEnPareja(d2);

        
        torneo.filtrarPorSuperficie(Superficie.CEMENTO);

        
        torneo.generarResumenPorTipo();
    }
}