import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        int opcion = 0;
        double resultado = 0;
        String regresar;

        Calculadora calculadora = new Calculadora();

        try {
            System.out.println("***CALCULADORA***");
            do {
                System.out.println("Teclea la opción: ");
                System.out.println("1. Suma ");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                opcion = scanner.nextInt();

                System.out.println("Teclea el primer número: ");
                a = scanner.nextDouble();
                System.out.println("Teclea el segundo número: ");
                b = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = calculadora.sumar(a, b);
                        break;
                    case 2:
                        resultado = calculadora.restar(a, b);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar(a, b);
                        break;
                    case 4:
                        resultado = calculadora.dividir(a, b);
                        break;
                    default:
                        break;
                }

                System.out.println("El resultado de la operación es: "+ resultado);
                System.out.println("¿Quieres realizr otra operación?S/N");
                regresar=scanner.next();

            } while (regresar.equals("S") || regresar.equals("s"));

        }
        catch(RuntimeException e) {
            System.out.println("Algo salió mal en el programa");
        }
        finally{
            scanner.close();
        }
    }
}