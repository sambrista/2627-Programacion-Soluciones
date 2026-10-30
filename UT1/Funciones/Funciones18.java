/*
 * ========================================================================
 *  Funciones18
 * ========================================================================
 *  Realiza una función que reciba un número entero y devuelva cuántos
 *  dígitos tiene.
 * ========================================================================
 */

import java.util.Scanner;

public class Funciones18 {
	public void main() {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		numero = sc.nextInt();
		System.out.println("Son " + cantidadDigitos(numero) + " digitos");
	}
	
	public int cantidadDigitos(int numero){
		int digitos = 1;
		while (valorAbsoluto(numero) >= 10) {
			numero = numero / 10;
			digitos++;
		}
		return digitos;
	}
	
	public int valorAbsoluto(int numero) {
        int resultado = numero;
        if (numero < 0) {
            resultado *= -1;
        }
        return resultado;
    }
}