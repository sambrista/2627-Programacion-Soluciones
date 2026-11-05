/*
 * ========================================================================
 *  Funciones22
 * ========================================================================
 *  Crea otra función llamada pideEnteroAcotado que, además de los dos
 *  mensajes, reciba también dos enteros con el valor mínimo y máximo del
 *  entero. Esta función deberá hacer uso internamente de la función
 *  pideEntero.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Funciones22 {
	Scanner sc = new Scanner(System.in);

	public void main() {
		int nota = pideEnteroAcotado("Introduce una nota (0-10): ",
				"La nota debe ser un entero entre 0 y 10", 0, 10);
		System.out.println("La nota introducida es " + nota);
	}

	public int pideEnteroAcotado(String mensaje, String mensajeError, int minimo, int maximo) {
		int entero;
		boolean esCorrecto;

		do {
			entero = pideEntero(mensaje, mensajeError);
			esCorrecto = entero >= minimo && entero <= maximo;
			if (!esCorrecto) {
				System.out.println(mensajeError);
			}
		} while (!esCorrecto);

		return entero;
	}

	// ============================== Funciones reutilizadas de ejercicios previos

	// Funciones21
	public int pideEntero(String mensaje, String mensajeError) {
		int entero = 0;
		boolean esCorrecto = false;

		do {
			System.out.print(mensaje);
			try {
				entero = sc.nextInt();
				esCorrecto = true;
			} catch (InputMismatchException excepcion) {
				System.out.println(mensajeError);
				sc.nextLine();
			}
		} while (!esCorrecto);

		return entero;
	}
}
