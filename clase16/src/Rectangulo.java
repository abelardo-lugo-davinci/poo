public class Rectangulo {

    // ATRIBUTOS
    Punto punto1;
    Punto punto3;

    // CONSTRUCTORES

    public Rectangulo(Punto punto1, Punto punto3) {
        this.punto1 = punto1;
        this.punto3 = punto3;
    }

    public Rectangulo(double x1, double y1, double x3, double y3) {
        this.punto1 = new Punto(x1, y1);
        this.punto3 = new Punto(x3, y3);
    }

    // METODOS

    // Getters y Setters

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    // Métodos matemáticos

    public double calcularArea() {
        return Math.abs(this.punto3.getX()-this.punto1.getX())*Math.abs(this.punto3.getY()-this.punto1.getY());
    }

    public double calcularPerimetro(){
        return 2*Math.abs(this.punto3.getX()-this.punto1.getX()) + 2*Math.abs(this.punto3.getY()-this.punto1.getY());
    }

    // Sobrescribimos el método toString de la clase Object

    @Override
    public String toString() {
        return "El rectángulo tiene coordenadas: ( "
                + this.punto1.getX() + " , " + this.punto1.getY() + " ) ; ( "
                + this.punto3.getX() + " , " + this.punto3.getY() + " )";
    }

}
