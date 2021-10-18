package primerexamen.primerproblema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusquedaLineal {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println(numeros);
        Collections.addAll(numeros, 5, 1, 1, 9, 7, 2, 6, 10);
        System.out.println(numeros);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número");
        int valorBuscado;
        valorBuscado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.indexOf(i) == valorBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número está en el arreglo");
        } else {
            System.out.println("El número no está en el arreglo");
        }

    }

}