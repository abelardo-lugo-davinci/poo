public class Torre extends Pieza {

    public Torre(boolean blanca) {
        super(blanca);
    }

    @Override
    public boolean isCapturada() {
        return super.isCapturada();
    }

    @Override
    public void setCapturada(boolean capturada) {
        super.setCapturada(capturada);
    }

    @Override
    public boolean isBlanca() {
        return super.isBlanca();
    }

    @Override
    public void setBlanca(boolean blanca) {
        super.setBlanca(blanca);
    }

    @Override
    public boolean consultarMovimiento(Tablero tablero, Casilla posicionInicial, Casilla posicionFinal) {

        if (posicionFinal.getPieza().isBlanca() == this.isBlanca()) {
            return false;
        }

        int x = Math.abs( posicionFinal.getX() - posicionInicial.getX() );
        int y = Math.abs( posicionFinal.getY() - posicionInicial.getY() );

        return ( ( (x != 0) && (y==0) ) || ( ( x == 0) && ( y != 0) ) );

    }
}
