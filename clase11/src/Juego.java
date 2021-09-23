import java.util.ArrayList;

public class Juego {

    // ATRIBUTOS
    Tablero tablero;
    Jugador [] jugadores = new Jugador[2];
    ArrayList<Movimiento> movimientosJugados;
    EstadoDelJuego estado;
    Jugador jugadorEnTurno;

    // CONSTRUCTOR

    public Juego() {
        this.tablero = new Tablero();
        this.jugadores[0] = new Jugador(true);
        this.jugadores[1] = new Jugador(false);
        this.jugadorEnTurno = new Jugador(true);
        this.movimientosJugados = new ArrayList<Movimiento>();
        this.estado = EstadoDelJuego.ACTIVO;
    }

    // METODOS

    public EstadoDelJuego getEstado() {
        return estado;
    }

    public void setEstado(EstadoDelJuego estado) {
        this.estado = estado;
    }

    public boolean finalizado() {
        return this.getEstado() != EstadoDelJuego.ACTIVO;
    }

    public void movimientoJugador(Jugador jugador, int inicioX, int inicioY, int finalX, int finalY){
        Casilla casillaInicial = new Casilla(this.getTablero().getCasillas()[inicioX][inicioY].getPieza(), inicioX, inicioY);
        Casilla casillaFinal = new Casilla(this.getTablero().getCasillas()[finalX][finalY].getPieza(), inicioX, inicioY);
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
}
