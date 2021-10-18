package primerexamen.cuartoproblema;

public class Punto {

    /*
    Instancia objetos llamados puntos en el plano cartesiano
    una componente en el eje x y otra componente en el eje Y
     */

    // ATRIBUTOS
    private double x;
    private double y;

    // CONSTRUCTORES

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(double z) {
        // this(z,z);
        this.x = z;
        this.y = z;
    }

    public Punto() {
        // this.x = 0;
        // this.y = 0;
    }

    // METODOS

    // Getters y Setters

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

    // Métodos matemáticos de la clase

    public double distanciaAlOrigen(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double distanciaOtroPunto(double x, double y){
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
    }

    public double distanciaOtroPunto(Punto otroPunto){
        return Math.sqrt(Math.pow(this.x-otroPunto.getX(),2) + Math.pow(this.y-otroPunto.getY(),2));
    }

    public void trasladarPunto(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void trasladarPunto(Punto otroPunto) {
        this.x += otroPunto.getX();
        this.y += otroPunto.getY();
    }

    public void invertirPunto(){
        this.x *= -1;
        this.y *= -1;
    }

    // Sobrescribimos el método toString de la clase Object


    @Override
    public String toString() {
        return "El punto tiene coordenadas: ( " + this.x + " , " + this.y + " )";
    }

}

