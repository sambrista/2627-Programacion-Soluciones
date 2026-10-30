/*
 * ========================================================================
 *  Funciones17
 * ========================================================================
 *  Escribe una función que reciba una nota numérica (0–10) y devuelva su
 *  calificación como texto: Insuficiente, Suficiente, Bien, Notable o
 *  Sobresaliente.
 * ========================================================================
 */

import java.util.Scanner;

public class Funciones17 {
	public void main() {
		Scanner sc = new Scanner(System.in);
		int notaEntera;
		double notaDouble;
		String textoNota = "";
		
		System.out.print("Introduce una nota entera: ");
		notaEntera = sc.nextInt();
		textoNota = notaTextual(notaEntera);
		if (textoNota.equals("")) {
			System.out.println("No has usado una nota correcta");
		} else {
			System.out.println("La nota es " + textoNota);
		}
		
		System.out.print("Introduce una nota con decimales: ");
		notaDouble = sc.nextDouble();
		textoNota = notaTextual(notaDouble);
		if (textoNota.equals("")) {
			System.out.println("No has usado una nota correcta");
		} else {
			System.out.println("La nota es " + textoNota);
		}
	}
	
	public String notaTextual(double nota) {
		String resultado = "";
		if (nota >= 0 && nota <= 10) {
			if (nota < 5) {
				resultado = "Insuficiente";
			} else if (nota < 6) {
				resultado = "Suficiente";
			} else if (nota < 7) {
				resultado = "Bien";
			} else if (nota < 9) {
				resultado = "Notable";
			} else {
				resultado = "Sobresaliente";
			}
		}
		return resultado;
	}
	
	public String notaTextual(int nota) {
		String resultado = "";
		switch (nota) {
			case 0,1,2,3,4:
				resultado = "Insuficiente";
				break;
			case 5:
				resultado = "Suficiente";
				break;
			case 6:
				resultado = "Bien";
				break;
			case 7,8:
				resultado = "Notable";
				break;
			case 9,10:
				resultado = "Sobresaliente";
				break;
		}
		return resultado;
	}
}