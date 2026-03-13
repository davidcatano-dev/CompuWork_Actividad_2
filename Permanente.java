package compuwork;
public class Permanente extends Empleado {
    private double sueldoMensual;

    public Permanente(String nombre, String id, double sueldo) {
        super(nombre, id); // Llama al constructor de Empleado
        this.sueldoMensual = sueldo;
    }

    @Override
    public String obtenerDetalles() {
        return "Empleado Permanente: " + nombre + " | Sueldo: $" + sueldoMensual;
    }
}