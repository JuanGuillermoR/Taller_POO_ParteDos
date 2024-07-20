public class Empleado extends Persona {
    private int idEmpleado;
    private double salario;

    public Empleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    // Getters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                '}';
    }
}
