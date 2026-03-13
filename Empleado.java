package compuwork;

public abstract class Empleado {
    protected String nombre;
    protected String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String obtenerDetalles();
}