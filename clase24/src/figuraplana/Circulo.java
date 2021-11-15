package figuraplana;

public class Circulo extends FiguraPlana {

    // ATRIBUTOS
    private double radio;

    // CONSTRUCTOR
    public Circulo(double radio){
        this.radio = radio;
    }

    // METODOS

    // Setters y Getters

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    // Sobre-escritura de métodos abstractos

    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
        // return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }

}
