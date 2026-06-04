package resol.VillarA.ejercicio5;
import java.time.LocalDate;

public class Ejercicio5 {

    public static void ejecutar() {
        System.out.println("=== EJECUTANDO EJERCICIO 5: GESTIÓN DE PRÉSTAMOS ===");

        // Creamos fechas de prueba usando LocalDate (Año, Mes, Día)
        LocalDate hoy = LocalDate.of(2026, 6, 4);
        LocalDate pactadaJubilado = LocalDate.of(2026, 7, 4);
        LocalDate pactadaGeneral = LocalDate.of(2026, 7, 4);

        // 1. Caso Jubilado: Paga en término
        Jubilado jubilado = new Jubilado("Carlos Gómez", "14222333", hoy, 100000, pactadaJubilado, 1);
        jubilado.setFechaEfectivaPago(LocalDate.of(2026, 7, 4)); // Al día

        // 2. Caso Cliente General: Se atrasa 5 días en pagar
        ClienteGeneral clienteGen = new ClienteGeneral("Ana Martínez", "38444555", hoy, 200000, pactadaGeneral, 2);
        clienteGen.setFechaEfectivaPago(LocalDate.of(2026, 7, 9)); // 5 días tarde

        Cliente[] solicitudes = {jubilado, clienteGen};

        for (Cliente c : solicitudes) {
            System.out.println("\n-------------------------------------------------");
            // Determinar tipo de cliente de forma visual
            String tipoCliente = c.getClass().getSimpleName();
            System.out.println("Tipo de Cliente: " + tipoCliente);
            
            // Requisito 1: Mostrar información básica
            c.mostrarInformacionBasica();

            // Requisito 2: Mostrar interés calculado
            double interesBase = c.calcularInteres(c.getMontoSolicitado(), c.getMesesPlazo());
            System.out.println("Interés Base del Préstamo: $" + interesBase);

            // Requisito 3: Mostrar estado de pago y penalidad
            long diasAtraso = c.calcularDiasAtraso();
            double penalidad = c.calcularPenalidad();
            if (diasAtraso > 0) {
                System.out.println("Estado: Pago con ATRASO de " + diasAtraso + " días.");
                System.out.println("Recargo por penalidad (2% diario): $" + penalidad);
            } else {
                System.out.println("Estado: Pago realizado EN TÉRMINO.");
                System.out.println("Recargo por penalidad: $0.0");
            }

            // Requisito 4: Monto final total
            double montoFinal = c.getMontoSolicitado() + interesBase + penalidad;
            System.out.println(">> MONTO FINAL TOTAL A PAGAR: $" + montoFinal);
            System.out.println("-------------------------------------------------");
        }
    }
}