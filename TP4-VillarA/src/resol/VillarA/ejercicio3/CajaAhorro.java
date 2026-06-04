package resol.VillarA.ejercicio3;

public class CajaAhorro extends Cuenta {

    public CajaAhorro(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    // Polimorfismo: Implementación específica del log para la Caja de Ahorro
    @Override
    public void registrarLog(String mensaje) {
        System.out.println("[AUDITORÍA CAJA AHORRO - Nro " + getNumeroCuenta() + "]: " + mensaje);
    }
}