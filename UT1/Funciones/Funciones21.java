/*
 * ========================================================================
 *  Funciones21
 * ========================================================================
 *  Modifica la función anterior y añade dos parámetros: el mensaje a
 *  mostrar para pedir el entero, y el mensaje a mostrar cuando hay error.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Funciones21 {
	Scanner sc = new Scanner(System.in);

	public void main() {
		int numero = pideEntero("Dime tu edad: ", "La edad tiene que ser un número entero");
		System.out.println("El número introducido es " + numero);
	}

	// Funciones20, con los mensajes recibidos como parámetros
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
