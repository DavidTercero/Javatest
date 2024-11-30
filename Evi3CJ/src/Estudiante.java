import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Estudiante {
private String nombre;
private int edad;
private List<Materia> calificaciones;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones=new ArrayList<>();
    }

    public void agregarCalificacion(Materia materia) throws CalificacionInvalidad{
        if(materia.getCalificacion()<0||materia.getCalificacion()>10){
            throw new CalificacionInvalidad("CALIFICACIÓN INVALIDA"+materia);
        }
        calificaciones.add(materia);
    }

    public double calcularPromedio(){
        double suma=0;
        for(Materia materia: calificaciones){
            suma=suma+ materia.getCalificacion();
        }
        return suma/calificaciones.size();
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Promedio: "+calcularPromedio());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Materia> getCalificaciones() {
        return (ArrayList<Materia>) calificaciones;
    }

    public void setCalificaciones(HashMap<String, Materia> calificaciones) {
        this.calificaciones = (List<Materia>) calificaciones;
    }

    @Override
    public String toString(){
        return"Nombre: " + nombre + "\tEdad: "+ edad + "\tCalificación: " + calificaciones ;
    }
}
