/*
    Descuentos en una tienda de informática: Una tienda aplica un descuento al importe
    de una compra según la categoría del cliente:
    | Categoría | Tipo de cliente     | Descuento |
    |     A     |    Particular       |    5 %    |
    |     B     |    Estudiante       |    10 %   |
    |     C     |    Docente          |    15 %   |
    |     D     |    Centro educativo |    20 %   |

    Crea un programa que solicite el importe de la compra y la categoría del cliente.
    Utiliza switch para determinar el porcentaje de descuento.
     - El programa debe calcular y mostrar:
     - El importe original.
     - El porcentaje de descuento.
     - La cantidad descontada.
     - El importe final que debe pagar el cliente.

    Acepta la categoría tanto en mayúsculas como en minúsculas. Si el importe es negativo
     o la categoría no existe, muestra un mensaje de error.

    Ejemplo: Para una compra de 200 € y la categoría C, el descuento será de 30 € y el
    importe final será de 170 €.
*/

import java.util.Scanner;

public class Switch04 {
    public void main() {
        // descuento = -1 es un valor imposible
        double importe = 0, descuento = -1, importeDescuento = 0, importeFinal = 0;
        String categoria = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el importe: ");
        importe = teclado.nextDouble();
        teclado.nextLine(); // Consumimos el \n introducido al pulsar Enter.

        System.out.println("Categorías");
        System.out.println("A: Particular");
        System.out.println("B: Estudiante");
        System.out.println("C: Docente");
        System.out.println("D: Centro educativo");

        System.out.print("Indique la categoría (A-D): ");
        categoria = teclado.nextLine();

        switch (categoria) {
            case "A", "a":
                descuento = 5; // 5%
                break;
            case "B", "b":
                descuento = 10; // 10%
                break;
            case "C", "c":
                descuento = 15; // 15%
                break;
            case "D", "d":
                descuento = 20; // 20%
                break;
            default:
                System.out.println("Categoría incorrecta");
        }
        if (descuento != -1) { // Si descuento sigue siendo -1 es que la categoría es incorrecta.
            importeDescuento = importe * descuento / 100;
            importeFinal = importe - importeDescuento;
            System.out.println("Importe: " + importe);
            System.out.println("Descuento: " + importeDescuento + " (" + descuento + "%)");
            System.out.println("Importe final: " + importeFinal);
        }
    }
}