package figuraplana;

public class Rectangulo extends FiguraPlana {

    // ATRIBUTOS
    private double base;
    private double altura;

    // CONSTRUCTOR
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    // METODOS

    // Setters y Getters

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    // Sobre-escritura de métodos abstractos

    @Override
    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }

}
