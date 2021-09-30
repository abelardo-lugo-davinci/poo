import java.util.ArrayList;
import java.util.Collections;

public class EjemploMetodosColecciones {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();
        System.out.println(nombres);
        Collections.addAll(nombres, "Pablo", "Pedro", "Matias", "Gabriel", "Hernán");
        System.out.println(nombres);
        Collections.sort(nombres);
        System.out.println(nombres);
        Collections.reverse(nombres);
        System.out.println(nombres);
        nombres.set(1, "Omar");
        System.out.println(nombres);
        nombres.clear();
        System.out.println(nombres);

    }
}
