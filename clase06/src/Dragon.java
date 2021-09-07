public class Dragon extends Enemigo {

    public Dragon(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }

    public Dragon() {
    }

    @Override
    public void moverY(int pasos) {
        posicionY += (5*pasos);
    }
}
