/*
  Número primo: Pedir un número e indicar si es primo o no.
*/

import java.util.Scanner;

public class BuclesGenerales05 {
	public void main() {
		int numero=0;
		boolean esPrimo = true;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();
		
		for (int i=2; i < numero && esPrimo; i++) {
			if (numero % i == 0) {
				esPrimo = false;
			}
		}
		
		if (esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
	}
}