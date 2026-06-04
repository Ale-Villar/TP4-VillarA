package resol.VillarA.ejercicio4;

public class Produccion extends Empleado {
    private String turno; // "diurno" o "nocturno"

    public Produccion(String nombre, String dni, double sueldoBase, int antiguedad, String turno) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.turno = turno.toLowerCase();
    }

    @Override
    public double calcularSalario() {
        double sueldoBase = getSueldoBase();
        double descuento = turno.equals("nocturno") ? (sueldoBase * 0.06) : (sueldoBase * 0.08);
        double sueldoNeto = sueldoBase - descuento;

        // Aplicar bonificación por antigüedad
        double bonificacion = 0.0;
        if (getAntiguedad() > 15) {
            bonificacion = 0.20;
        } else if (getAntiguedad() > 10) {
            bonificacion = 0.15;
        } else if (getAntiguedad() > 5) {
            bonificacion = 0.10;
        }

        return sueldoNeto + (sueldoNeto * bonificacion);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Turno: " + turno);
    }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}