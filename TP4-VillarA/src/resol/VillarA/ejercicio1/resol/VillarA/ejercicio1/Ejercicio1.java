package resol.VillarA.ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {

    public static void ejecutar() {

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Ana", 20, 9));
        estudiantes.add(new Estudiante("Juan", 21, 6));
        estudiantes.add(new Estudiante("Pedro", 19, 8));

        for (Estudiante e : estudiantes) {

            e.mostrarRol();

            System.out.println(e.generarReporte());

            if (e.getNotaFinal() >= 7) {
                System.out.println(">> " + e.getNombre() + " promocionó.");
            } else {
                System.out.println(">> " + e.getNombre() + " no promocionó.");
            }

            System.out.println("----------------------");
        }
    }
}
