/*
 Pide un número entero entre 1 y 10. Si el número introducido no está en dicho rango,
 vuelve a pedir el número. Cuando introduzca un valor válido, mostrará el número
 introducido y finalizará.
 */

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        int opcion = -1;

        while (opcion != 0) {
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
        }

        sc.close();
    }
}