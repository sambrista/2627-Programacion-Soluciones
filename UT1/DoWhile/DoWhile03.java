/*
    Pide un número entero entre 1 y 10. Si el número introducido no está en dicho rango, vuelve a
    pedir el número. Cuando introduzca un valor válido, mostrará el número introducido y finalizará.
 */

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.print("Introduce un número entre 1 y 10: ");

            numero = sc.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("El número introducido no está en el rango válido. Inténtalo de nuevo.");
            }
        } while (numero < 1 || numero > 10);

        System.out.println("Número introducido: " + numero);
    }
}