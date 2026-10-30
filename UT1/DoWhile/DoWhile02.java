/*
 * ========================================================================
 *  DoWhile02
 * ========================================================================
 *  Realiza un programa que muestre un menú para modificar una variable cuyo
 *  valor inicial será 5. El menú tendrá las siguientes opciones:
 *      Opción 1: Suma 3 al valor de la variable.
 *      Opción 2: Multiplica por 2 el valor de la variable.
 *      Opción 0: Finaliza el programa.
 *  El programa mostrará el valor actualizado después de cada operación y
 *  repetirá el menú hasta que el usuario seleccione la opción 0.
 * ========================================================================
 */

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        int opcion;

        do {
            System.out.println("\nContador: " + contador);
            System.out.println("1. Restar 2");
            System.out.println("2. Multiplicar por 3");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    contador -= 2;
                    System.out.println("Contador: " + contador);
                    break;
                case 2:
                    contador *= 3;
                    System.out.println("Contador: " + contador);
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);
    }
}