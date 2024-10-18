import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String fechaNacimiento;
        String sexo;
        String entidadFederativa;
        int seleccion;
        String clave;
        String nombreEntidad = "";
        String curp;

        System.out.println("CREADOR DE CURP");

        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("Nombre (s): ");
        nombre = scanner.nextLine();
        System.out.println("Apellido Paterno: ");
        apellidoPaterno = scanner.nextLine();
        System.out.println("Apellido Materno: ");
        apellidoMaterno = scanner.nextLine();
        System.out.println("Fecha de nacimiento (dd/mm/aaaa)");
        fechaNacimiento = scanner.nextLine();
        System.out.println("Sexo (H/M): ");
        sexo = scanner.nextLine();

        EntidadFederativa entidadFederativa1=new EntidadFederativa();
        entidadFederativa1.mostrarCatalogo();
        System.out.println("Seleccione la entidad federativa en la que nació");
        seleccion = scanner.nextInt();
        clave=entidadFederativa1.getClaveEntidad(seleccion);
        System.out.println("Clave de Entidad Federativa: "+ clave);
        System.out.println("Nombre Entidad Federativa: " + nombreEntidad);
        Curp curp1=new Curp(nombre,apellidoPaterno,apellidoMaterno,fechaNacimiento,sexo,clave);
        System.out.println("Su CURP es: "+curp1.getCurp());

    }
}
