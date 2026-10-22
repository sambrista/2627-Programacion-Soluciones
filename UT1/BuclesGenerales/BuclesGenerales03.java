// Factorial: Calcular el factorial de un número dado por el usuario.

import java.util.Scanner;

public class BuclesGenerales03 {
    public static void main() {
        int numero = 0, resultadoFactorial = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número N: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            resultadoFactorial *= i;
        }
        System.out.println("El factorial de " + numero + " es " + resultadoFactorial);
    }
}