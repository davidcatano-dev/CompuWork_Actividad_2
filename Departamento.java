package compuwork;
import java.util.ArrayList; 

public class Departamento {
    private String nombreDepto;
    private ArrayList<Empleado> listaEmpleados; 

    public Departamento(String nombre) {
        this.nombreDepto = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        try {
            if (e == null) {
                throw new NullPointerException("Empleado nulo");
            }
            listaEmpleados.add(e);
            System.out.println("Empleado " + e.getNombre() + " agregado.");
        } catch (NullPointerException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}