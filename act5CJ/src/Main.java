import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] valor=new float[3];
        float[] Op=new float[4];
        valor[0]=0f;
        valor[1]=0f;
        valor[2]=0f;

        System.out.print("Ingrese el primer valor: ");
        valor[0]=scanner.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        valor[1]=scanner.nextFloat();
        System.out.print("Ingrese el tercer valor: ");
        valor[2]=scanner.nextFloat();

        //for(int i=0; i<valor.length; i++){
        //System.out.println("El valor " + (i+1) + " es igual a valor["i+"] ="+ valor[i];

        System.out.println("El primer valor es: "+valor[0]);
        System.out.println("El segundo valor es: "+valor[1]);
        System.out.println("El tercer valor es: "+valor[2]);

        Op[0]=(valor[0]+valor[1])-valor[2];
        Op[1]=(valor[1]-valor[2])*valor[0];
        Op[2]=(valor[0]*valor[1])*valor[2];
        Op[3]=(valor[2]/valor[0])+valor[1];

        for(int i=0; i<Op.length; i++){
            System.out.println("El resultado de la  operación " + (i+1) + " es: "+ Op[i]);
        }

        }
    }