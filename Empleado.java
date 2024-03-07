package bank;

public class Empleado{

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private String cargo;
    private String departamento;

    public Empleado() {
    }

    public void crearEmpleado(String nombre, String apellido, String numeroIdentificacion, String cargo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public void verEmpleado() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Número de identificación: " + numeroIdentificacion);
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento: " + departamento);
    }
}
