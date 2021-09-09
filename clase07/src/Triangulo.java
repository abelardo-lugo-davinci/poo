public class Triangulo extends FiguraPlana {

    // ATRIBUTOS
    double primerLado;
    double segundoLado;
    double tercerLado;

    // CONSTRUCTORES
    public Triangulo(double primerLado, double segundoLado, double tercerLado) {
        this.primerLado = primerLado;
        this.segundoLado = segundoLado;
        this.tercerLado = tercerLado;
    }

    // METODOS

    @Override
    public double calcularArea() {
        double semiPerimetro = (primerLado + segundoLado + tercerLado)/2;
        return Math.sqrt(semiPerimetro*(semiPerimetro-primerLado)*(semiPerimetro-segundoLado)*(semiPerimetro-tercerLado));
    }

    @Override
    public double calcularPerimetro() {
        return primerLado + segundoLado + tercerLado;
    }

}
