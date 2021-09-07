public class Main {
    public static void main(String[] args) {
/*

        Juego primerJuego = new Juego();
        Juego.Contador primerContador = primerJuego.new Contador();

        System.out.println(primerJuego.obtenerPuntuacion());
        primerContador.incrementarPuntuacion(60);
        System.out.println(primerJuego.obtenerPuntuacion());

        primerContador.decrementarPuntuacion(40);

        int puntajePrimeraMitad = primerJuego.obtenerPuntuacion();
        System.out.println(puntajePrimeraMitad);
*/

        Personaje primerPersonaje = new Personaje(200, 0, 10);
        primerPersonaje.aumentarPuntosDeVida(60);
        System.out.println(primerPersonaje.puntosDeVida);
        primerPersonaje.mensaje();

        PersonajePrincipal primerProtagonista = new PersonajePrincipal(400, 0, 0);
        PersonajePrincipal segundoProtagonista = new PersonajePrincipal();

        segundoProtagonista.aumentarPuntosDeVida(300);
        System.out.println(segundoProtagonista.puntosDeVida);
        primerProtagonista.mensaje();
        primerProtagonista.aumentarPuntosDeVida(50);
        System.out.println(primerProtagonista.puntosDeVida);
        primerProtagonista.moverMasRapidoX(40);
        System.out.println(primerProtagonista.posicionX);



    }
}
