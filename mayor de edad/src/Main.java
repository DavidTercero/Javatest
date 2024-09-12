import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu edad? ");
        int age = scanner.nextInt();
        String mayor = "es mayor de edad";
        String menor = "es menor de edad";
        String resultado = "";
        System.out.println("Operador ternario en Java");

        resultado = (age >= 18) ? mayor : menor;
        System.out.println(resultado);
    }
}