import java.util.ArrayList;

public class GestionCursos {
    private ArrayList<Curso> cursos;

    public GestionCursos() {
        this.cursos = new ArrayList<>();
    }

    // Método para agregar un curso
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Método para inscribir un estudiante en un curso
    public void inscribirEstudianteEnCurso(String codigoCurso, Estudiante estudiante) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                curso.inscribirEstudiante(estudiante);
                return;
            }
        }
        System.out.println("Curso con código " + codigoCurso + " no encontrado.");
    }

    // Método para listar estudiantes inscritos en un curso específico
    public void listarEstudiantesEnCurso(String codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                System.out.println("Estudiantes inscritos en el curso " + curso.getNombre() + ":");
                curso.listarEstudiantes();
                return;
            }
        }
        System.out.println("Curso con código " + codigoCurso + " no encontrado.");
    }

    // Método para listar todos los cursos
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
}
