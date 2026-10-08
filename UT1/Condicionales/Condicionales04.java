/*
 * Velocidad del vehículo: Realiza un programa que solicite la velocidad a la que circula un vehículo, expresada en km/h, y muestre uno de los siguientes mensajes:
     Menos de 50 km/h → "Velocidad baja".
     Entre 50 y 100 km/h → "Velocidad moderada".
     Más de 100 km/h → "Velocidad alta".
 */

import java.util.Scanner;

public class Condicionales04 {
    public static void main(String[] args) {
        double velocidad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la velocidad: ");
        velocidad = teclado.nextDouble();

        if (velocidad < 50) {
            System.out.println("Velocidad baja");
        } else if (velocidad >= 50 && velocidad <= 100) {
            System.out.println("Velocidad moderada");
        } else {
            System.out.println("Velocidad alta");
        }
		/*
		if (velocidad < 50) {
			System.out.println("Velocidad baja");
		} else if (velocidad > 100) {
			System.out.println("Velocidad alta");
		} else {
			System.out.println("Velocidad moderada");
		}*/
    }
} 