public class EmpleadoTemporal extends Empleado {
    private int duracionContrato; // Duración del contrato en meses

    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario, int duracionContrato) {
        super(nombre, edad, idEmpleado, salario);
        this.duracionContrato = duracionContrato;
    }

    // Getter
    public int getDuracionContrato() {
        return duracionContrato;
    }

    // Setter
    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", idEmpleado=" + getIdEmpleado() +
                ", salario=" + getSalario() +
                ", duracionContrato=" + duracionContrato +
                '}';
    }
}
