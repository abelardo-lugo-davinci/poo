public class PasoPorReferencia {

    public static void main(String[] args) {

        int numero1 = 54;
        int numero2 = numero1;

        System.out.println(numero1);
        System.out.println(numero2);

        numero2 = 32;

        System.out.println(numero1);
        System.out.println(numero2);



    }

}
