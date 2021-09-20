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

}
