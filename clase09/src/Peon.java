public class Peon extends Pieza {

    public Peon(boolean blanca) {
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


        int x = posicionFinal.getX() - posicionInicial.getX();
        int y = posicionFinal.getY() - posicionInicial.getY();

        if ( (posicionFinal.getPieza().isBlanca() == this.isBlanca()) && ( x != 0)) {
            return false;
        } else if ( this.isBlanca() && ( posicionInicial.getY() == 1 ) ) {
            return ( y==1 || y==2 );
        } else if ( this.isBlanca() && ( posicionInicial.getY() != 1 )) {
            return ( y==1 );
        } else if (!this.isBlanca() && ( posicionInicial.getY() == 6 )) {
            return ( y==-1 ||y==-2 );
        } else if ( !this.isBlanca() && ( posicionInicial.getY() != 6 ) ) {
            return ( y==-1 );
        } else {
            return false;
        }

    }
}
