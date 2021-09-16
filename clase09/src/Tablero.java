public class Tablero {

    // ATRIBUTOS
    Casilla [][] escaques = new Casilla[8][8];

    // CONSTRUCTORES

    public Tablero() {
        this.inicializarTablero();
    }

    // METODOS

    public void inicializarTablero(){

        escaques[0][0] = new Casilla( new Torre(true), 0, 0);
        escaques[0][1] = new Casilla( new Caballo(true), 0, 1);
        escaques[0][2] = new Casilla( new Alfil(true), 0, 2);
        escaques[0][3] = new Casilla( new Dama(true), 0, 3);
        escaques[0][4] = new Casilla( new Rey(true), 0, 4);
        escaques[0][5] = new Casilla( new Alfil(true), 0, 5);
        escaques[0][6] = new Casilla( new Caballo(true), 0, 6);
        escaques[0][7] = new Casilla( new Torre(true), 0, 7);

/*
        escaques[1][0] = new Casilla( new Peon(true), 1, 0);
        escaques[1][0] = new Casilla( new Peon(true), 1, 1);
        escaques[1][0] = new Casilla( new Peon(true), 1, 2);
        escaques[1][0] = new Casilla( new Peon(true), 1, 3);
        escaques[1][0] = new Casilla( new Peon(true), 1, 4);
        escaques[1][0] = new Casilla( new Peon(true), 1, 5);
        escaques[1][0] = new Casilla( new Peon(true), 1, 6);
        escaques[1][0] = new Casilla( new Peon(true), 1, 7);
*/

        for (int i = 0; i < 8 ; i++) {
            escaques[1][i] = new Casilla(new Peon(true), 1, i);
        }

        for (int i = 2; i < 6 ; i++) {
            for (int j = 0; j < 8; j++) {
                escaques[i][j] = new Casilla(null, i, j);
            }
        }

        for (int i = 0; i < 8; i++) {
            escaques[6][i] = new Casilla(new Peon(false), 6, i);
        }

        escaques[7][0] = new Casilla( new Torre(false), 7, 0);
        escaques[7][1] = new Casilla( new Caballo(false), 7, 1);
        escaques[7][2] = new Casilla( new Alfil(false), 7, 2);
        escaques[7][3] = new Casilla( new Dama(false), 7, 3);
        escaques[7][4] = new Casilla( new Rey(false), 7, 4);
        escaques[7][5] = new Casilla( new Alfil(false), 7, 5);
        escaques[7][6] = new Casilla( new Caballo(false), 7, 6);
        escaques[7][7] = new Casilla( new Torre(false), 7, 7);

    }
    
    public void imprimirTablero(){

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.escaques[i][j].getPieza() != null){
                    System.out.print(this.escaques[i][j].getPieza().getClass().getSimpleName() + "" + this.escaques[i][j].x + "" + this.escaques[i][j].y + " ");
                } else {
                    System.out.print(this.escaques[i][j].x + "" + this.escaques[i][j].y + " ");
                }
            }
            System.out.println();
        }
    }

}
