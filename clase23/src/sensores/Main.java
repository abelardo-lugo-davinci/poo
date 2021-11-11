package sensores;

public class Main {
    public static void main(String[] args) {

        SensorSeguro sensorSeguro = new SensorSeguro(4, 3);

        System.out.println(sensorSeguro.getPresion());

    }
}
