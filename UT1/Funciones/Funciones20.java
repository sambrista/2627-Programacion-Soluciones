/*
 * ========================================================================
 *  Funciones20
 * ========================================================================
 *  Realiza una función que pida un entero y devuelva ese entero sin
 *  errores. La función debe controlar si se introduce cualquier carácter
 *  que no sea un entero, y volver a pedirlo, hasta que el valor introducido
 *  sea realmente un entero, entonces lo devolverá.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Funciones20 {
	public void main() {
		int numero = pideEntero();
		System.out.println("El número introducido es " + numero);
	}
	public int pideEntero() {
		int entero = 0;
		boolean esCorrecto = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Introduce un entero: ");
			try {
				entero = sc.nextInt();
				esCorrecto = true;
			} catch (InputMismatchException excepcion) {
				System.out.println("Hay que introducir un número entero");
				sc.nextLine();
			}
		} while (!esCorrecto);
		
		return entero;
	}
}