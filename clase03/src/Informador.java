public class Informador {

    void mostrarPorPantalla (int entero) {
        System.out.println("Mostrando el entero " + entero);
    }

    void mostrarPorPantalla (double decimal) {
        System.out.println("Mostrando el decimal " + decimal);
    }

    void mostrarPorPantalla (String palabra) {
        System.out.println("Mostrando la palabra " + palabra);
    }

    void mostrarPorPantalla(String palabra, double decimal) {
        System.out.println("Mostrando la palabra y número ingresado: " + palabra + " " + decimal);
    }

}
