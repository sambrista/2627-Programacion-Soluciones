/*
 * ========================================================================
 *  Funciones12
 * ========================================================================
 *  Realiza una función que reciba un número entero y devuelva true si es
 *  primo y false si no lo es.
 * ========================================================================
 */

import java.util.Scanner;

public class Funciones12 {
    public void main() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        numero = sc.nextInt();
        System.out.print(numero + " ");
        if (esPrimo(numero)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }

    public boolean esPrimo(int numero) {
        boolean siEsPrimo = true;

        for (int i = 2; i < numero && siEsPrimo; i++) {
            if (numero % i == 0) {
                siEsPrimo = false;
            }
        }
        return siEsPrimo;
    }
}