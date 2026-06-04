package resol.VillarA.ejercicio5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente implements PrestamoCalculable {
    private String nombre;
    private String dni;
    private LocalDate fechaPrestamo;
    private double montoSolicitado;
    private LocalDate fechaPactadaPago;
    private LocalDate fechaEfectivaPago; // Se carga al momento de pagar
    private int mesesPlazo; // Guardamos el plazo en meses para el cálculo

    public Cliente(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago, int mesesPlazo) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.montoSolicitado = (montoSolicitado > 0) ? montoSolicitado : 0.0;
        this.fechaPactadaPago = fechaPactadaPago;
        this.mesesPlazo = mesesPlazo;
    }

    // Lógica común para calcular los días de atraso
    public long calcularDiasAtraso() {
        if (fechaEfectivaPago == null) return 0;
        
        // Si pagó después de la fecha pactada, calculamos la diferencia en días
        if (fechaEfectivaPago.isAfter(fechaPactadaPago)) {
            return ChronoUnit.DAYS.between(fechaPactadaPago, fechaEfectivaPago);
        }
        return 0; // Pagó en término o antes
    }

    // Lógica común de penalidad: 2% por día de atraso sobre el monto inicial
    public double calcularPenalidad() {
        long dias = calcularDiasAtraso();
        return this.montoSolicitado * 0.02 * dias;
    }

    public void mostrarInformacionBasica() {
        System.out.println("Cliente: " + nombre + " | DNI: " + dni);
        System.out.println("Monto Solicitado: $" + montoSolicitado);
        System.out.println("Fecha Préstamo: " + fechaPrestamo + " | Plazo: " + mesesPlazo + " meses");
        System.out.println("Fecha Pactada de Pago: " + fechaPactadaPago);
        if (fechaEfectivaPago != null) {
            System.out.println("Fecha Efectiva de Pago: " + fechaEfectivaPago);
        }
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public double getMontoSolicitado() { return montoSolicitado; }
    public int getMesesPlazo() { return mesesPlazo; }
    public void setFechaEfectivaPago(LocalDate fechaEfectivaPago) { this.fechaEfectivaPago = fechaEfectivaPago; }
}
