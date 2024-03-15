public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        Empleado empleado1 = new EmpleadoPermanente("Miguel Toro",22,1,2800000,5);
        Empleado empleado2 = new EmpleadoTemporal("Julian Usuga", 22,2,2500000,"31/12/2024");

        gestionEmpleados.agregarEmpleado(empleado1);
        gestionEmpleados.agregarEmpleado(empleado2);

        gestionEmpleados.mostrarEmpleados();

        gestionEmpleados.eliminarEmpleado(1);

        System.out.println("\nDespués de eliminar:");
        gestionEmpleados.mostrarEmpleados();

    }
}