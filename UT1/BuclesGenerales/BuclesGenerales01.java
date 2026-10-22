/*
  Suma de pares e impares: Pedir al usuario un número N 
  y mostrar la suma de los pares y de los impares hasta N.
*/

import java.util.Scanner;

public class BuclesGenerales01 {
    public static void main() {
        int n, sumaPares = 0, sumaImpares = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número N: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // es par
                sumaPares += i;
            } else { // es impar
                sumaImpares += i;
            }
        }
        System.out.println("La suma de todos los pares es " + sumaPares);
        System.out.println("La suma de todos los impares es " + sumaImpares);
    }
}