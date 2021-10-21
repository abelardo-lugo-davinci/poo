package simulacroprimerexamen.primerproblema;

import java.util.ArrayList;

public class Equipo {

    // ATRIBUTOS
    String nombreEquipo;
    String estadio;
    String directorTecnico;
    int anioFundacion;
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    // CONSTRUCTORES

    public Equipo(String nombreEquipo, String estadio, String directorTecnico, int anioFundacion){
        this.nombreEquipo = nombreEquipo;
        this.estadio = estadio;
        this.directorTecnico = directorTecnico;
        this.anioFundacion = anioFundacion;
    }

    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }

    // METODOS

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void removerJugador(Jugador jugador){
        this.jugadores.remove(jugador);
    }

    public void imprimirNombreJugadores(){
        for (int i = 0; i < this.jugadores.size(); i++) {
            System.out.println(this.jugadores.get(i).nombreJugador);
        }
    }

}
