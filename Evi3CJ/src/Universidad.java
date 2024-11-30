import java.util.HashMap;

public class Universidad implements Imprimir {
    private HashMap<String, Estudiante>estudiantes;
    private HashMap<String, Materia>materias;

    public Universidad(){
        estudiantes=new HashMap<>();
        materias=new HashMap<>();
    }

    public HashMap<String, Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(HashMap<String, Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public HashMap<String, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<String, Materia> materias) {
        this.materias = materias;
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.put(estudiante.getNombre(), estudiante);
    }

    public void agregarMateria(Materia materia){
        materias.put(materia.getNomMateria(), materia);
    }
    @Override
    public void imprimir() {
        for(Estudiante estudiante: estudiantes.values()){
            estudiante.mostrarInfo();
        }
    }
}
