import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Agenda agenda=new Agenda();
        int opcion=0;
        String nombre;
        String telefono;
        do{
            System.out.println("MENU");
            System.out.println("1. agregar contacto");
            System.out.println("2. buscar contacto");
            System.out.println("3. mostrar los contactos");
            System.out.println("4. salir");
            System.out.println("¿Quieres elegir otra opción?");
            opcion=scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Agregar contacto");
                    System.out.println("Ingrese el nombre");
                    nombre=scanner.nextLine();
                    System.out.println("Ingrese el teléfono");
                    telefono=scanner.nextLine();
                    Contacto contacto=new Contacto(nombre,telefono);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    System.out.println("Buscar contacto");
                    System.out.println("Ingrese el nombre del contacto");
                    nombre=scanner.nextLine();
                    Contacto contactoEncontrar=agenda.buscarContacto(nombre);
                    if(contactoEncontrar!=null){
                        System.out.println("Contacto encontrado: "+contactoEncontrar);
                    } else{
                        System.out.println("No se encontró");
                    }
                    break;
                case 3:
                    System.out.println("Mostrar contactos");
                    agenda.mostrarContacto();
                    break;
                default:
                    System.out.println("SALIENDO DEL SISTEMA");
                    break;
            }
        }while(opcion==1|| opcion==2||opcion==3);
        scanner.close();
    }
}