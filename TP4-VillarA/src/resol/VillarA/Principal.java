
package resol.VillarA;

import java.util.Scanner;

// IMPORTS OBLIGATORIOS SOLICITADOS POR LA CÁTEDRA
import resol.VillarA.ejercicio1.Ejercicio1;
import resol.VillarA.ejercicio2.Ejercicio2;
import resol.VillarA.ejercicio3.Ejercicio3;
import resol.VillarA.ejercicio4.Ejercicio4;
import resol.VillarA.ejercicio5.Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=========================================");
        System.out.println("       MENU PRINCIPAL - TRABAJO PRACTICO 4");
        System.out.println("=========================================");
        System.out.println("1. Ejercicio 1: Sistema de Alumnos");
        System.out.println("2. Ejercicio 2: Sistema de Vehículos");
        System.out.println("3. Ejercicio 3: Sistema Bancario");
        System.out.println("4. Ejercicio 4: Gestión de Empleados");
        System.out.println("5. Ejercicio 5: Préstamos Bancarios");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción (1-6): ");
        
        if (teclado.hasNextInt()) {
            opcion = teclado.nextInt();
        }

        System.out.println(); // Salto de línea estético

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            case 5:
                Ejercicio5.ejecutar();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción incorrecta. Reinicie el programa.");
                break;
        }

        teclado.close();
    }
}