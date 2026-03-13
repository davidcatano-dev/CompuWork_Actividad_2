package compuwork;
public class Temporal extends Empleado {
    private int mesesContrato;

    public Temporal(String nombre, String id, int meses) {
        super(nombre, id);
        this.mesesContrato = meses;
    }

    @Override
    public String obtenerDetalles() {
        return "Empleado Temporal: " + nombre + " | Contrato: " + mesesContrato + " meses";
    }
}