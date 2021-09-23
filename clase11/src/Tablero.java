public class Tablero {

    // ATRIBUTOS
    Casilla [][] casillas = new Casilla[8][8];

    // CONSTRUCTORES

    public Tablero() {
        this.inicializarTablero();
    }

    // METODOS

    public void inicializarTablero() {

        casillas[0][0] = new Casilla(new Torre(true), 0, 0);
        casillas[1][0] = new Casilla(new Caballo(true), 1, 0);
        casillas[2][0] = new Casilla(new Alfil(true), 2, 0);
        casillas[3][0] = new Casilla(new Dama(true), 3, 0);
        casillas[4][0] = new Casilla(new Rey(true), 4, 0);
        casillas[5][0] = new Casilla(new Alfil(true), 5, 0);
        casillas[6][0] = new Casilla(new Caballo(true), 6, 0);
        casillas[7][0] = new Casilla(new Torre(true), 7, 0);

        for (int i = 0; i < 8; i++) {
            casillas[i][1] = new Casilla(new Peon(true), i, 1);
        }

        for (int i = 0; i < 8; i++) {
            casillas[i][6] = new Casilla(new Peon(false), i, 6);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 2; j < 6 ; j++) {
                casillas[i][j] = new Casilla(null, i, j);
            }
        }

        casillas[0][7] = new Casilla(new Torre(false), 0, 7);
        casillas[1][7] = new Casilla(new Caballo(false), 1, 7);
        casillas[2][7] = new Casilla(new Alfil(false), 2, 7);
        casillas[3][7] = new Casilla(new Dama(false), 3, 7);
        casillas[4][7] = new Casilla(new Rey(false), 4, 7);
        casillas[5][7] = new Casilla(new Alfil(false), 5, 7);
        casillas[6][7] = new Casilla(new Caballo(false), 6, 7);
        casillas[7][7] = new Casilla(new Torre(false), 7, 7);

    }

    public void imprimirTablero() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if( this.casillas[j][i].getPieza() != null) {
                    System.out.print(this.casillas[j][i].getPieza().getClass().getSimpleName() + "" + this.casillas[j][i].getX() + "" + this.casillas[j][i].getY() + " ");
                } else {
                    System.out.print(this.casillas[j][i].getX() + "" + this.casillas[j][i].getY() + " ");
                }
            }
            System.out.println(" ");
        }

    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

}
