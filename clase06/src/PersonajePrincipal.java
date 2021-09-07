public class PersonajePrincipal extends Personaje{

    public PersonajePrincipal(int puntosDeVida, int posicionX, int posicionY) {
        super(puntosDeVida, posicionX, posicionY);
    }

    public PersonajePrincipal() {
    }

    @Override
    public void mensaje() {
        System.out.println("Soy el personaje más poderoso");
    }

    @Override
    public void aumentarPuntosDeVida(int puntos) {
        puntosDeVida += (2*puntos);
    }

    public void moverMasRapidoX (int pasos) {
        posicionX += 3*pasos;
    }

}
