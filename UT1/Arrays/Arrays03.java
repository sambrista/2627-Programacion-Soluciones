/*
 * ==========
 * Arrays03
 * ==========
 * Escribe un programa que pida 10 números enteros por teclado, los almacene en un array, y a continuación muestre un menú en el que permita:
- Mostrar esos elementos.
- Mostrar esos elementos en orden inverso al que fueron introducidos.
- Comprobar si un número existe. Si existe se mostrará la posición del número en el array, y si no existe lo indicará.
- Consultar cuál es el máximo y el mínimo, y en qué posición están.
- Consultar cuántos números superan un valor concreto.

Se debe implementar mediante funciones. En el caso de la búsqueda, la función deberá devolver -1 si el elemento no existe. Las funciones para localizar un número, obtener la posición, calcular el mínimo o el máximo… deben devolver valores, no imprimirlos.
 * ==========
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Arrays03 {
	public void main() {
		final int TAMANO = 10;
		int opcion;
		int elementoABuscar, posicionNumero;
		int[] numeros = new int[TAMANO];
		
		pedirArrayEnteros(numeros,"Introduce un entero: ", "Debes introducir un número sin decimales");
		
		do {
			imprimirMenu();
			opcion = pideEnteroAcotado("Escoge una opción (0-3): ", "Debes escoger una opción válida", 0, 3);
			switch (opcion) {
				case 1:
					imprimirArrayEnteros(numeros);
					break;
				case 2:
					imprimirArrayEnterosInverso(numeros);
					break;
				case 3:
					elementoABuscar = pideEntero("Introduce un número a buscar", "Debes introducir un entero");
					posicionNumero = buscarEntero(numeros, elementoABuscar);
					if (posicionNumero == -1) {
						System.out.println("El número no está en el array");
					} else {
						System.out.println("El elemento está en la posición " + posicionNumero);
					}
					break;
				case 0:
					System.out.println("Adios");
					break;
			}
		} while (opcion != 0);
	}
	
	public void imprimirArrayEnterosInverso(int[] array) {
		for (int i = (array.length-1); i>=0; i--) {
			System.out.println(array[i]);
		}
	}
	
	public void imprimirArrayEnteros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void imprimirMenu() {
		System.out.println("\nMENU:");
		System.out.println("1: Mostrar elementos");
		System.out.println("2: Mostrar elementos en orden inverso");
		System.out.println("3: Buscar un elemento");
		System.out.println("\n0: Mostrar elementos");
	}
	
	public int buscarEntero(int[] array, int objetivo) {
		int posicion = -1;
		for (int i = 0; i < array.length && posicion == -1; i++) {
			if (array[i] == objetivo) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public void pedirArrayEnteros(int[] array, String mensaje, String mensajeError) {
		for (int i = 0; i < array.length; i++) {
			array[i] = pideEntero(mensaje, mensajeError);
		}
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
	
	public int pideEntero(String mensaje, String mensajeError) {
		Scanner sc = new Scanner(System.in);
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