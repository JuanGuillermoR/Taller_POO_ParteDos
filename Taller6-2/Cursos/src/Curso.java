import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void listarEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
