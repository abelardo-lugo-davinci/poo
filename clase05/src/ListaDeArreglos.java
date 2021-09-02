import java.util.ArrayList;

public class ListaDeArreglos {
    public static void main(String[] args) {

        ArrayList<String> primerArreglo = new ArrayList<String>();
        System.out.println(primerArreglo);
        primerArreglo.add("Real Madrid");
        System.out.println(primerArreglo);
        primerArreglo.add("Barcelona");
        System.out.println(primerArreglo);
        primerArreglo.add(2,"Valencia");
        System.out.println(primerArreglo);
        primerArreglo.add(1, "Real Sociedad");
        System.out.println(primerArreglo);
        primerArreglo.set(1, "Real Betis");
        System.out.println(primerArreglo);
        System.out.println(primerArreglo.indexOf("Real Madrid"));

        for (int i = 0; i < primerArreglo.size(); i++) {
            System.out.println("El " + primerArreglo.get(i) + " quedo en la posición " + (i+1));
        }

        // primerArreglo.remove(1);
        // System.out.println(primerArreglo);



        /*
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i <= 20 ; i++) {
            numeros.add(i);
        }

        numeros.removeIf(numero -> (numero%2 == 0));
        System.out.println(numeros);

        for (int numero: numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros);
*/
/*

        ArrayList<String> primeraLista = new ArrayList<>();
        primeraLista.add("Primer Elemento");
        primeraLista.add("Segundo Elemento");
        primeraLista.add("Tercer Elemento");

        System.out.println(primeraLista);

        for (String elemento: primeraLista) {
            System.out.println(elemento);
        }
*/

    }

}
