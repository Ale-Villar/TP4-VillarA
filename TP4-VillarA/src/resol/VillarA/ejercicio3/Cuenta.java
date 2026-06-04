package resol.VillarA.ejercicio3;

public abstract class Cuenta implements Auditable {
    private String numeroCuenta;
    private double saldo; // Totalmente encapsulado

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        // Validamos que no abran una cuenta con saldo negativo
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0.0;
    }

    // Método para aumentar saldo
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            registrarLog("Depósito exitoso de $" + monto + ". Saldo actual: $" + this.saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser mayor a 0.");
        }
    }

    // Método para disminuir saldo
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a 0.");
        } else if (monto <= this.saldo) {
            this.saldo -= monto;
            registrarLog("Retiro exitoso de $" + monto + ". Saldo actual: $" + this.saldo);
        } else {
            System.out.println("Error: Fondos insuficientes para retirar $" + monto + ". Saldo actual: $" + this.saldo);
        }
    }

    // Getter para poder consultar el saldo sin modificarlo directamente
    public double getSaldo() {
        return this.saldo;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
}
