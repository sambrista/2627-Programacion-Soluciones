// Pide al usuario un número (sin decimales) entre 0 y 999 e imprime
// cuantas centenas, decenas y unidades componen el número. Por ejemplo,
// 234 son 2 centenas, 3 decenas y 4 unidades.

import java.util.Scanner; // Necesario para usar Scanner

public class Ejercicio02 {
    public static void main(String[] args) {
		int numero, decenas, centenas;
        Scanner teclado = new Scanner(System.in);
		decenas = 0;
		centenas = 0;
		
		System.out.println("Escribe un numero entre 0 y 999");
		numero = teclado.nextInt();
		
		centenas = numero / 100;
		numero = numero - centenas * 100;
		decenas = numero / 10;
		numero = numero - decenas * 10;
		
		System.out.println("Son " + centenas + " centenas " + decenas + " decenas y " + numero + " unidades");
    }
}