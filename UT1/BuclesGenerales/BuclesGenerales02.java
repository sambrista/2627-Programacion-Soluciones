/*
 * ========================================================================
 *  BuclesGenerales02 - Máximo y mínimo
 * ========================================================================
 *  Pedir al usuario 8 números y mostrar el mayor y el menor.
 * ========================================================================
 */

import java.util.Scanner;

public class BuclesGenerales02 {
    public static void main() {

        final int CANTIDAD_NUMEROS = 8; // Variable constante, su valor no cambia

        int numeroMayor = 0, numeroMenor = 0, numero = 0;
        Scanner teclado = new Scanner(System.in);
        //for (int i=0; i<8; i++) {
        for (int i = 1; i <= CANTIDAD_NUMEROS; i++) {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();
            if (i == 1) {
                numeroMayor = numeroMenor = numero;
            } else {
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                } else if (numero < numeroMenor) {
                    numeroMenor = numero;
                }
            }
        }
        System.out.println("El número menor es :" + numeroMenor);
        System.out.println("El número mayor es :" + numeroMayor);

    }
}