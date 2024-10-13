public class divisibles {
    public static void DivisiblesDosTres() {
        System.out.println("Números del 1 al 100 divisibles entre 2 y 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

