public class Calculadora {
    public double sumar(double a, double b) {
        return a + b;
    }

    public  double restar(double a, double b) {
        return a - b;
    }

    public  double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b)throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }
}
