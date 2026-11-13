/*
 * ========================================================================
 *  Arrays09
 * ========================================================================
 * Realizar un método que busque un elemento dentro de un array de enteros y
 * devuelva su posición; si el elemento no se encuentra, devuelve -1. Realiza
 * un programa para probarlo.
 * ========================================================================
 */

public class Arrays09 {
    void main() {
		int[] array={8,9,6,4,3,6};
		System.out.println("Buscar elemento repetido (6): " + buscarElemento(array, 6));
		System.out.println("Buscar elemento inexistente (5): " + buscarElemento(array, 5));
	}

	public int buscarElemento(int[] array, int elementoBuscado){
		int posicion=-1;
		for (int i=0; i<array.length && posicion==-1 ;i++){
				if(array[i]==elementoBuscado){
					posicion=i;
				}
		}
		return posicion;
	}
}
