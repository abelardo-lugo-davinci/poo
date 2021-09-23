public class Casilla {

    // ATRIBUTOS
    Pieza pieza;
    int x;
    int y;

    // CONSTRUCTORES

    public Casilla(Pieza pieza, int x, int y) {
        this.pieza = pieza;
        this.x = x;
        this.y = y;
    }

    // METODOS

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
