/*
 * ========================================================================
 *  Condicionales02 - Número menor
 * ========================================================================
 *  Realiza un programa que pida dos números enteros y muestre cuál de ellos
 *  es el menor. Puedes suponer que los dos números introducidos siempre
 *  serán diferentes.
 * ========================================================================
 */

import java.util.Scanner;

public class Condicionales02 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número");
        numero1 = sc.nextInt();
        System.out.println("Dame otro número");
        numero2 = sc.nextInt();

        if (numero1 < numero2) {
            System.out.println("El número " + numero1 + " es menor");
        } else {
            System.out.println("El número " + numero2 + " es menor");
        }
    }
} 