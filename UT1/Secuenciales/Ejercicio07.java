/*
 * Realiza un programa que pida el precio de un producto sin IVA
 * y el porcentaje de IVA que se le debe aplicar, expresado en
 * formato decimal (por ejemplo, 0.21 para un 21 %). Calcula y muestra:
 *   - El importe correspondiente al IVA.
 *   - El precio final del producto con IVA incluido.
 */ 
import java.util.Scanner;

public class Ejercicio07 {
    public static void main() {
		double precioSinIva, porcentajeIva, importeIva;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el precio base");
		precioSinIva = teclado.nextDouble();
		System.out.println("Introduce el porcentaje de IVA en formato decimal");
		porcentajeIva = teclado.nextDouble();

		importeIva = precioSinIva * porcentajeIva;

		System.out.println("El iva es " + importeIva + " euros, y el precio final es " + (precioSinIva + importeIva));
		
    }
}