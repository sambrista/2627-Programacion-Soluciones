/* Realiza un programa que solicite un número entero y muestre su
 tabla de multiplicar desde el 0 hasta el 12. Por ejemplo, si se
 introduce el número 4:*/

import java.util.Scanner;

public class For04 {
    public void main() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.print("Introduzca un número entero: ");
        numero = sc.nextInt();

        for (int i = 0; i < 13; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}