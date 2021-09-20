public abstract class Pieza {

    // ATRIBUTOS

    boolean capturada = false;
    boolean blanca = true;

    // CONSTRUCTORES

    public Pieza(boolean blanca) {
        this.blanca = blanca;
    }

    // METODOS

    // Getter del atributo capturada

    public boolean isCapturada() {
        return capturada;
    }

    // Setter del atributo capturada

    public void setCapturada(boolean capturada) {
        this.capturada = capturada;
    }

    // Getter del atributo blanca

    public boolean isBlanca() {
        return blanca;
    }

    // Setter del atributo blanca

    public void setBlanca(boolean blanca) {
        this.blanca = blanca;
    }

    public abstract boolean consultarMovimiento(Tablero tablero, Casilla posicionInicial, Casilla posicionFinal);

}
