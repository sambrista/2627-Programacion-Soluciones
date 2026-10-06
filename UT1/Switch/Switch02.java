/*
 * Calendario: Programa que pida un mes, mediante un número entero (1-12),
 * y almacene en una variable “días”, el número de días que tiene el mes (enero -> 31, febrero -> 28, …).
 *
 * Al finalizar el programa mostrará un mensaje diciendo el mes y los días que tiene
 * (solo se escribirá una sola línea para imprimir, al final del programa).
 */

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = 0;
        int mes = 0;

        System.out.print("Introduce un mes (1-12): ");
        mes = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;
            case 4, 6, 9, 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                System.out.println("Error: mes no válido.");
        }

        if (dias != 0) {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }
    }
}
