public class Main {
    public static void main(String[] args) {
        GestionCursos gestionCursos = new GestionCursos();

        Curso curso1 = new Curso("CS101", "Introducción a la Programación");
        Curso curso2 = new Curso("CS102", "Estructuras de Datos");

        gestionCursos.agregarCurso(curso1);
        gestionCursos.agregarCurso(curso2);

        Estudiante estudiante1 = new Estudiante(1, "Alice", "alice@example.com");
        Estudiante estudiante2 = new Estudiante(2, "Bob", "bob@example.com");

        gestionCursos.inscribirEstudianteEnCurso("CS101", estudiante1);
        gestionCursos.inscribirEstudianteEnCurso("CS101", estudiante2);
        gestionCursos.inscribirEstudianteEnCurso("CS102", estudiante2);

        System.out.println("Listar todos los cursos:");
        gestionCursos.listarCursos();

        System.out.println("\nListar estudiantes en el curso CS101:");
        gestionCursos.listarEstudiantesEnCurso("CS101");

        System.out.println("\nListar estudiantes en el curso CS102:");
        gestionCursos.listarEstudiantesEnCurso("CS102");
    }
}
