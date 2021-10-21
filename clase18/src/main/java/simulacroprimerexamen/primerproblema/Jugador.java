package simulacroprimerexamen.primerproblema;

public class Jugador {

    // ATRIBUTOS
    String nombreJugador;
    String apellidoJugador;
    int edad;
    String posicion;

    // CONSTRUCTORES

    public Jugador(String nombreJugador, String apellidoJugador, int edad, String posicion){
        this.nombreJugador = nombreJugador;
        this.apellidoJugador = apellidoJugador;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Jugador(String nombreJugador, String apellidoJugador, int edad){
        // this(nombreJugador, apellidoJugador, edad, null);
        this.nombreJugador = nombreJugador;
        this.apellidoJugador = apellidoJugador;
        this.edad = edad;
    }

    // METODOS

    @Override
    public String toString() {
        return this.nombreJugador + " " + this.apellidoJugador + " (" + this.edad + ")";
    }

}
