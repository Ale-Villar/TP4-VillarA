package resol.VillarA.ejercicio3;

public class Ejercicio3 {

    public static void ejecutar() {
        System.out.println("=== EJECUTANDO EJERCICIO 3: SISTEMA BANCARIO ===");

        // Creamos una Caja de Ahorro con un saldo inicial de $10.000
        CajaAhorro miCaja = new CajaAhorro("CA-2026-9981", 10000.0);
        System.out.println("Cuenta creada. Saldo inicial: $" + miCaja.getSaldo());
        System.out.println("-------------------------------------------------");

        // Simulación de movimientos (Cada uno va a disparar el registrarLog de manera polimórfica)
        
        System.out.println(">> Realizando un depósito...");
        miCaja.depositar(5000.0); 
        
        System.out.println("\n>> Realizando un retiro válido...");
        miCaja.retirar(3000.0);

        System.out.println("\n>> Intentando un retiro por encima del saldo disponible...");
        miCaja.retirar(20000.0); // Debería saltar el error de fondos insuficientes y NO auditar

        System.out.println("-------------------------------------------------");
        System.out.println("Fin de la simulación bancaria. Saldo final: $" + miCaja.getSaldo());
    }
}