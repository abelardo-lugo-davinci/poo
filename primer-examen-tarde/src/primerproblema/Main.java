package primerproblema;

public class Main {

    public static void main(String[] args) {

        Punto3D primerPunto = new Punto3D(0,1,2);
        Punto3D segundoPunto = new Punto3D(2,1,0);
        Punto3D tercerPunto = new Punto3D(1);

        System.out.println(primerPunto);
        System.out.println(segundoPunto);
        System.out.println(tercerPunto);

        System.out.println(segundoPunto.distanciaDesdeOrigen());
        System.out.println(segundoPunto.distanciaDesdeOtroPunto(0,0,0));
        System.out.println(segundoPunto.distanciaDesdeOtroPunto(primerPunto));

        Vector3D primerVector = new Vector3D(primerPunto, segundoPunto);
        Vector3D segundoVector = new Vector3D(tercerPunto);

        System.out.println(primerVector);
        primerVector.mostrarComponentes();
        System.out.println(primerVector.magnitudVector());
        System.out.println(segundoVector);
        segundoVector.mostrarComponentes();
        System.out.println(segundoVector.magnitudVector());

    }
}
