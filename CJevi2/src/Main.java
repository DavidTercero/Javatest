import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String titulo;
        String autor;
        int publicacion;
        int opcionMenu;
        String regresar;


            do {
                System.out.println("BIBLIOTECA");
                System.out.println("Selecciona la opcion de tu preferencia: ");
                System.out.println("1. Agregar libro ");
                System.out.println("2. Mostrar libros ");
                System.out.println("3. Salir");
                opcionMenu = scanner.nextInt();

                switch (opcionMenu) {
                    case 1:
                        System.out.println("1. Agregar libro: ");
                        System.out.print("Título: ");
                        titulo = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Autor: ");
                        autor = scanner.nextLine();
                        System.out.print("Año de Publicación: ");
                        publicacion = scanner.nextInt();


                        Libro libro1 = new Libro(titulo, autor, publicacion);


                        biblioteca.agregarLibro(libro1);

                        break;
                    case 2:
                        System.out.println("LIBROS DISPONIBLES ");
                        biblioteca.mostrarLibro();
                        break;
                    case 3:
                        System.out.println("HA SALIDO CON ÉXITO");
                        break;
                }
                do {
                    System.out.println("¿Quieres realizar otra operación? S/N");
                    regresar = scanner.next();

                } while (opcionMenu > 3 || opcionMenu < 1);
            } while (regresar.equalsIgnoreCase("S"));
        }

    }
