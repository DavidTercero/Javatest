import java.util.HashMap;

public class Materia {
    private String nomMateria;
    private double calificacion;

    public Materia(String nomMateria, double calificacion) {
        this.nomMateria = nomMateria;
        this.calificacion = calificacion;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}