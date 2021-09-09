public class Rectangulo extends FiguraPlana {

    // ATRIBUTOS
    double base;
    double altura;

    // CONSTRUCTORES
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // METODOS
    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*base + 2*altura;
    }

}
