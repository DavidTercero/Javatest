import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);

    }

    public void mostrarLibro(){
        if(libros.isEmpty()){
            System.out.println("No hay libros");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}

