import java.util.ArrayList;

public class Matriz2D {

    public static void main(String[] args) {

        int [][] numeros = {{2, 3, 4, 5}, {2, 3, 4, 5}, {2, 3, 4, 5}, {2, 3, 4, 5}};
        int sumaDiagonalPrincipal = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(i==j){
                    sumaDiagonalPrincipal += numeros[i][j];
                }
            }
        }

        System.out.println(sumaDiagonalPrincipal);

    }
}
