// Crea una función que reciba un número entero y devuelva
// true si es par o false si es impar.

import java.util.Scanner;

public class Funciones05 {
	public void main() {
		// Programa de ejemplo
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		
		if (esPar(numero)) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
	
	public boolean esPar(int numero) {
		return numero % 2 == 0;
	}
}