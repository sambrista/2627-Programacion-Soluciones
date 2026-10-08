/*
 * Calculadora: Crea un programa que pida al usuario dos números (que pueden tener decimales)
 * y ofrezca al usuario cuatro opciones:
 * - Sumar
 * - Restar
 * - Multiplicar
 * - Dividir
 * Según lo que el usuario elija, mostrar la operación matemática que corresponde y su resultado.
 */
import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        double num1=0, num2=0;
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
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Error: opción no válida.");
        }
    }
}