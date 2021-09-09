public class Main {
    public static void main(String[] args) {

        Personaje primerPersonaje = new Personaje();
        System.out.println(primerPersonaje.puntosDeVida);
        primerPersonaje.mensaje();

        PersonajePrincipal primerPersonajePrincipal = new PersonajePrincipal();
        System.out.println(primerPersonajePrincipal.puntosDeVida);
        primerPersonajePrincipal.mensaje();

        System.out.println(primerPersonaje.posicionX);
        primerPersonaje.moverPosicionX(5);
        System.out.println(primerPersonaje.posicionX);

        System.out.println(primerPersonajePrincipal.posicionX);
        primerPersonajePrincipal.moverMasRapidoX(5);
        System.out.println(primerPersonajePrincipal.posicionX);

    }
}
