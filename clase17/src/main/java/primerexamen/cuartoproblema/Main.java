package primerexamen.cuartoproblema;

// Composición de Objetos

public class Main {

    public static void main(String[] args) {

        Punto origen = new Punto();
        System.out.println(origen);

        Punto primerPunto = new Punto(5, 12);
        System.out.println(primerPunto);
        System.out.println(primerPunto.getX());
        System.out.println(primerPunto.getY());

        Punto segundoPunto = new Punto(3, 4);
        System.out.println(segundoPunto);
        // System.out.println(segundoPunto.distanciaAlOrigen());

        // System.out.println(primerPunto.distanciaOtroPunto(3,4));
        // System.out.println(primerPunto.distanciaOtroPunto(segundoPunto.getX(), segundoPunto.getY()));
        // System.out.println(primerPunto.distanciaOtroPunto(segundoPunto));
        // System.out.println(segundoPunto.distanciaOtroPunto(primerPunto));

        // System.out.println(primerPunto.distanciaOtroPunto(primerPunto));
        // System.out.println(segundoPunto.distanciaOtroPunto(segundoPunto));

        Punto tercerPunto = new Punto(4,11);
        primerPunto.trasladarPunto(tercerPunto);
        System.out.println(primerPunto);

        Rectangulo primerRectangulo = new Rectangulo(origen, segundoPunto);
        Rectangulo segundoRectangulo = new Rectangulo(0,0, 5,5);

        System.out.println(primerRectangulo);
        System.out.println(primerRectangulo.calcularArea());

        System.out.println(segundoRectangulo);
        System.out.println(segundoRectangulo.calcularPerimetro());

    }

}
