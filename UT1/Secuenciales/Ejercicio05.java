/* Pide dos números enteros al usuario e imprime sus valores
   antes y después de intercambiarlos. */

import java.util.Scanner; // Necesario para usar Scanner

public class Ejercicio05 {
    public static void main() {
		int numero1, numero2, valorAntiguo;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer número");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = teclado.nextInt();
		
		System.out.println("El primer número es " + numero1 + " y el segundo es " + numero2);
		
		valorAntiguo = numero2;
		numero2 = numero1;
		numero1 = valorAntiguo;
		
		System.out.println("El primer número es " + numero1 + " y el segundo es " + numero2);
    }
}