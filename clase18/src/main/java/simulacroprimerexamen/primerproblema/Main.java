package simulacroprimerexamen.primerproblema;

public class Main {
    public static void main(String[] args) {

        Liga primeraDivision = new Liga("Super Liga", "Futbol");

        System.out.println(primeraDivision.nombre);
        System.out.println(primeraDivision.deporte);
        System.out.println(primeraDivision.equipos);
        System.out.println();

        Jugador primerJugador = new Jugador("Franco", "Armani", 35, "Portero");
        Jugador segundoJugador = new Jugador("Roberto", "Ayala", 42, "Defensa");
        Jugador tercerJugador = new Jugador("Juan", "Verón", 42, "Mediocampo");
        Jugador cuartoJugador = new Jugador("Gabriel Omar", "Batitusta", 42, "Delantero");

        Equipo primerEquipo = new Equipo("Argentinos Jr.");

        System.out.println(primerEquipo.jugadores);

        primerEquipo.imprimirNombreJugadores();

        primerEquipo.agregarJugador(primerJugador);
        primerEquipo.agregarJugador(segundoJugador);
        primerEquipo.agregarJugador(tercerJugador);
        primerEquipo.agregarJugador(cuartoJugador);

        System.out.println(primerEquipo.jugadores);

        primerEquipo.imprimirNombreJugadores();

        primerEquipo.removerJugador(segundoJugador);
        System.out.println(primerEquipo.jugadores);

        primeraDivision.agregarEquipo(primerEquipo);

        primeraDivision.imprimirNombreEquipo();

    }
}
