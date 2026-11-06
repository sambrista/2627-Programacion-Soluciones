/*
 * ========================================================================
 *  Arrays01
 * ========================================================================
 *  Escribe un programa que pida al usuario cuántos alumnos tiene un
 *  grupo. Después debe pedir las notas de cada alumno de ese grupo usando
 *  una estructura adecuada. El programa debe mostrar las notas
 *  introducidas, la media de todas las notas, la nota más alta y la nota
 *  más baja.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;
 
public class Arrays01 {
	public void main() {
		int numeroAlumnos;
		double[] notas;
		double notaMedia=0, sumaNotas=0, notaMasAlta, notaMasBaja;
		
		// Crear array notas
		numeroAlumnos = pidePositivo("Introduce el número de alumnos: ", "Debe ser un entero mayor de 0");
		notas = new double[numeroAlumnos];
		
		// Guardar notas alumnos
		for (int i = 0; i < numeroAlumnos; i++) {
			notas[i] = pideDoubleAcotado("Introduce la nota del alumno " + (i+1) + ": ", "La nota debe ser un número entre 0 y 10", 0, 10);
		}
		
		// Imprimir notas
		for (int i = 0; i < numeroAlumnos; i++) {
			System.out.println("Alumno " + (i+1) + ": " + notas[i]);
		}
		
		// Calcular media
		for (int i = 0; i < numeroAlumnos; i++) {
			sumaNotas += notas[i];
		}
		notaMedia = sumaNotas / numeroAlumnos;
		System.out.println("La nota media es " + notaMedia);
		
		// Nota más alta
		notaMasAlta=-1;
		for (int i = 0; i < numeroAlumnos; i++) {
			if (notas[i] > notaMasAlta) {
				notaMasAlta = notas[i];
			}
		}
		System.out.println("La nota más alta es " + notaMasAlta);

		// Nota más baja
		notaMasBaja=notas[0];
		for (int i = 1; i < numeroAlumnos; i++) {
			if (notas[i] < notaMasBaja) {
				notaMasBaja = notas[i];
			}
		}
		System.out.println("La nota más baja es " + notaMasBaja);
	}
	
	public boolean esPositivo(int numero) {
		return numero > 0;
	}
	
	public int pidePositivo(String mensaje, String mensajeError) {
		int entero;
		boolean esCorrecto;

		do {
			entero = pideEntero(mensaje, mensajeError);
			esCorrecto = esPositivo(entero);
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
	
	public double pideDouble(String mensaje, String mensajeError) {
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		boolean esCorrecto = false;

		do {
			System.out.print(mensaje);
			try {
				numero = sc.nextDouble();
				esCorrecto = true;
			} catch (InputMismatchException excepcion) {
				System.out.println(mensajeError);
				sc.nextLine();
			}
		} while (!esCorrecto);

		return numero;
	}
	
		public double pideDoubleAcotado(String mensaje, String mensajeError, double minimo, double maximo) {
		double numero;
		boolean esCorrecto;

		do {
			numero = pideDouble(mensaje, mensajeError);
			esCorrecto = numero >= minimo && numero <= maximo;
			if (!esCorrecto) {
				System.out.println(mensajeError);
			}
		} while (!esCorrecto);

		return numero;
	}
	
}