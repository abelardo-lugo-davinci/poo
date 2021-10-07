public class Main {

    public static void main(String[] args) {

        Punto primerPunto = new Punto(5, 12);
        System.out.println(primerPunto.getX());
        System.out.println(primerPunto.getY());

        Punto segundoPunto = new Punto(3, 4);

        System.out.println(primerPunto.distanciaAlOrigen());

        System.out.println(primerPunto.distanciaOtroPunto(3,4));
        System.out.println(primerPunto.distanciaOtroPunto(segundoPunto.getX(), segundoPunto.getY()));

        System.out.println(primerPunto.distanciaOtroPunto(segundoPunto));
        System.out.println(primerPunto.distanciaOtroPunto(primerPunto));

    }

}
