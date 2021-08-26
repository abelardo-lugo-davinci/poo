import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número entero: ");
        int numeroIntroducido = scanner.nextInt();

        if (numeroIntroducido < 0) {
            System.out.println("Numero negativo");
        } else if (numeroIntroducido <= 50){
            System.out.println("Numero positivo y menor o igual que 50");
        } else if (numeroIntroducido <= 1000){
            System.out.println("Numero mayor que 50 y menor o igual que 1000");
        } else {
            System.out.println("Numero es mayor que 1000");
        }

    }
}
