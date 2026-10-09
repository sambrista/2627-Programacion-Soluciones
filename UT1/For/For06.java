/*
	Realiza un programa que solicite un número entero positivo n
	y dibuje un triángulo rectángulo de altura n utilizando asteriscos.
	
	Por ejemplo, si se introduce el número 5:
	*
	**
	***
	****
	*****
*/

import java.util.Scanner;

public class For06 {
	public void main() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el numero de filas: ");
		n = sc.nextInt();
		
		for (int fila = 1; fila <= n; fila++) {
			for (int i=1; i<=fila; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}