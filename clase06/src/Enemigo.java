public class Enemigo extends Personaje {

    public Enemigo(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }

    public Enemigo() {
    }

    @Override
    public void mensaje() {
        System.out.println("Vamos a destruir todo");
    }

}
