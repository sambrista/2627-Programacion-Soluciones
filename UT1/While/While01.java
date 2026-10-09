/*
  Realiza un programa que solicite un número entero
  positivo y muestre todos los números desde dicho número
  hasta el 1, en orden descendente.
  
  Por ejemplo, si se introduce el número 6:
  6 5 4 3 2 1
*/

import java.util.Scanner;

public class While01 {
    public void main() {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un entero positivo: ");
        numero = teclado.nextInt();

        while (numero > 0) {
            System.out.print(numero + " ");
            numero--;
        }
    }
}