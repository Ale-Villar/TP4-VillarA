package resol.VillarA.ejercicio2;

public abstract class Vehiculo implements Mantenimiento {
    private String marca;
    private int kilometraje;

    public Vehiculo(String marca, int kilometraje) {
        this.marca = marca;
        setKilometraje(kilometraje); // Usamos el setter para validar desde el constructor
    }

    // Método abstracto para el polimorfismo
    public abstract int proximoServicio();

    // Getters y Setters con validación
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getKilometraje() { return kilometraje; }
    
    public void setKilometraje(int kilometraje) {
        if (kilometraje >= 0) {
            this.kilometraje = kilometraje;
        } else {
            System.out.println("Error: El kilometraje no puede ser negativo. Se asignará 0.");
            this.kilometraje = 0;
        }
    }
}