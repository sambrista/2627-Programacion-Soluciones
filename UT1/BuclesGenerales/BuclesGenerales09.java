/*
 * ========================================================================
 *  BuclesGenerales09 - Menú
 * ========================================================================
 *  Programa que pida el radio de una circunferencia, y muestre el siguiente
 *  menú de opciones:
 *  1. Área de la circunferencia.
 *  2. Perímetro de la circunferencia.
 *  3. Cambiar valores
 *  0. Salir
 *
 *  Si el usuario introduce cualquier número que no sea 0, 1, 2 o 3, muestra
 *  un mensaje de error, y vuelve a mostrar las opciones.
 * ========================================================================
 */

import java.util.Scanner;

public class BuclesGenerales09 {
    public static void main() {
        final double PI = 3.1416;
        double radio = 0;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        radio = teclado.nextDouble();

        do {
            System.out.println("Menu");
            System.out.println("1. Área de la circunferencia");
            System.out.println("2. Perímetro de la circunferencia");
            System.out.println("3. Cambiar valores");
            System.out.println("");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Escoja una opción (0-3): ");
            opcion = teclado.nextInt();

            if (opcion != 0) {
                switch (opcion) {
                    case 1:
                        System.out.println("El área es " + (PI * radio * radio));
                        break;
                    case 2:
                        System.out.println("El perímetro es " + (2 * PI * radio));
                        break;
                    case 3:
                        System.out.print("Introduce el nuevo radio: ");
                        radio = teclado.nextDouble();
                        break;
                    default:
                        System.out.println("La opción no es correcta");
                        break;
                }
            }
        } while (opcion != 0);
    }
}