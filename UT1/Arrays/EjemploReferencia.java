/*
 * ========================================================================
 *  EjemploReferencia
 * ========================================================================
 *  Ejemplo para ilustrar cómo se pasan los datos a una función:
 *    - Los tipos primitivos (int, double, char...) se pasan por valor: la
 *      función recibe una copia, y si la modifica el original no cambia.
 *    - Los arrays se pasan por referencia: la función recibe la dirección
 *      del mismo array, y si modifica sus elementos el cambio se ve
 *      también fuera de la función.
 *    - Aunque un array se pase por referencia, si la función le asigna un
 *      array nuevo (new), solo cambia su referencia local: el array
 *      original de quien llama sigue igual.
 * ========================================================================
 */

public class EjemploReferencia {
	public void main() {
		int numero = 20;
		int[] array;
		array = new int[5];

		// Paso por valor: resetear recibe una copia de numero
		resetear(numero);
		// Imprime 20: la variable numero de main no se ha modificado
		System.out.println(numero);
		
		// Paso por referencia: iniciarArray recibe el mismo array de main
		iniciarArray(array);
		// Imprime 1: la función ha modificado el array original
		System.out.println(array[0]);

		// Ponemos un valor distinto para comprobar si resetearArray lo cambia
		array[0] = 10;
		// resetearArray recibe la referencia al array, pero solo la usa para
		// apuntar a un array nuevo (ver la función más abajo)
		resetearArray(array);
		// Imprime 10: el array original de main no ha cambiado
		System.out.println(array[0]);
	}
	
	// Solo modifica su copia local del parámetro, no afecta a quien llama
	public void resetear(int numero) {
		numero = 0;
	}

	// Modifica el contenido del array recibido, y el cambio se mantiene
	// al terminar la función
	public void iniciarArray(int[] array) {
		array[0] = 1;
	}

	// No consigue resetear el array de main: la asignación con new hace que
	// el parámetro local apunte a un array nuevo (lleno de ceros), pero la
	// variable array de main sigue apuntando al array original.
	// Para resetearlo habría que recorrerlo y poner a 0 cada elemento.
	public void resetearArray(int[] array) {
		array = new int[array.length];
	}
}
