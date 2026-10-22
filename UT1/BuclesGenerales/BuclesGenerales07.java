/*
  Simulador de caja registradora: Pedir precios correctos (valores positivos)
  hasta que se introduzca un 0. Devolver el importe de la compra. 
*/

import java.util.Scanner;

public class BuclesGenerales07 {
    public static void main() {

        double importeTotal = 0, importe = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce un importe a sumar, o 0 para terminar: ");
            importe = teclado.nextDouble();
            if (importe > 0) {
                importeTotal += importe;
            } else if (importe < 0) {
                System.out.println("Debe introducir un importe positivo");
            }
        } while (importe != 0);

        System.out.println("El importe total es " + importeTotal);
    }
}