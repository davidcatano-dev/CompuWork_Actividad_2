package compuwork;

public class CompuWork {

    public static void main(String[] args) {
        // 1. Creación del Departamento
        Departamento deptoIT = new Departamento("Tecnologia");

        // 2. Creación de Empleados 
        Empleado emp1 = new Permanente("Alejandra Castrillon", "P001", 2500.0);
        Empleado emp2 = new Temporal("Valentina Bustamante", "T502", 6); 

        // 3. Asignación con Gestión de Excepciones 
        deptoIT.agregarEmpleado(emp1);
        deptoIT.agregarEmpleado(emp2);
        
        // Probando la excepción: Intento agregar un empleado nulo
        deptoIT.agregarEmpleado(null); 

        // 4. Uso de la clase ReporteDesempeño 
        ReporteDesempeño reporte = new ReporteDesempeño();
        
        System.out.println("INICIO DE REPORTES");
        // Reporte de todo el departamento
        reporte.generarReporte(deptoIT);
        
        // Reporte individual 
        reporte.generarReporte(emp1);

        System.out.println("Sistema ejecutado con exito");
    }
}