/*
  Simulador de caja registradora: Pedir precios correctos (valores positivos)
  hasta que se introduzca un 0. Devolver el importe de la compra.
  
  Mejorar el ejercicio anterior, para que cada vez que se pida un precio,
  pregunte si tiene descuento o no, si lo tiene, pide el porcentaje de 
  descuento (entre 0 y 100), se lo aplica y entonces lo añade a 
  la cuenta final. Imprimir una línea por cada precio, con su importe,
  el descuento y el precio final. Imprimir una línea de separación.
*/

import java.util.Scanner;

public class BuclesGenerales08 {
    public static void main() {

        double importeTotal = 0, importe = 0;
        double porcentajeDescuento = 0, importeFinal = 0;
        String tieneDescuento = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Simulador de Caja Registradora ===");
        System.out.println("Introduce precios (0 para terminar): ");

        do {
            System.out.print("Precio del producto: ");
            importe = teclado.nextDouble();
            if (importe > 0) {
                System.out.print("¿El producto tiene descuento? (s/n): ");
                tieneDescuento = teclado.next();
                if (tieneDescuento.equals("s")) {
                    System.out.print("Porcentaje de descuento): ");
                    porcentajeDescuento = teclado.nextDouble();
                    importeFinal = importe - importe * porcentajeDescuento / 100;
                } else {
                    porcentajeDescuento = 0;
                    importeFinal = importe;
                }
                System.out.println("Precio: " + importe + " € | Descuento " + porcentajeDescuento + " % | Final: " + importeFinal + " €");
                importeTotal += importeFinal;
            } else if (importe < 0) {
                System.out.println("Debe introducir un importe positivo");
            }
        } while (importe != 0);

        System.out.println("El importe total es " + importeTotal);
    }
}