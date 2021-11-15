package figuraplana;

public class Main {

    public static void main(String[] args) {

        Rectangulo primerRectangulo = new Rectangulo(4, 5);
        System.out.println(primerRectangulo.getBase());
        System.out.println(primerRectangulo.getAltura());
        System.out.println(primerRectangulo.calcularArea());
        System.out.println(primerRectangulo.calcularPerimetro());

        Circulo primerCirculo = new Circulo(3);
        System.out.println(primerCirculo.getRadio());
        System.out.println(primerCirculo.calcularArea());
        System.out.println(primerCirculo.calcularPerimetro());

        Cuadrado primerCuadrado = new Cuadrado(3);
        System.out.println(primerCuadrado.getLado());
        System.out.println(primerCuadrado.calcularArea());
        System.out.println(primerCuadrado.calcularPerimetro());

    }
}
