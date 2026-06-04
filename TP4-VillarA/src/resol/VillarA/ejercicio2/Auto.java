package resol.VillarA.ejercicio2;

public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, int kilometraje, int cantidadDePuertas) {
        super(marca, kilometraje);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() { return cantidadDePuertas; }
    public void setCantidadDePuertas(int cantidadDePuertas) { this.cantidadDePuertas = cantidadDePuertas; }

    @Override
    public int proximoServicio() {
        return 10000; 
    }

    @Override
    public void realizarRevision() {
        System.out.println("Service de los 10k: Cambio de aceite, filtro y revisión de 4 neumáticos.");
    }
}
