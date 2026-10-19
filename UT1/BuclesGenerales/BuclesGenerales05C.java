/*
  Número primo: Pedir un número e indicar si es primo o no.
*/

import java.util.Scanner;

public class BuclesGenerales05B {
	public void main() {
		int numero=0, numeroDivisor=2;
		boolean esPrimo = true;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();
		
		while (numeroDivisor < numero && esPrimo) {
			if (numero % numeroDivisor == 0) {
				esPrimo = false;
			}
			numeroDivisor++;
		}
		
		if (esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
	}
}