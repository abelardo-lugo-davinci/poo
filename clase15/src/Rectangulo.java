public class Rectangulo {

    // ATRIBUTOS
    Punto punto1;
    Punto punto3;

    // CONSTRUCTORES

    public Rectangulo(Punto punto1, Punto punto3) {
        this.punto1 = punto1;
        this.punto3 = punto3;
    }

    // METODOS

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

    public double calcularArea() {
        Punto punto2 = new Punto(punto3.getX(),punto1.getY());
        Punto punto4 = new Punto(punto1.getX(), punto3.getY());
        return punto1.distanciaOtroPunto(punto2)*punto1.distanciaOtroPunto(punto4);
    }

    public double calcularPerimetro(){
        Punto punto2 = new Punto(punto3.getX(),punto1.getY());
        Punto punto4 = new Punto(punto1.getX(), punto3.getY());
        return 2*punto1.distanciaOtroPunto(punto2)+2*punto1.distanciaOtroPunto(punto4);
    }

}
