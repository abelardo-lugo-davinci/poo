package figuraplana;

public class Cuadrado extends FiguraPlana {

    // ATRIBUTOS
    private double lado;

    // CONSTRUCTOR
    public Cuadrado(double lado){
        this.lado = lado;
    }

    // METODOS

    // Setters y Getters

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    // Sobre-escritura de métodos abstractos

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }

}
