/*
  Cajero automático: Pedir un número y mostrar cómo se descompone
  en billetes de 50, 20, 10 y 5 (simulación de un cajero).
  
  El importe introducido sólo será admitido si es divisible por 5
  (por ejemplo 232 euros, no es válido. 235 sí).
  Si se introduce una cantidad no válida volverá a pedirla,
  indicando el error.

*/

import java.util.Scanner;

public class BuclesGenerales06 {
    public static void main() {
        int importe = 0, cantidadBilletes = 0;
        boolean esPrimo = true;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce un importe: ");
            importe = teclado.nextInt();
            if (importe % 5 != 0) {
                System.out.println("El importe debe ser divisible entre 5");
            }
        } while (importe % 5 != 0);
        // Billetes de 50
        cantidadBilletes = importe / 50;
        System.out.println(cantidadBilletes + " billetes de 50");
        importe -= cantidadBilletes * 50;
        // Billetes de 20
        cantidadBilletes = importe / 20;
        System.out.println(cantidadBilletes + " billetes de 20");
        importe -= cantidadBilletes * 20;
        // Billetes de 10
        cantidadBilletes = importe / 10;
        System.out.println(cantidadBilletes + " billetes de 10");
        importe -= cantidadBilletes * 10;
        // Billetes de 5
        cantidadBilletes = importe / 5;
        System.out.println(cantidadBilletes + " billetes de 5");
    }
}