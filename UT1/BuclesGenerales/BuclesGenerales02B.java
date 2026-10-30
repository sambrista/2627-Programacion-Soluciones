/*
 * ========================================================================
 *  BuclesGenerales02B - Máximo y mínimo
 * ========================================================================
 *  Pedir al usuario 8 números y mostrar el mayor y el menor.
 * ========================================================================
 */

import java.util.Scanner;

// Solución que pide primero el número , y luego da las 8 vueltas restantes
public class BuclesGenerales02 {
    public static void main() {
        int numeroMayor = 0, numeroMenor = 0, numero = 0;
        Scanner teclado = new Scanner(System.in);

        // Primer número
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        numeroMayor = numeroMenor = numero;

        //for (int i=0; i<8; i++) {
        for (int i = 2; i <= 8; i++) {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            if (numero > numeroMayor) {
                numeroMayor = numero;
            } else if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        System.out.println("El número menor es :" + numeroMenor);
        System.out.println("El número mayor es :" + numeroMayor);

    }
}