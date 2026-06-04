package resol.VillarA.ejercicio2;

public class Ejercicio2 {

    public static void ejecutar() {
        System.out.println("=== EJECUTANDO EJERCICIO 2: SISTEMA DE VEHÍCULOS ===");

        // 1. Instanciación con los valores del enunciado
        Auto auto = new Auto("Toyota", 8000, 5);
        Moto moto = new Moto("Honda", 2500, 250);

        // Arreglo polimórfico para procesar ambos vehículos en un solo ciclo
        Vehiculo[] vehiculos = {auto, moto};

        for (Vehiculo v : vehiculos) {
            System.out.println("\nVehículo: " + v.getMarca() + " | KM Actuales: " + v.getKilometraje());
            
            // 2. Uso de proximoServicio para calcular cuánto falta
            int kmPrevistos = v.proximoServicio();
            int faltante = kmPrevistos - v.getKilometraje();
            System.out.println("Faltan " + faltante + " km para el siguiente control.");

            // 3. El Momento del Service: Simulación del recorrido restante
            System.out.println("Simulando recorrido de " + faltante + " km...");
            v.setKilometraje(v.getKilometraje() + faltante);
            System.out.println("Nuevo KM del vehículo: " + v.getKilometraje());

            // 4. Ejecución de la Interface (Verificación y ejecución del service)
            if (v.getKilometraje() == v.proximoServicio()) {
                v.realizarRevision();
            }
            System.out.println("-------------------------------------------------");
        }
    }
}
