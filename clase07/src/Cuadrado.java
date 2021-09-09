public class Cuadrado extends FiguraPlana {

    // ATRIBUTOS
    double lado;

    // CONSTRUCTOR
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // METODOS
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }
}
