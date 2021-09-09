public class Enemigo extends Personaje {

    // CONSTRUCTOR
    public Enemigo(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }


    @Override
    public void mensaje() {
        System.out.println("Voy a destruirlos todos");
    }

}
