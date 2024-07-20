import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para añadir un empleado
    public void anadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para eliminar un empleado por id
    public void eliminarEmpleado(int idEmpleado) {
        empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
