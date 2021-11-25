public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor(10, "John", "Doe");
        Estudiante estudiante = new Estudiante(20, "Matías", "Fernández", "Analista");

        estudiante.getMateriasAprobadas().add("POO");
        estudiante.getMateriasAprobadas().add("Programación");

        estudiante.getMateriasInscriptas().add("Base de Datos");
        estudiante.getMateriasInscriptas().add("Producción Web");

        System.out.println(profesor);
        System.out.println(estudiante);

        estudiante.imprimirMateriasAprobadas();
        estudiante.imprimirMateriasInscriptas();

    }
}
