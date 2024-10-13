import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Numeración del 1 al 100 utilizando while: ");
        int num = 1;
        while (num <= 100) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

        System.out.println("Numeración del 1 al 100 utilizando for: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        divisibles.DivisiblesDosTres();

    }
}


