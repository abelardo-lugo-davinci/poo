public class Movimiento {

    // ATRIBUTOS

    Jugador jugador;
    Casilla posicionInicial;
    Casilla posicionFinal;
    Pieza piezaMovida;
    Pieza piezaCapturada;

    public Movimiento(Jugador jugador, Casilla posicionInicial, Casilla posicionFinal) {
        this.jugador = jugador;
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
        this.piezaMovida = posicionInicial.getPieza();
        this.piezaCapturada = posicionFinal.getPieza();
    }

    // METODOS


    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Casilla getPosicionInicial() {
        return posicionInicial;
    }

    public void setPosicionInicial(Casilla posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    public Casilla getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(Casilla posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public Pieza getPiezaMovida() {
        return piezaMovida;
    }

    public void setPiezaMovida(Pieza piezaMovida) {
        this.piezaMovida = piezaMovida;
    }

    public Pieza getPiezaCapturada() {
        return piezaCapturada;
    }

    public void setPiezaCapturada(Pieza piezaCapturada) {
        this.piezaCapturada = piezaCapturada;
    }
}
