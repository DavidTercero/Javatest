import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String marcaT;
        String modeloT;
        int anioT=0;
        String marcaA;
        String modeloA;
        int anioA=0;
        int motoresA;

        System.out.print("Ingrese la marca del vehículo terrestre: ");
        marcaT=scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo terrestre: ");
        modeloT=scanner.nextLine();
        System.out.print("Ingrese el año de fabricación del vehículo terrestre: ");
        anioT=scanner.nextInt();
        scanner.nextLine();
        VehiculoTerrestre vt=new VehiculoTerrestre(marcaT,modeloT,anioT);

        System.out.print("Ingrese la marca del vehículo acuatico: ");
        marcaA=scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo acuatico: ");
        modeloA=scanner.nextLine();
        System.out.print("Ingrese el año de fabricación del vehículo acuatico: ");
        anioA=scanner.nextInt();
        System.out.print("Ingrese el número de motores del vehículo acuatico: ");
        motoresA=scanner.nextInt();
        VehiculoAcuatico va=new VehiculoAcuatico(marcaA,modeloA,anioA,motoresA);

        System.out.println(vt.mostrarMensaje());
        System.out.println(va.mostrarMensaje());

        scanner.close();
    }
}