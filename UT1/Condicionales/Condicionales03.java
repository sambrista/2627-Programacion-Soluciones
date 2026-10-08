/*
    Número menor, contemplando el empate: Mejora el programa anterior para
	que también tenga en cuenta que los dos números introducidos pueden ser
	iguales. En ese caso deberá mostrar:
      Los dos números son iguales.
 */

import java.util.Scanner;

public class Condicionales03 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero");
        numero1 = sc.nextInt();
        System.out.println("Dame otro numero");
        numero2 = sc.nextInt();

        if (numero1 < numero2) {
            System.out.println("El numero " + numero1 + " es menor");
        } else if (numero1 > numero2) {
            System.out.println("El numero " + numero2 + " es menor");
        } else {
            System.out.println("Los dos números son iguales");
        }
		/*
		if (numero1<numero2){
			System.out.println ("El numero " + numero1 +" es menor");
		} else {
			if (numero1 > numero2 ) {
				System.out.println ("El numero " + numero2 + " es menor");
			} else {
				System.out.println ("Los dos números son iguales");
			}
		}
		*/
    }
} 