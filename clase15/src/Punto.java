public class Punto {

    /*
    Instancia objetos llamados puntos en el plano cartesiano
    una componente en el eje x y otra componente en el eje Y
     */

    // ATRIBUTOS
    double x;
    double y;

    // CONSTRUCTORES

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(double x) {
        // this(x,0);
        this.x = x;
        // this.y = 0;
    }

    public Punto() {
        // this.x = 0;
        // this.y = 0;
    }

    // METODOS

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanciaAlOrigen(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double distanciaOtroPunto(double x, double y){
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
    }

    public double distanciaOtroPunto(Punto otroPunto){
        return Math.sqrt(Math.pow(this.x-otroPunto.getX(),2) + Math.pow(this.y-otroPunto.getY(),2));
    }

}

