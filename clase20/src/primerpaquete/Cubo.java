package primerpaquete;

public class Cubo extends FiguraTridimensional{

    // ATRIBUTOS
    public double arista;

    // CONSTANTE
    static final int CARAS = 6;

    // CONSTRUCTORES

    public Cubo(double arista) {
        this.arista = arista;
    }

    public Cubo() {
        // this(1);
        this.arista = 1;
    }

    // Getters y Setters

    public double getArista(){
        return this.arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    // Definición de los métodos abstractos heredados

    @Override
    public double calcularVolumen() {
        return Math.pow(arista,3);
    }

    @Override
    public double calcularArea() {
        return 6*Math.pow(arista,2);
    }

    // Método toString

    @Override
    public String toString() {
        return "La figura es un " + this.getClass().getSimpleName();
    }

    public String dimensiones(){
        return "Esta figura tiene " + this.dimensiones;
    }

}
