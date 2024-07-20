public class EmpleadoPermanente extends Empleado {
    private String departamento;

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario, String departamento) {
        super(nombre, edad, idEmpleado, salario);
        this.departamento = departamento;
    }

    // Getter
    public String getDepartamento() {
        return departamento;
    }

    // Setter
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "EmpleadoPermanente{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", idEmpleado=" + getIdEmpleado() +
                ", salario=" + getSalario() +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
