import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tablero primerTablero = new Tablero();
        primerTablero.imprimirTablero();

        Juego primerJuego = new Juego();

        EstadoDelJuego estadoDelJuego = EstadoDelJuego.ACTIVO;
        System.out.println(estadoDelJuego);

        System.out.println(primerJuego.getTablero().getCasillas()[1][1].getPieza().getClass().getSimpleName());

    }
}
