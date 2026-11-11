/*
 * ========================================================================
 *  Arrays04
 * ========================================================================
 * A partir del ejercicio 3, añade la opción de imprimir los elementos
 * que superan un valor concreto. Además de imprimir los números, la opción
 * indicará cuáles son el valor máximo y el valor mínimo de dichos números.
 *
 * Pista: Sería interesante tener una función a la que le pase un valor
 * concreto y me devuelva un array que contenga los números que superan ese
 * valor.
 * ========================================================================
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays04 {
	public void main() {
		final int TAMANO = 10;
		int opcion;
		int elementoABuscar, posicionNumero;
		int elementoMaximo, elementoMinimo;
		int valorASuperar, cuantosSuperanValor;
		int[] numerosQueSuperanValor;
		int[] numeros = new int[TAMANO];
		
		pedirArrayEnteros(numeros,"Introduce un entero: ", "Debes introducir un número sin decimales");
		
		do {
			imprimirMenu();
			opcion = pideEnteroAcotado("Escoge una opción (0-5): ", "Debes escoger una opción válida", 0, 5);
			switch (opcion) {
				case 1:
					imprimirArrayEnteros(numeros);
					break;
				case 2:
					imprimirArrayEnterosInverso(numeros);
					break;
				case 3:
					elementoABuscar = pideEntero("Introduce un número a buscar: ", "Debes introducir un entero");
					posicionNumero = buscarEntero(numeros, elementoABuscar);
					if (posicionNumero == -1) {
						System.out.println("El número no está en el array");
					} else {
						System.out.println("El elemento está en la posición " + (posicionNumero + 1));
					}
					break;
				case 4:
					elementoMinimo = minimo(numeros);
					System.out.println("El mínimo es " + elementoMinimo + " y está en la posición " + (buscarEntero(numeros, elementoMinimo) + 1));
					elementoMaximo = maximo(numeros);
					System.out.println("El máximo es " + elementoMaximo + " y está en la posición " + (buscarEntero(numeros, elementoMaximo) + 1));
					break;
				case 5:
					valorASuperar = pideEntero("Introduce un valor a superar: ", "Debes introducir un número entero");
					cuantosSuperanValor = contarMayores(numeros, valorASuperar);
					System.out.println("La cantidad de elementos que superan " + valorASuperar + " es " + cuantosSuperanValor);
					numerosQueSuperanValor = obtenerMayores(numeros, valorASuperar);
					if (numerosQueSuperanValor.length > 0) {
						imprimirArrayEnteros(numerosQueSuperanValor);
						elementoMaximo = maximo(numerosQueSuperanValor);
						System.out.println("El máximo es " + elementoMaximo);
						elementoMinimo = minimo(numerosQueSuperanValor);
						System.out.println("El mínimo es " + elementoMinimo);
					} else {
						System.out.println("El array está vacío");
					}
					break;
				case 0:
					System.out.println("Adios");
					break;
			}
		} while (opcion != 0);
	}

	public int[] obtenerMayores(int[] array, int valorASuperar) {
		int[] mayores = new int[contarMayores(array, valorASuperar)];
		int posicion = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > valorASuperar) {
				mayores[posicion] = array[i];
				posicion++;
			}
		}

		return mayores;
	}
    private int contarMayores(int[] array, int valorASuperar) {
        int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > valorASuperar) {
				contador++;
			}
		}
		return contador;
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
		System.out.println("4: Consultar máximo y mínimo");
		System.out.println("5: Consultar elementos mayores de un valor dado");
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

	public int maximo(int[] array) {
		int valorMasAlto=array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > valorMasAlto) {
				valorMasAlto = array[i];
			}
		}
		return valorMasAlto;
	}

	public int minimo(int[] array) {
		int valorMasBajo=array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < valorMasBajo) {
				valorMasBajo = array[i];
			}
		}
		return valorMasBajo;
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