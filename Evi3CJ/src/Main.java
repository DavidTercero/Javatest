import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nombre;
        int edad;
        double calificacion;
        int opcion=0;
        Universidad universidad=new Universidad();
        do{
            System.out.println("MENÚ DE LA UNIVERSIDAD");
            System.out.println("1.Agregar Estudiante");
            System.out.println("2 Agregar Materias");
            System.out.println("3.Mostrar toda la información");
            System.out.println("4.Buscar estduiante");
            System.out.println("4.Salir");
            opcion=scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Agregar estdudiante");
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre=scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    edad=scanner.nextInt();
                    scanner.nextLine();
                    Estudiante estudiante=new Estudiante(nombre, edad);
                    break;
                case 2:
                    System.out.println("Agregar materia");
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    Estudiante est = universidad.getEstudiantes().get(nombre);
                    if (est != null) {
                        System.out.print("Nombre materia: ");
                        String nomMateria = scanner.nextLine();
                        System.out.print("Calificación: ");
                        calificacion = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar el buffer

                        try {
                            Materia materia = new Materia(nomMateria, calificacion);
                            est.agregarCalificacion(materia);
                            universidad.agregarMateria(materia);
                        } catch (CalificacionInvalidad e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    universidad.imprimir();
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    Estudiante buscado = universidad.getEstudiantes().get(nombre);
                    if (buscado != null) {
                        buscado.mostrarInfo();
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }while(opcion==1|| opcion==2||opcion==3);
    }
}