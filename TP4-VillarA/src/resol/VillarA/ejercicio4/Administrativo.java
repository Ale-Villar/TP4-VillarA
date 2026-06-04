package resol.VillarA.ejercicio4;

public class Administrativo extends Empleado {
    private boolean esRemoto; // true = remoto, false = presencial

    public Administrativo(String nombre, String dni, double sueldoBase, int antiguedad, boolean esRemoto) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.esRemoto = esRemoto;
    }

    @Override
    public double calcularSalario() {
        double sueldoBase = getSueldoBase();
        double descuento = esRemoto ? (sueldoBase * 0.12) : (sueldoBase * 0.08);
        double sueldoNeto = sueldoBase - descuento;

        // Aplicar bonificación por antigüedad sobre el neto
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
        System.out.println("Modalidad: " + (esRemoto ? "Remoto" : "Presencial"));
    }

    public boolean isEsRemoto() { return esRemoto; }
    public void setEsRemoto(boolean esRemoto) { this.esRemoto = esRemoto; }
}
