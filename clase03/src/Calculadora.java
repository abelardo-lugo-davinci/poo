public class Calculadora {

        double calcularAreaCirculo(double radio) {
            return Math.PI * radio * radio;
        }

        double calcularAreaRectangulo(double altura, double base) {
            return base * altura;
        }

        double promedio(double ... numeros){
            if (numeros.length == 0 ){
                return 0;
            }
            double sumatoria = 0;
            for (int i = 0; i < numeros.length; i ++) {
                sumatoria += numeros[i];
            }
            return sumatoria / numeros.length;
        }

}
