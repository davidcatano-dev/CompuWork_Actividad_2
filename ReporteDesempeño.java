package compuwork;

public class ReporteDesempeño {
    
    public void generarReporte(Empleado e) {
        System.out.println("REPORTE INDIVIDUAL ");
        System.out.println(e.obtenerDetalles());
    }

    public void generarReporte(Departamento d) {
        System.out.println("REPORTE DEPTO: " + d.getNombreDepto() + "");
        
        // Aquí recorremos la lista que obtenemos del departamento
        for (Empleado e : d.getListaEmpleados()) {
            System.out.println(e.obtenerDetalles());
        }
    }
}