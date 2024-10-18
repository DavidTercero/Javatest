public class Curp {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String fechaNacimiento;
    String sexo;
    String claveEntidadFederativa;
    String homoclave;

    public Curp(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String sexo, String claveEntidadFederativa) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.claveEntidadFederativa = claveEntidadFederativa;

    }

    public String getCurp() {
        String curp = " ";
        curp=curp + apellidoPaterno.substring(0,1);
        curp=curp+ getPrimeraVocalApellido();
        curp=curp+ apellidoMaterno.substring(0,1);
        curp=curp+getPrimeraVocalApellido();
        curp=curp+nombre.substring(0,1);
        curp=curp+fechaNacimiento.substring(8,10);
        curp=curp+fechaNacimiento.substring(3,5);
        curp=curp+fechaNacimiento.substring(0,2);
        curp=curp+sexo;
        curp=curp+claveEntidadFederativa;
        curp=curp+getPrimerConsonanteApellido();
        curp=curp+getSegundaConsonante(apellidoPaterno);
        curp=curp+getSegundaConsonante(apellidoMaterno);
        curp=curp+getSegundaConsonante(nombre);
        curp=curp+"01";

        return curp;


    }
    public String getPrimeraVocalApellido(){
        String primeraVocal=" ";
        for (int i=0;i<apellidoPaterno.length();i++){
            char letra=apellidoPaterno.charAt(i);
            if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u');
            primeraVocal=String.valueOf(letra);
            break;
        }
        return primeraVocal;
    }
    public String getPrimerConsonanteApellido(){
        String primerConsonante=" ";
        for(int i=0;i<apellidoPaterno.length();i++){
            char letra=apellidoPaterno.charAt(i);
            if (letra !='a' && letra !='e' && letra !='i'&& letra !='o' && letra !='u');
            primerConsonante=String.valueOf(letra);
            break;
        }
        return primerConsonante;
    }
    public String getSegundaConsonante(String cadena){
        String segundaConstante=" ";
        int contador=0;
        for(int i=0;i<cadena.length();i++) {
            char letra = cadena.charAt(i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                contador++;
                if (contador > 0) {
                    segundaConstante = String.valueOf(letra);
                    break;
                }
            }
        }
        return segundaConstante;
    }
}