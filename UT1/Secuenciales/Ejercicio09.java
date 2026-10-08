/* 
  Calculadora 1.0: Algoritmo que lea dos números, calculando y
  escribiendo el valor de su suma, resta, producto, división.
*/

import java.util.Scanner;

public class Ejercicio09 {
    public static void main() {
        double numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número: ");
        numero2 = teclado.nextDouble();

        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
    }
}