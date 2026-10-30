/*
 * ========================================================================
 *  Funciones19B
 * ========================================================================
 *  Programa un conversor de temperaturas que muestre un menú con las
 *  opciones:
 *  1. Celsius → Fahrenheit
 *  2. Fahrenheit → Celsius
 *  0. Salir
 *
 *   Cada conversión debe realizarse mediante su propia función.
 * ========================================================================
 */

import java.util.Scanner;

public class Funciones19B {
	public void main() {
		int opcion;
		Scanner teclado = new Scanner(System.in);
		do {
			imprimirMenu();
			
			System.out.print("Introduce una opcion (0-2): ");
			opcion = teclado.nextInt();
			
			gestionarOpcion(opcion);
			
		} while (opcion != 0);
		
	}
	
	public void imprimirMenu() {
		System.out.println("MENU:");
		System.out.println("1. Convertir a Farenheit");
		System.out.println("2. Convertir a Celsius");
		System.out.println("");
		System.out.println("0. Salir");
		System.out.println("");
	}
	
	public void gestionarOpcion(int opcion) {
		Scanner teclado = new Scanner(System.in);
		double temperatura;
		
		switch (opcion) {
			case 1:
				System.out.print("Introduce la temperatura en Celsius: ");
				temperatura = teclado.nextDouble();
				System.out.println("La temperatura en Farenheit es: " + celsiusAFarenheit(temperatura));
				break;
			case 2:
				System.out.print("Introduce la temperatura en Farenheit: ");
				temperatura = teclado.nextDouble();
				System.out.println("La temperatura en Celsius es: " + farenheitACelsius(temperatura));
				break;
			case 0:
				System.out.println("Gracias por usar este programa");
				break;
			default:
				System.out.println("Debes usar una opción válida");
		}
	}
	
	public double celsiusAFarenheit(double temperaturaCelsius) {
        return temperaturaCelsius * (9.0 / 5.0) + 32;
    }
	
	public double farenheitACelsius(double temperaturaFarenheit) {
        return (temperaturaFarenheit - 32) * (5.0 / 9.0);
    }
}