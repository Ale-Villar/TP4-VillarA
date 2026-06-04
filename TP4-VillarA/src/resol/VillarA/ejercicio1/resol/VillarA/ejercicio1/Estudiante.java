package resol.VillarA.ejercicio1;

public class Estudiante extends Persona implements Informable {

    private String nombre;
    private int edad;
    private double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        super(nombre, edad);

        this.nombre = nombre;
        this.edad = edad;
        setNotaFinal(notaFinal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {

        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("La nota debe estar entre 0 y 10");
        }

    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Alumno");
    }

    @Override
    public String generarReporte() {

        String condicion;

        if (notaFinal >= 7) {
            condicion = "PROMOCIONADO";
        } else {
            condicion = "NO PROMOCIONADO";
        }

        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nNota Final: " + notaFinal +
                "\nCondición: " + condicion;
    }
}