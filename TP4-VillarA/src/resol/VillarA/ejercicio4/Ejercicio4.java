package resol.VillarA.ejercicio4;

public class Ejercicio4 {
public static void ejecutar() {
        System.out.println("=== EJECUTANDO EJERCICIO 4: GESTIÓN DE EMPLEADOS ===");

        // Creamos los empleados de prueba
        Administrativo admin = new Administrativo("Sofía Villar", "42345678", 500000, 12, true);
        Produccion operario = new Produccion("Nicolás Aznar", "40123456", 450000, 4, "nocturno");

        // Polimorfismo en acción mediante un arreglo de la clase madre
        Empleado[] listaEmpleados = {admin, operario};

        for (Empleado emp : listaEmpleados) {
            System.out.println("\n--- Ficha de Empleado ---");
            emp.mostrarInformacion(); // Muestra datos básicos + específicos
            System.out.println("Salario Neto a Cobrar: $" + emp.calcularSalario());
            System.out.println("-------------------------");
        }

        // Mostramos el total acumulado por la variable estática
        System.out.println("\n>>> Total de empleados registrados en el sistema: " + Empleado.getContadorEmpleados());
    }
}
