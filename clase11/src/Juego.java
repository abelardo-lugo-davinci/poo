import java.util.ArrayList;

public class Juego {

    // ATRIBUTOS
    Tablero tablero;
    Jugador[] jugadores = new Jugador[2];
    ArrayList<Movimiento> movimientosJugados;
    EstadoDelJuego estado;
    Jugador jugadorEnTurno;

    // CONSTRUCTOR

    public Juego() {
        this.tablero = new Tablero();
        this.jugadores[0] = new Jugador(true);
        this.jugadores[1] = new Jugador(false);
        this.movimientosJugados = new ArrayList<Movimiento>();
        this.estado = EstadoDelJuego.ACTIVO;
        this.jugadorEnTurno = new Jugador(true);
    }

    // METODOS

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public EstadoDelJuego getEstado() {
        return estado;
    }

    public void setEstado(EstadoDelJuego estado) {
        this.estado = estado;
    }

    public boolean movimientoJugador(Jugador jugador, int inicioX, int inicioY, int finalX, int finalY){
        Casilla casillaInicial = new Casilla(this.getTablero().getCasillas()[inicioX][inicioY].getPieza(), inicioX, inicioY);
        Casilla casillaFinal = new Casilla(this.getTablero().getCasillas()[finalX][finalY].getPieza(), finalX, finalY);
        Movimiento movimiento = new Movimiento(jugador, casillaInicial, casillaFinal);
        return this.consultarMovimiento(movimiento, jugador);
    }

    public boolean consultarMovimiento(Movimiento movimiento, Jugador jugador) {

        // Verificación de la casilla inicial con pieza
        if (movimiento.getPosicionInicial().getPieza() == null) {
            return false;
        }

        // Verificación de la casilla inicial con pieza del mismo color que el jugador
        if (movimiento.getPosicionInicial().getPieza().isBlanca() != jugador.isBlanca()) {
            return false;
        }

        // Verificación de la casilla final no tenga piezas del misma color al jugador
        if (movimiento.getPosicionFinal().getPieza().isBlanca() == jugador.isBlanca()) {
            return false;
        }

        // En caso de haber captura de pieza
        Pieza piezaPosicionFinal = movimiento.getPosicionFinal().getPieza();
        if (piezaPosicionFinal != null) {
            // piezaPosicionFinal.setCapturada(true);
            movimiento.getPosicionFinal().setPieza(movimiento.getPosicionInicial().getPieza());
        }

        return true;

    }

}
