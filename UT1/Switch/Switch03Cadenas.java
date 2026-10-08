/*
 * Calculadora: Crea un programa que pida al usuario dos números (que pueden tener decimales) y
 * ofrezca al usuario cuatro opciones:
 * - Sumar
 * - Restar
 * - Multiplicar
 * - Dividir
 * Según lo que el usuario elija, mostrar la operación matemática que corresponde y su resultado.
 */

import java.util.Scanner;

public class Switch03Cadenas {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, resultado = 0;
        String operacion = "";
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\nElige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                operacion = "+";
                break;
            case 2:
                resultado = num1 - num2;
                operacion = "-";
                break;
            case 3:
                resultado = num1 * num2;
                operacion = "*";
                break;
            case 4:
                resultado = num1 / num2;
                operacion = "/";
                break;
            default:
                System.out.println("Error: opción no válida.");
                opcion = 0;
        }
        if (opcion != 0) {
            System.out.println(num1 + " " + operacion + " " + num2 + " = " + resultado);
        }
    }
}