import java.util.ArrayList;

public class Estudiante extends Usuario {

    // ATRIBUTOS
    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasInscriptas = new ArrayList<>();

    // CONSTRUCTORES

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    // MÉTODOS

    // Getters y Setters

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    // Métodos abstractos
    // @Override
    // public void metodoAbstracto(){}

    // Métodos

    public void imprimirMateriasAprobadas(){
        System.out.println("Materias Aprobadas");
        for (int i = 0; i < materiasAprobadas.size(); i++) {
            System.out.println(materiasAprobadas.get(i));
        }
    }

    public void imprimirMateriasInscriptas(){
        System.out.println("Materias Inscriptas");
        for (int i = 0; i < materiasInscriptas.size(); i++) {
            System.out.println(materiasInscriptas.get(i));
        }
    }

}
