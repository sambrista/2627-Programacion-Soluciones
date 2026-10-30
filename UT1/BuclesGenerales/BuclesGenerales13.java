/*
 * ========================================================================
 *  BuclesGenerales13 - Pirámide 2
 * ========================================================================
 *  Pirámide centrada: Realiza un algoritmo que
 *  imprima la siguiente pirámide:
 *
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * ========================================================================
 */

public class BuclesGenerales13 {
    public static void main() {
        final int NUMERO_FILAS = 5;
        for (int fila = 1; fila <= NUMERO_FILAS; fila++) {
            for (int i = 1; i <= NUMERO_FILAS - fila; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (fila * 2) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}