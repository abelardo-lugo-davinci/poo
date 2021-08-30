public class ArraysMultidimensionales {
    public static void main(String[] args) {

        int arregloDeDosDimensiones[][] = new int[10][10];

        for (int i = 0; i <= arregloDeDosDimensiones.length - 1 ; i++) {
            for (int j = 0; j <= arregloDeDosDimensiones[i].length - 1; j++) {
                arregloDeDosDimensiones[i][j] = i * j;
            }
        }

        for (int i = 0; i <= arregloDeDosDimensiones.length -1; i++) {
            for (int j = 0; j <= arregloDeDosDimensiones[i].length -1; j++) {
                System.out.print(arregloDeDosDimensiones[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] tablaNumero: arregloDeDosDimensiones) {
            for (int numero: tablaNumero) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }

    }
}
