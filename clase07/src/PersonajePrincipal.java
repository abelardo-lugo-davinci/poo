public class PersonajePrincipal extends Personaje {

    public PersonajePrincipal(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }

    public PersonajePrincipal(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    public PersonajePrincipal() {
    }

    @Override
    public void mensaje() {
        System.out.println("Voy a ganar esta batalla");
    }

    public void moverMasRapidoX (int pasos) {
        posicionX += 3*pasos;
    }

    public void moverMasRapidoY (int pasos) {
        posicionY += 3*pasos;
    }

}
