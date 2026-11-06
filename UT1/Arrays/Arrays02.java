/*
 * ========================================================================
 *  Arrays02
 * ========================================================================
 *  Realiza el ejercicio 1 usando funciones.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;
 
public class Arrays02 {
	public void main() {
		double[] notas;
		double notaMedia, notaMasAlta, notaMasBaja;
		
		// Crear array notas
		notas = crearArrayNotas();
		
		// Guardar notas alumnos
		rellenarNotas(notas);
		
		// Imprimir notas
		imprimirNotas(notas);
		
		// Calcular media
		notaMedia = notaPromedio(notas);
		System.out.println("La nota media es " + notaMedia);
				
		notaMasAlta = notaMaxima(notas);
		System.out.println("La nota más alta es " + notaMasAlta);

		notaMasBaja = notaMinima(notas);
		System.out.println("La nota más baja es " + notaMasBaja);
	}
	
	public double[] crearArrayNotas() {
		int numeroAlumnos = pidePositivo("Introduce el número de alumnos: ", "Debe ser un entero mayor de 0");
		double[] notas = new double[numeroAlumnos];
		
		return notas;
	}
	
	public void rellenarNotas(double[] notas) {
		for (int i = 0; i < notas.length; i++) {
			notas[i] = pideDoubleAcotado("Introduce la nota del alumno " + (i+1) + ": ", "La nota debe ser un número entre 0 y 10", 0, 10);
		}
	}
	
	public void imprimirNotas(double[] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno " + (i+1) + ": " + notas[i]);
		}
	}
	
	public double notaPromedio(double[] notas) {
		double notaMedia=0, sumaNotas=0;
		for (int i = 0; i < notas.length; i++) {
			sumaNotas += notas[i];
		}
		notaMedia = sumaNotas / notas.length;
		return notaMedia;
	}
	
	public double notaMaxima(double[] notas) {
		double notaMasAlta=-1;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > notaMasAlta) {
				notaMasAlta = notas[i];
			}
		}
		return notaMasAlta;
	}
	
	public double notaMinima(double[] notas) {
		double notaMasBaja=notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < notaMasBaja) {
				notaMasBaja = notas[i];
			}
		}
		return notaMasBaja;
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