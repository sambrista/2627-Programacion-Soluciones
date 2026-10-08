/*
 * Precio de una entrada: Un cine tiene dos tipos de sesiones: normal y 3D.
 * El precio de la entrada depende del tipo de sesión:
 * - Sesión normal → 7 €.
 * - Sesión 3D → 10 €.
 * Además: Si el día es sábado o domingo, se añaden 2 € al precio de la entrada.
 * Realiza un programa que pida el día de la semana y el tipo de sesión.
 * El programa deberá calcular y mostrar el precio final de la entrada.
 */

import java.util.Scanner;

public class Condicionales09Justin {
    public static void main() {
        int dia, sesion, precio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Una semana tiene 7 días, el sábado es el día 6 y el domingo día 7. Qué día quieres reservar (Del 1 al 5 es lunes a viernes, el 6 y 7 es sábado y domingo) ?");
        dia = teclado.nextInt();

        System.out.println("Qué sesión desea reservar? Normal (pulse 1) o 3D (pulse 2)");
        sesion = teclado.nextInt();

        if (dia >= 6 && sesion == 1) {
            precio = 7 + 2;

        } else if (dia >= 6 && sesion == 2) {
            precio = 10 + 2;

        } else if (dia < 6 && sesion == 1) {
            precio = 7;

        } else {
            precio = 10;
        }

        System.out.println("El precio final es " + precio + " euros");
    }
}