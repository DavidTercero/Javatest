import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String nombre=" ";
        int edad;
        int cantidad;

        System.out.println("Ingrese la cantidad de estuiantes que se van a registrar:");
        cantidad=scanner.nextInt();

        Estudiante [] estudiantes=new Estudiante[cantidad];


        for (int i=0;i <cantidad;i++){

            scanner.nextLine();
            System.out.println("Ingrese el nombre del alumno ");
            nombre=scanner.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edad =scanner.nextInt();

            estudiantes[i]=new Estudiante(nombre,edad);
        }
        System.out.println("Estudiantes registados:");
        for (Estudiante estudiante:estudiantes){
            System.out.println("Nombre: "+ estudiante.getNombre());
            System.out.println("Edad: "+estudiante.getEdad());
        }
    }
}