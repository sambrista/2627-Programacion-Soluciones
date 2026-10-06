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

public class Condicionales09 {
    public static void main(){
        int dia;
		double precio;
		boolean esSesion3D;
        Scanner teclado = new Scanner(System.in);
		esSesion3D = false;
        
        System.out.println("Una semana tiene 7 días, el sábado es el día 6 y el domingo día 7. Qué día quieres reservar (Del 1 al 5 es lunes a viernes, el 6 y 7 es sábado y domingo) ?");
        dia = teclado.nextInt();
        
        System.out.println("Qué sesión desea reservar? Normal (pulse 1) o 3D (pulse 2)");
        if (teclado.nextInt() == 2) {
			esSesion3D = true;
		}
        
        if (esSesion3D){
            precio = 10;
        } else {
            precio = 7;
        }
		if (dia >= 6){
            precio = precio + 2;
        }
        
        System.out.println("El precio final es " + precio + " euros");
    }
}