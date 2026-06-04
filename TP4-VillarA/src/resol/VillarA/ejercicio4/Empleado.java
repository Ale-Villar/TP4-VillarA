package resol.VillarA.ejercicio4;

public abstract class Empleado implements Calculable {
    private String nombre;
    private String dni;
    private double sueldoBase;
    private int antiguedad;
    
    // Atributo estático: pertenece a la clase, no a los objetos individuales
    private static int contadorEmpleados = 0;

    public Empleado(String nombre, String dni, double sueldoBase, int antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = (sueldoBase > 0) ? sueldoBase : 0.0;
        this.antiguedad = (antiguedad >= 0) ? antiguedad : 0;
        
        // Cada vez que se crea un empleado, sumamos 1 al total
        contadorEmpleados++;
    }

    // Método común para mostrar la información básica
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Antigüedad: " + antiguedad + " años");
    }

    // Método estático para consultar el total desde el Main
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    // Getters y Setters para el encapsulamiento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public double getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(double sueldoBase) { this.sueldoBase = sueldoBase; }

    public int getAntiguedad() { return antiguedad; }
    public void setAntiguedad(int antiguedad) { this.antiguedad = antiguedad; }
}
