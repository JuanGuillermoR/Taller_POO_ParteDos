public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        EmpleadoTemporal empTemp = new EmpleadoTemporal("Juan", 25, 1, 1500.00, 6);
        EmpleadoPermanente empPerm = new EmpleadoPermanente("Maria", 30, 2, 2500.00, "Finanzas");

        gestionEmpleados.anadirEmpleado(empTemp);
        gestionEmpleados.anadirEmpleado(empPerm);

        System.out.println("Listar todos los empleados:");
        gestionEmpleados.mostrarEmpleados();

        System.out.println("\nEliminar empleado con id 1");
        gestionEmpleados.eliminarEmpleado(1);

        System.out.println("\nListar todos los empleados después de eliminar:");
        gestionEmpleados.mostrarEmpleados();
    }
}
