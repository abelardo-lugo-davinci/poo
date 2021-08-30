public class ArraysDeUnaDimension {
    public static void main(String[] args) {

        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0] = "Lunes";
        diasDeLaSemana[1] = "Martes";
        diasDeLaSemana[2] = "Miercoles";
        diasDeLaSemana[3] = "Jueves";
        diasDeLaSemana[4] = "Viernes";
        diasDeLaSemana[5] = "Sábados";
        diasDeLaSemana[6] = "Domingo";

        System.out.println("El primer día de la semana " + diasDeLaSemana[0]);

        int numeros[] = {40, 34, 56, 37, 23, 12, 13};
        int minimo = numeros[0];
        int maximo = numeros[0];

        for ( int i = 0; i <= numeros.length - 1; i++ ) {
            if(numeros[i] < minimo){
                minimo = numeros[i];
            }
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
        }

        System.out.println(minimo);
        System.out.println(maximo);

        for (String diaDeLaSemana: diasDeLaSemana) {
            System.out.print(diaDeLaSemana + " ");
        }

    }
}
